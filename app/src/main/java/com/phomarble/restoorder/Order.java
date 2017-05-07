package com.phomarble.restoorder;

import java.util.ArrayList;

public class Order {
    private String orderNumber;
    private String tableNumber;
    private ArrayList<MenuItem> itemsOrdered;

    public Order(String tableNumber) {
        this.tableNumber = tableNumber;
        this.itemsOrdered = new ArrayList<>();
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public ArrayList<MenuItem> getItemsOrdered() {
        return itemsOrdered;
    }

    public void setItemsOrdered(ArrayList<MenuItem> itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }
}
