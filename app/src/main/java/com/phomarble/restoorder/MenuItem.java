package com.phomarble.restoorder;


public class MenuItem {
    private int quantity;
    private String itemNumber;
    private String itemNameEN; // English item name
    private String itemNameVI; // Vietnamese item name
    private String itemNameZH; // Chinese item name

    public MenuItem(String itemNumber) {
        this.itemNumber = itemNumber;
    }


    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemNameEN() {
        return itemNameEN;
    }

    public void setItemNameEN(String itemNameEN) {
        this.itemNameEN = itemNameEN;
    }

    public String getItemNameVI() {
        return itemNameVI;
    }

    public void setItemNameVI(String itemNameVI) {
        this.itemNameVI = itemNameVI;
    }

    public String getItemNameZH() {
        return itemNameZH;
    }

    public void setItemNameZH(String itemNameZH) {
        this.itemNameZH = itemNameZH;
    }
}
