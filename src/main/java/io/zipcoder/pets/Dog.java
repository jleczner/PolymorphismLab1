package io.zipcoder.pets;

/**
 * Created by jonathanleczner on 9/26/16.
 */
public class Dog extends Pet {
    private String name;

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        System.out.println("bark");
        return "bark";
    }
}
