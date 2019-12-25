package main.java.dogs;

import java.util.ArrayList;
import java.util.List;

public class Pack {
    private List<Dog> pack = new ArrayList<>();

    public void addToPack() {
        Dog dogOne = new Dog("Rex");
        Dog dogTwo = new Dog("Jack");
        Dog dogThree = new Dog("Mick");
        Dog dogFour = new Dog("Bob");
        Dog dogFive = new Dog("Rich");

        pack.add(dogOne);
        pack.add(dogTwo);
        pack.add(dogFour);
        pack.add(dogFive);
        pack.add(dogThree);
    }

    public void sayWoof() {
        addToPack();
        for (Dog dog : pack) {
            dog.sayWoof();
        }
    }
}