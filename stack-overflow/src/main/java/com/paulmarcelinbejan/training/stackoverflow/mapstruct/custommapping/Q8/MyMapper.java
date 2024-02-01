package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface MyMapper {

	MyMapper INSTANCE = Mappers.getMapper(MyMapper.class);

	default List<Parent> map(List<Flattened> flattenedList) {
		Map<String, List<Flattened>> groupedFlattened = flattenedList.stream()
				.collect(Collectors.groupingBy(Flattened::getParentId));

		return groupedFlattened.entrySet().stream().map(entry -> {
			List<Flattened> flattenedChildren = entry.getValue();
			return mapFlattenedToParent(flattenedChildren.get(0), flattenedChildren);
		}).collect(Collectors.toList());
	}

	@Named("mapFlattenedToParent")
	@Mapping(target = "children", source = "flattenedChildren", qualifiedByName = "mapFlattenedToChildren")
	Parent mapFlattenedToParent(Flattened flattened, List<Flattened> flattenedChildren);

	@Named("mapFlattenedToChildren")
	@IterableMapping(qualifiedByName = "mapFlattenedToChild")
	List<Child> mapFlattenedToChildren(List<Flattened> flattenedList);

	@Named("mapFlattenedToChild")
	Child mapFlattenedToChild(Flattened flattened);

}
