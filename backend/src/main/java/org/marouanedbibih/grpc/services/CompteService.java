package org.marouanedbibih.grpc.services;

import java.util.List;

import org.marouanedbibih.grpc.dto.CompteDTO;
import org.marouanedbibih.grpc.dto.SoldeStatsDTO;
import org.marouanedbibih.grpc.models.Compte;
import org.marouanedbibih.grpc.repository.CompteRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class CompteService {

    private final CompteRepository repository;

    // Service to fetch list of comptes
    public List<CompteDTO> fetchList() {
        return repository.findAll().stream()
                .map((compte) -> this.mapToDTO(compte))
                .toList();

    }

    // Service to fetch compte by id
    public CompteDTO fetchById(Long id) {
        return repository.findById(id)
                .map((compte) -> this.mapToDTO(compte))
                .orElseThrow(() -> {
                    log.error("Compte not found with id: {}", id);
                    return new RuntimeException("Compte not fount with id : " + id);
                });

    }

    // Service to create compte
    public CompteDTO create(CompteDTO compteDTO) {
        Compte compte = this.mapToEntity(compteDTO);
        compte = repository.save(compte);
        return this.mapToDTO(compte);
    }

    // Service to update compte
    public CompteDTO update(CompteDTO dto, Long id) {
        return repository.findById(id)
                .map((cmpt) -> {
                    cmpt.setDateCreation(dto.getDateCreation());
                    cmpt.setSolde(dto.getSolde());
                    cmpt.setType(dto.getType());
                    cmpt = repository.save(cmpt);
                    return this.mapToDTO(cmpt);

                })
                .orElseThrow(() -> {
                    log.error("Compte not found with id: {}", id);
                    return new RuntimeException("Compte not fount with id : " + id);
                });
    }

    // Service to delete a compte
    public void delete(Long id) {
        repository.findById(id).ifPresentOrElse(
                compte -> repository.deleteById(id), // Delete the compte if found
                () -> {
                    log.error("Compte not found with id: {}", id);
                    throw new RuntimeException("Compte not found with id: " + id);
                });
    }

    private CompteDTO mapToDTO(Compte entity) {
        return CompteDTO.builder()
                .id(entity.getId())
                .dateCreation(entity.getDateCreation())
                .type(entity.getType())
                .solde(entity.getSolde())
                .build();

    }

    // Service method to calculate total solde statistics
    public SoldeStatsDTO calculateTotalSolde() {
        List<Compte> comptes = repository.findAll(); // Fetch all comptes from the database
        int count = comptes.size();
        float sum = (float) comptes.stream()
                .mapToDouble(Compte::getSolde)
                .sum();
        float average = count > 0 ? sum / count : 0;

        return new SoldeStatsDTO(count, sum, average); // Return computed statistics as a DTO
    }

    private Compte mapToEntity(CompteDTO dto) {
        return Compte.builder()
                .dateCreation(dto.getDateCreation()) // Parse the string to a Date
                .type(dto.getType())
                .solde(dto.getSolde())
                .build();
    }

}
