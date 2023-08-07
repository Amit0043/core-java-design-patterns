package com.java.annotprac;

public class Currency {

    @NumberAnnotation(value=20)
    public void getValue(){
        System.out.println("From number annotate method");
    }
}
