package com.example.animals;

public class Pet extends AbstractAnimal {
    private boolean trained;

    public Pet(String breed, String name, double cost, String character, boolean trained) {
        super(breed, name, cost, character);
        this.trained = trained;
    }

}
