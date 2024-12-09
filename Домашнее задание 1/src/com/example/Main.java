package com.example;

public class Main {
    public static void main(String[] args) {
        // Создание объектов Product с различными параметрами
        Product product1 = new Product(10, 100.0, 0.75); // 0.75% скидка
        Product product2 = new Product(5, 200.0, 42.575); // 42.575% скидка
        Product product3 = new Product(8, 150.0, 59.1); // 59.1% скидка

        // Вызов метода calculateTotal для каждого объекта
        product1.calculateTotal();
        product2.calculateTotal();
        product3.calculateTotal();
    }
}
