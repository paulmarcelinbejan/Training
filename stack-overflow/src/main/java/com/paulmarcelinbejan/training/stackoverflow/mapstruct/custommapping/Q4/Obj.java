package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q4;

import java.util.Map;

import lombok.Data;

@Data
public class Obj {

	Map<String, ChildA> propA;
	Map<String, ChildB> propB;

	public Obj setPropA(Map<String, ChildA> newMap) {
		propA = newMap;
		return this;
	}

	public Obj setPropB(Map<String, ChildB> newMap) {
		propB = newMap;
		return this;
	}
	
	Obj putPropA(String key, ChildA a) {
		propA.put(key, a);
		return this;
	}

	Obj putPropB(String key, ChildB b) { 
		propB.put(key, b);
		return this;
	}

}