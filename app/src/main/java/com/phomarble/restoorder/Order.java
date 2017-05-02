package com.phomarble.restoorder;

public class Order {
    private int quantity;
    private MenuItem foodItem;

    public Order(int quantity, MenuItem item) {
        this.quantity = quantity;
        this.foodItem = item;
    }
}
