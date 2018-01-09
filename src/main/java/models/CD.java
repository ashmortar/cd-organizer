package models;


import java.util.ArrayList;

public class CD {
    private String artist;
    private String title;
    private String year;
    private String genre;
    private static ArrayList<CD> instances = new ArrayList<>();

    public CD(String artist, String title, String year, String genre) {
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.genre = genre;
        instances.add(this);

    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public static ArrayList getAll() {
        return instances;
    }

    public static void clearAllCDs() {
        instances.clear();
    }
}
