package com.example.animals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    CreateAnimalServiceImpl service = new CreateAnimalServiceImpl();

    private List<Animal> animals = new ArrayList<>();
    private Random random = new Random();

    @Override
    public void createDefaultAnimals() {
        int count = 0;
        while (count < 10) {
            Animal animal = createRandomAnimal();
            animals.add(animal);
            System.out.println("Создано новое животное: " + animal.getName());
            count++;
        }
    }

    public void createAnimals(int n) {
        for (int i = 0; i < n; i++) {
            Animal animal = createRandomAnimal();
            animals.add(animal);
            System.out.println("Создано новое животное: " + animal.getName());
        }
    }

    public void createAnimalsDoWhile(int n) {
        int count = 0;
        do {
            Animal animal = createRandomAnimal();
            animals.add(animal);
            System.out.println("Создано новое животное: " + animal.getName());
            count++;
        } while (count < n);
    }

    private Animal createRandomAnimal() {
        return new Predator("Тигр", "Тигрица", random.nextDouble() * 1000, "Дикий", LocalDate.now());
    }
}
