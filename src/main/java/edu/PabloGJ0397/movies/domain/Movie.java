package edu.PabloGJ0397.movies.domain;

public class Movie {
    private String id;
    private String duration;
    private String genre;
    private String publishDate;
    private String company;
    private String tittle;

    public Movie(String id, String duration, String genre, String publishDate, String company, String tittle) {
        this.id = id;
        this.duration = duration;
        this.genre = genre;
        this.publishDate = publishDate;
        this.company = company;
        this.tittle = tittle;
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

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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
                ", publishDate='" + publishDate + '\'' +
                ", company='" + company + '\'' +
                ", tittle='" + tittle + '\'' +
                '}';
    }
}
