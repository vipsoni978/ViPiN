package com.firstgitpro.restapi.restapi.entities;

public class Movie {

    private String movieid;
    private String original_title;
    private boolean adult;
    private String overview;
    private String budget;
    private String release_date;
    private String vote_average;
    

   


    public Movie(String movieid, String original_title, boolean adult, String overview, String budget,
            String release_date, String vote_average) {
        this.movieid = movieid;
        this.original_title = original_title;
        this.adult = adult;
        this.overview = overview;
        this.budget = budget;
        this.release_date = release_date;
        this.vote_average = vote_average;
        
    }


    public String getBudget() {
        return budget;
    }


    public void setBudget(String budget) {
        this.budget = budget;
    }


    public String getRelease_date() {
        return release_date;
    }


    


    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }


    public String getVote_average() {
        return vote_average;
    }


    public void setVote_average(String vote_average) {
        this.vote_average = vote_average;
    }


    public Movie() {
    }


    public String getMovieid() {
        return movieid;
    }


    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }


    public String getOriginal_title() {
        return original_title;
    }


    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }


    public boolean isAdult() {
        return adult;
    }


    public void setAdult(boolean adult) {
        this.adult = adult;
    }


    public String getOverview() {
        return overview;
    }


    public void setOverview(String overview) {
        this.overview = overview;
    }


    @Override
    public String toString() {
        return "Movie [adult=" + adult + ", budget=" + budget + ", movieid=" + movieid
                + ", original_title=" + original_title + ", overview=" + overview + ", release_date=" + release_date
                + ", vote_average=" + vote_average + "]";
    }


    

    

}
