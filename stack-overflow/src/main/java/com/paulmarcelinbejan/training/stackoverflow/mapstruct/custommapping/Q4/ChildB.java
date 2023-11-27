package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q4;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ChildB extends Parent {

	private String stringOnChildB;
	
}
