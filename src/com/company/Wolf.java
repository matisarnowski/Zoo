package com.company;

public class Wolf extends Animal implements Canine{
    private int fangLength;
    private String name;
    private float weight;

    public Wolf(int id, String name, float weight, int fangLength) {
        super(id, name, weight);
        this.weight = weight;
        this.name = name;
        this.fangLength = fangLength;
    }

    @Override
    public void introduce() {
        System.out.println("My name is " + name + "." + " I weight " + weight + " kg and my fang length is " + fangLength + ".");
    }

    @Override
    public void bark() {
        System.out.println("BARK BARK BARK");
    }

    @Override
    public String toString() {
        return "wolf";
    }
}
