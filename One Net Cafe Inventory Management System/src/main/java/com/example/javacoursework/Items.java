package com.example.javacoursework;

import javafx.scene.image.Image;

import java.time.LocalDate;

public class Items {
    int itemCode;
    String itemName;
    String itemBrand;
    float itemPrice;
    int itemQuantity;
    String itemCategory;
    LocalDate date;

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    private Image itemImage;

    public Image getItemImage() {
        return itemImage;
    }

    public void setItemImage(Image itemImage) {
        this.itemImage = itemImage;
    }

    public Items(int itemCode, String itemName, String itemBrand, float itemPrice, int itemQuantity, String itemCategory, LocalDate date, Image itemImage) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemBrand = itemBrand;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.itemCategory = itemCategory;
        this.date = date;
        this.itemImage = itemImage;
    }

}