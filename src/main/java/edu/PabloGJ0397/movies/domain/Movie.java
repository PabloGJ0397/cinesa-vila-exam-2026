package edu.PabloGJ0397.movies.domain;

import java.util.Date;

public class Movie {
    private String id;
    private String duration;
    private String genre;
    private Date publishDate;
    private String Company;
    private String tittle;

    public Movie(String id, String duration, String genre, Date publishDate, String company) {
        this.id = id;
        this.duration = duration;
        this.genre = genre;
        this.publishDate = publishDate;
        Company = company;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", duration='" + duration + '\'' +
                ", genre='" + genre + '\'' +
                ", publishDate=" + publishDate +
                ", Company='" + Company + '\'' +
                '}';
    }
}
