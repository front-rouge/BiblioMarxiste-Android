package net.bibliomarxiste.bibliothquemarxiste.utils;

import android.support.annotation.Nullable;

public class Entry {

    private Integer year;
    private String title;
    private String filename;

    public Entry(@Nullable Integer year, String title, String filename) {
        this.year = year;
        this.title = title;
        this.filename = filename;
    }

    public Integer getYear() {
        return this.year;
    }

    public String getTitle() {
        return this.title;
    }

    public String getFilename() {
        return this.filename;
    }
}
