package org.example;

public class LibraryItem {
    protected String title;
    protected int year;
    protected String author;

    //constructor
    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String toString() {return "Item:" + title + "by" + author + "(" + year + ")";}

    public String getTitle() {return title;}

    public String getAuthor() {return author;}

    public int getYear() {return year;}
}
