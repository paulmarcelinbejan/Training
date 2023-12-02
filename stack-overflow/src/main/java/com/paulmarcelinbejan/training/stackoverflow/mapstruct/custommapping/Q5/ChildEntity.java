package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q5;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class ChildEntity extends BaseEntity {
	private String childName;
}
