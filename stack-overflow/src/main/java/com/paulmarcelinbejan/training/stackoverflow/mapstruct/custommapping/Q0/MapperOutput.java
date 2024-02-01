package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q0;

public interface MapperOutput<DOMAIN, RESPONSE> {

	RESPONSE toResponse(DOMAIN domain);
	
}