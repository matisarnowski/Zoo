package com.company;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[4];
        Bear bear = new Bear(1, "Yogi", 200.0f, 40);
        Tiger tiger = new Tiger(2, "Jataka", 150.0f, 20);
        Wolf wolf = new Wolf(3, "Howler", 70.0f, 40);
        Dog dog = new Dog(4, "Scooby", 30.0f);

        animals[0] = bear;
        animals[1] = tiger;
        animals[2] = wolf;
        animals[3] = dog;

        for (int a = 0; a < 4; a++) {
            System.out.print(animals[a].getId() + " : I am a " + animals[a] + ". ");
            animals[a].introduce();
        }

        Animal[] howlers = new Animal[2];

        howlers[0] = wolf;
        howlers[1] = dog;

        System.out.print("My name is " + howlers[0].getName() + " and I am barking: ");
        wolf.bark();
        System.out.print("My name is " + howlers[1].getName() + " and I am barking: ");
        dog.bark();
        dog.sitPretty();
    }

}
