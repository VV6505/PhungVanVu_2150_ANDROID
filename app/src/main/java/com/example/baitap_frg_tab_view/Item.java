package com.example.baitap_frg_tab_view;

public class Item {
    private String name;
    private String price;
    private int image;

    public Item(String name, String price, int image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public String getName() { return name; }
    public String getPrice() { return price; }
    public int getImage() { return image; }
}
