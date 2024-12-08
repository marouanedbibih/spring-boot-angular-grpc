package org.marouanedbibih.grpc.controllers;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import org.marouanedbibih.grpc.dto.CompteDTO;
import org.marouanedbibih.grpc.dto.SoldeStatsDTO;
import org.marouanedbibih.grpc.services.CompteService;
import org.marouanedbibih.grpc.stubs.*;

import com.google.protobuf.Empty;

@GrpcService
@RequiredArgsConstructor
public class CompteServiceImpl extends CompteServiceGrpc.CompteServiceImplBase {

    private final CompteService service;

    @Override
    public void allComptes(GetAllComptesREQ request, StreamObserver<GetAllComptesRES> responseObserver) {
        try {
            // Map the fetched list of DTOs to gRPC Compte messages
            List<Compte> comptes = service.fetchList().stream()
                    .map(dto -> Compte.newBuilder()
                            .setId(dto.getId())
                            .setSolde(dto.getSolde())
                            .setDateCreation(dto.getDateCreation().toString())
                            .setType(TypeCompte.valueOf(dto.getType().toString()))
                            .build())
                    .collect(Collectors.toList());
            GetAllComptesRES res = GetAllComptesRES.newBuilder()
                    .addAllComptes(comptes)
                    .build();
            responseObserver.onNext(res);
            responseObserver.onCompleted();

        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void compteById(GetCompteByIdREQ request,
            StreamObserver<GetCompteByIdRES> responseObserver) {
        try {
            CompteDTO dto = service.fetchById(request.getId());
            Compte compte = Compte.newBuilder()
                    .setId(dto.getId())
                    .setSolde(dto.getSolde())
                    .setDateCreation(dto.getDateCreation().toString())
                    .setType(TypeCompte.valueOf(dto.getType().toString()))
                    .build();

            GetCompteByIdRES res = GetCompteByIdRES.newBuilder()
                    .setCompte(compte)
                    .build();
            responseObserver.onNext(res);
            responseObserver.onCompleted();

        } catch (Exception e) {
            responseObserver.onError(e);
        }

    }

    @Override
    public void saveCompte(SaveCompteREQ request,
            StreamObserver<SaveCompteRES> responseObserver) {
        try {
            // Map the request fields to the DTO
            CompteDTO dto = CompteDTO.builder()
                    .dateCreation(this.parseDate(request.getCompte().getDateCreation()))
                    .solde(request.getCompte().getSolde())
                    .type(org.marouanedbibih.grpc.models.TypeCompte.valueOf(request.getCompte().getType().toString()))
                    .build();
            // Call the service to save the DTO
            dto = service.create(dto);

            // Map the saved entity back to the response
            SaveCompteRES response = SaveCompteRES.newBuilder()
                    .setCompte(Compte.newBuilder()
                            .setId(dto.getId())
                            .setSolde(dto.getSolde())
                            .setDateCreation(dto.getDateCreation().toString())
                            .setType(TypeCompte.valueOf(dto.getType().toString()))
                            .build())
                    .build();

            // Send the response
            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (Exception e) {
            // Handle exception and send error response
            responseObserver.onError(e);
        }
    }

    // Update Compte
    @Override
    public void updateCompte(UpdateCompteREQ request,
            StreamObserver<UpdateCompteRES> responseObserver) {
        try {
            // Map the request fields to the DTO
            CompteDTO dto = CompteDTO.builder()
                    .id(request.getCompte().getId())
                    .dateCreation(this.parseDate(request.getCompte().getDateCreation()))
                    .solde(request.getCompte().getSolde())
                    .type(org.marouanedbibih.grpc.models.TypeCompte.valueOf(request.getCompte().getType().toString()))
                    .build();

            dto = service.update(dto, request.getCompte().getId());
            // Map the saved entity back to the response
            UpdateCompteRES res = UpdateCompteRES.newBuilder()
                    .setCompte(Compte.newBuilder()
                            .setId(dto.getId())
                            .setSolde(dto.getSolde())
                            .setDateCreation(dto.getDateCreation().toString())
                            .setType(TypeCompte.valueOf(dto.getType().toString()))
                            .build())
                    .build();

            // Send the response
            responseObserver.onNext(res);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    // Delete compte
    @Override
    public void deleteCompte(DeleteCompteREQ request,
            StreamObserver<Empty> responseObserver) {
        try {
            service.delete(request.getId());
            // Send an empty response upon successful deletion
            responseObserver.onNext(Empty.newBuilder().build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    // Helper method to parse the date string into a Date object
    private Date parseDate(String dateString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Change format as needed
        return sdf.parse(dateString);
    }

    @Override
    public void totalSolde(GetTotalSoldeREQ request, StreamObserver<GetTotalSoldeRES> responseObserver) {
        try {
            // Call the service layer to compute total solde stats
            SoldeStatsDTO statsDTO = service.calculateTotalSolde();

            // Map SoldeStatsDTO to gRPC SoldeStats
            SoldeStats stats = SoldeStats.newBuilder()
                    .setCount(statsDTO.getCount())
                    .setSum(statsDTO.getSum())
                    .setAverage(statsDTO.getAverage())
                    .build();

            // Build and send the gRPC response
            GetTotalSoldeRES response = GetTotalSoldeRES.newBuilder()
                    .setStats(stats)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (Exception e) {
            // Handle errors and send an appropriate error response
            responseObserver.onError(e);
        }
    }

}