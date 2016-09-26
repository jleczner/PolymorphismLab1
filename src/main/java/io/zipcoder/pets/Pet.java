package io.zipcoder.pets;

/**
 * Created by jonathanleczner on 9/26/16.
 */
public class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        return;
    }
}
