package main.java.dogs;

public class Dog {
    private String name;
    private AnimalNoise woof = noise -> System.out.println(getName() + " says " + noise);

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void sayWoof(){
        woof.makeNoise("Woof!");
    }
}