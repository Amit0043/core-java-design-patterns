package com.java.annotprac;

import java.lang.reflect.Method;

public class AnnotMain {
    public static void main(String[] args) throws NoSuchMethodException {
        Currency currency = new Currency();
        currency.getValue();
        Method method = currency.getClass().getMethod("getValue");
        NumberAnnotation annotation = method.getAnnotation(NumberAnnotation.class);
        System.out.println(annotation.value());
    }
}

