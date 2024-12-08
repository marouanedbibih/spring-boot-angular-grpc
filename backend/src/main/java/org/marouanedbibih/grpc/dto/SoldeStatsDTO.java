package org.marouanedbibih.grpc.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SoldeStatsDTO {
    private int count;
    private float sum;
    private float average;

}
