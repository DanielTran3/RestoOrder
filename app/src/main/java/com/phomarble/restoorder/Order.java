package com.phomarble.restoorder;

public class Order {
    private int quantity;
    private MenuItem foodItem;

    public Order(int quantity, MenuItem item) {
        this.quantity = quantity;
        this.foodItem = item;
    }

    public void setQuantity (int newQuantity) {
        this.quantity = newQuantity;
    }

    public void setFoodItem (MenuItem newItem) {
        this.foodItem = newItem;
    }

    public int getQuantity () {
        return this.quantity;
    }

    public MenuItem getFoodItem () {
        return this.foodItem;
    }
}
