package com.paulmarcelinbejan.training.stackoverflow.java.Q1;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

class HowToUseReflectionInJavaToDynamicallyCreateClassesTest {

    Map<String, String> dictionary = new HashMap<>();
    
    List<SubClass> subClasses;
    
    Map<String, BiConsumer<HoldingClass, SubClass>> actions = new HashMap<>();
    
    @BeforeEach
    void setUp() throws IOException {
        
        actions.put("one", (holdingClass, subClass) -> holdingClass.setOne(subClass));
        actions.put("two", (holdingClass, subClass) -> holdingClass.setTwo(subClass));
        actions.put("three", (holdingClass, subClass) -> holdingClass.setThree(subClass));
        actions.put("four", (holdingClass, subClass) -> holdingClass.setFour(subClass));
        
        dictionary.put("blue", "two");
        dictionary.put("black", "one");
        dictionary.put("red", "three");
        dictionary.put("green", "four");
        
        subClasses = readListFromFile(JSON_FILE, SubClass.class);
    }
    
    @Test
    void test() {
        HoldingClass holdingClass = new HoldingClass();

        for(SubClass subClass : subClasses) {
            String dictionaryValue = dictionary.get(subClass.getIdentifier());
            actions.get(dictionaryValue).accept(holdingClass, subClass);
        }
        
        assertNotNull(holdingClass.getOne());
        assertNotNull(holdingClass.getTwo());
        assertNotNull(holdingClass.getThree());
        assertNotNull(holdingClass.getFour());
    }
    
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    
    private static final File JSON_FILE = new File("src/test/resources/SubClasses.json");
    
    private static <R> List<R> readListFromFile(final File file, final Class<R> contentClass) throws IOException {
        return OBJECT_MAPPER.readValue(file, OBJECT_MAPPER.getTypeFactory().constructCollectionType(ArrayList.class, contentClass));
    }
    
}