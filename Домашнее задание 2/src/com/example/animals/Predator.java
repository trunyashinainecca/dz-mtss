package com.example.animals;

import java.time.LocalDate;

public class Predator extends AbstractAnimal {
    private LocalDate birthDate;

    public Predator(String breed, String name, double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character);
        this.birthDate = birthDate;
    }

}

