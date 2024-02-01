package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q0;

public interface IdentityMapperOutput<T> extends MapperOutput<T, T> {

	@Override
	default T toResponse(T domain) {
		return domain;
	}
	
}
