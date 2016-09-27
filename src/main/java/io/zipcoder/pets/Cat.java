package io.zipcoder.pets;

/**
 * Created by jonathanleczner on 9/26/16.
 */
public class Cat extends Pet {
    private String name;

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        System.out.println("meow");
        return "meow";
    }
}
