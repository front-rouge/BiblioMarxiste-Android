package net.bibliomarxiste.bibliothquemarxiste.utils;

public class Item {
    private int res;
    private String name;

    public Item(int res, String name) {
        this.res = res;
        this.name = name;
    }

    public int getRes() {
        return this.res;
    }

    public String getName() {
        return this.name;
    }
}
