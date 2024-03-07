package com.test;

import java.util.Optional;

public class ExistingClass {
    public static void main(String[] args) {
        ExistingClass testClass = new ExistingClass();
        testClass.doProcessing();
    }

    public void doProcessing(){
        /*Optional<String> newProcessingRequired = Optional.ofNullable(System.getProperty("newProcessing"));
        if (newProcessingRequired.filter(t -> t.equals("true")).isPresent())*/
        /*String newProcessingRequired = System.getProperty("newProcessing");
        if(newProcessingRequired != null && newProcessingRequired.equals("true"))*/
        doNewProcessing();
    }

    private void doNewProcessing(){
        System.out.println("New processing done");
    }
}
