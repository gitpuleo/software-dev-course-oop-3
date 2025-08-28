package org.example;

public class Movie extends LibraryItem {
    protected int durationInMinutes;

    public Movie(String title, String author, int year, int durationInMinutes) {
        super(title, author, year);
        this.durationInMinutes = durationInMinutes;
    }
        protected int getDurationInMinutes() {return durationInMinutes;}
        public String toString() {return "Movie: " + title + " by " + author + " (" + year + ") - " + durationInMinutes + " minutes";}

}