package com.company;

public class Store {
    private String name;
    private int shelfLife;

    public Store(String name, int shelfLife) {
        this.name = name;
        this.shelfLife = shelfLife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }
}
