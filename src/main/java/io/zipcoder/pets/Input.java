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
        getHowManyPets();
        getWhatKind();
        getPetNames();
        makePets();
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

    private void getWhatKind() {
        askWhatKind();
        int amount = Integer.valueOf(inputs.get(0));
        int petsSpecified = 0;
        while (petsSpecified < amount) {
            inputs.add(getInput());
            petsSpecified++;
        }
    }

    private void askPetNames() {
        System.out.println("What are their names?");
    }

    private void getPetNames() {
        askPetNames();
        int amount = Integer.valueOf(inputs.get(0));
        int petsNamed = 0;
        while (petsNamed < amount) {
            inputs.add(getInput());
            petsNamed++;
        }
    }

    private void makePets() {
        int amount = Integer.valueOf(inputs.get(0));
        for (int i = 1; i <= amount; i++) {
            String name = inputs.get(i+amount);
            String type = inputs.get(i).toLowerCase();
            switch (type) {
                case "cat":
                    pets.add(new Cat(name));
                    break;
                case "dog":
                    pets.add(new Dog(name));
                    break;
                case "guineapig":
                    pets.add(new GuineaPig(name));
                    break;
                default:
                    System.out.println(type + " isn't real to me.");
                    break;
            }
        }
    }

    private void printPets() {
        for (Pet p : pets) {
            String output = "";
            output += p.getClass().getSimpleName() + "\n";
            output += "Name: " + p.getName() + "\n";
            output += "Says: " + p.speak();
            System.out.println(output);
        }
    }
}
