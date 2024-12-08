package org.marouanedbibih.grpc.repository;

import org.marouanedbibih.grpc.models.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {

}
