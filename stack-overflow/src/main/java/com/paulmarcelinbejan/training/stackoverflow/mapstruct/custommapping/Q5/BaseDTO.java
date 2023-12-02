package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q5;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class BaseDTO {
  private Long id;
  private FullNameDTO name;
} 
