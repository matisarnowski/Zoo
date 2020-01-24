package com.company;

public interface Canine {
    default void bark(){
        System.out.println("bark bark bark");
    };
}
