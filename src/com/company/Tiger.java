package com.company;

public class Tiger extends Animal {
    private int clawLength;
    private String name;
    private float weight;

    public Tiger(int id, String name, float weight, int clawLength) {
        super(id, name, weight);
        this.name = name;
        this.weight = weight;
        this.clawLength = clawLength;
    }

    @Override
    public void introduce() {
        System.out.println("My name is " + name + "." + " I weight " + weight + " kg and my claw length is " + clawLength + ".");
    }

    public int getClawLength() {
        return clawLength;
    }

    public void setClawLength(int clawLength) {
        this.clawLength = clawLength;
    }

    @Override
    public String toString() {
        return "tiger";
    }
}
