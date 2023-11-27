package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q4;

import java.util.HashMap;
import java.util.Map;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 * 
 * https://stackoverflow.com/questions/77515278/merge-objects-maps-with-mapstruct/77560278#77560278
 *
 */
@Mapper
public interface ObjMapper {

	ObjMapper INSTANCE = Mappers.getMapper(ObjMapper.class);
	
	Obj merge(Obj source, @MappingTarget Obj target);
	
    default <T> void mergeMaps(Map<String, T> source, @MappingTarget Map<String, T> target) {
        if ( source == null ) {
            return;
        }
        if ( target == null ) {
            target = new HashMap<>();
        }
        target.putAll(source);
    }
	
}
