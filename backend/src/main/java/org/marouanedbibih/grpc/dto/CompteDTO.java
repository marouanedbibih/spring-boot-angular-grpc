package org.marouanedbibih.grpc.dto;

import java.util.Date;

import org.marouanedbibih.grpc.models.TypeCompte;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompteDTO {

    private Long id;
    private float solde;
    private Date dateCreation;
    private TypeCompte type;
}
