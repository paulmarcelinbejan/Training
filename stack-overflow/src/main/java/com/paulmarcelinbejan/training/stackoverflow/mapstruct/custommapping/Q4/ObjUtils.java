package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q4;

import java.util.Map;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ObjUtils {

	public static Obj merge(Obj ob1, Obj ob2) {
		return new Obj()
				.setPropA(mergeMaps(ob1.getPropA(), ob2.getPropA()))
				.setPropB(mergeMaps(ob1.getPropB(), ob2.getPropB()));
	}

	public static <T> Map<String, T> mergeMaps(Map<String, T> aMap, Map<String, T> bMap) {
		aMap.putAll(bMap);
		return aMap;
	}

}
