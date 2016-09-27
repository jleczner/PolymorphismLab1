package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jonathanleczner on 9/26/16.
 */
public class Input {
    Scanner s;
    List<String> inputs;
    List<Pet> pets;

    public Input() {
        s = new Scanner(System.in);
        inputs = new ArrayList<>();
        pets = new ArrayList<>();
    }

    public void runProgram() {
        int amount = getHowManyPets();
        getWhatKind(amount);
        getPetNames(amount);
        printPets();
    }

    public String getInput() {
        return s.next();
    }

    private void askHowManyPets() {
        System.out.println("How many pets do you have?");
    }

    private int getHowManyPets() {
        askHowManyPets();
        inputs.add(getInput());
        return Integer.valueOf(inputs.get(0));
    }

    private void askWhatKind() {
        System.out.println("What kind of pets are they?");
    }

    private void getWhatKind(int amount) {
        askWhatKind();
        int petsSpecified = 0;
        while (petsSpecified < amount) {
            inputs.add(getInput());
            petsSpecified++;
        }
    }

    private void askPetNames() {
        System.out.println("What are their names?");
    }

    private void getPetNames(int amount) {
        askPetNames();
        int petsNamed = 0;
        while (petsNamed < amount) {
            inputs.add(getInput());
            petsNamed++;
        }
    }

    private void printPets() {
        for (Pet p : pets) {
            System.out.println(p.getClass().getName() + "\n" +
                                p.getName() + "\n" +
                                p.speak());
        }
    }
}
