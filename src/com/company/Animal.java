package com.company;

public class Animal {
    private int id;
    private String name;
    private float weight;

    public Animal(int id, String name, float weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public void introduce(){
        System.out.println("My name is " + name + ".");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
