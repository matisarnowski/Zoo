package com.company;

public class Dog extends Animal implements Canine{
    private String name;
    private float weight;

    public Dog(int id, String name, float weight) {
        super(id, name, weight);
        this.weight = weight;
        this.name = name;
    }

    @Override
    public void introduce() {
        System.out.println("My name is " + name + "." + " I weight " + weight + " kg.");
    }

    public void sitPretty(){
        System.out.println(getName() + " sits pretty. ");
    }

    @Override
    public String toString() {
        return "dog";
    }
}
