package com.company;

public class Bear extends Animal {
    private String name;
    private float weight;
    private int furLength;

    public Bear(int id, String name, float weight, int furLength) {
        super(id, name, weight);
        this.weight = weight;
        this.name = name;
        this.furLength = furLength;
    }

    @Override
    public void introduce() {
        System.out.println("My name is " + name + "." + " I weight " + weight + " kg and my fur length is " + furLength + ".");
    }

    public int getFurLength() {
        return furLength;
    }

    public void setFurLength(int furLength) {
        this.furLength = furLength;
    }

    @Override
    public String toString() {
        return "bear";
    }
}
