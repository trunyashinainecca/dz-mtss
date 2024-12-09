package com.example;

public class Product {
    private int quantity;
    private double price;
    private double discount;

    public Product(int quantity, double price, double discount) {
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }
    public void calculateTotal() {
        double totalWithoutDiscount = quantity * price;
        double totalWithDiscount = totalWithoutDiscount * (1 - discount / 100);

        System.out.printf("Общая сумма без скидки: %.2f%n", totalWithoutDiscount);
        System.out.printf("Общая сумма со скидкой: %.2f%n", totalWithDiscount);
    }
}
