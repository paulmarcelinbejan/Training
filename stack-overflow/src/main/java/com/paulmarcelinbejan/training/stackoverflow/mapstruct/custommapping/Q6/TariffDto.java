package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TariffDto {

	private String id;

	private EnergyMixDto energyMix;

}
