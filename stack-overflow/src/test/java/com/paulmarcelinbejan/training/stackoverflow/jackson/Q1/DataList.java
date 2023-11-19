package com.paulmarcelinbejan.training.stackoverflow.jackson.Q1;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "ListOfUsers")
public class DataList extends ArrayList<DataTest> {
   private static final long serialVersionUID = 7112953850878936075L;

   public DataList() { }

}
