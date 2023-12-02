package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q5;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class BaseEntity {
  private Long id;
  private String firstName;
  private String lastName;
}