package com.example.animals;

public class Main {
    public static void main(String[] args) {
        createAnimalServiceImpl service = new createAnimalServiceImpl();
        System.out.println("Создание 10 животных:");
        service.createDefaultAnimals();

        System.out.println("\nСоздание N животных с помощью цикла for:");
        service.createAnimals(5);

        System.out.println("\nСоздание N животных с помощью do while:");
        service.createAnimalsDoWhile(5);
    }
}
