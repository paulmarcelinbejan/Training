package com.paulmarcelinbejan.training.stackoverflow.jackson.Q1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonTypeName("User")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT)
@Builder
public class DataTest {
	
   @JsonProperty("ID")
   private int userID;

   @JsonProperty("Name")
   private String userName;

   @JsonProperty("Address")
   private String streetAddress;

   @JsonProperty("City")
   private String theCity;

}