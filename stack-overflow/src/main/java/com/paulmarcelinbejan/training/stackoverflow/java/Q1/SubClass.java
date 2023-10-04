package com.paulmarcelinbejan.training.stackoverflow.java.Q1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubClass {
    
    private String identifier;
    private String seqId;
    private int questNo;
    boolean answerText;
    private int invoId = 1;
    
}
