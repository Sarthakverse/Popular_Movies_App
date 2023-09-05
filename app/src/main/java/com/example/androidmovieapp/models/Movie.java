package com.example.androidmovieapp.models;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Movie {
    private static final String BASE_IMAGE_URL="https://image.tmdb.org/t/p";
    private static final String BASE_POSTER_LARGE_URL = BASE_IMAGE_URL + "/w342";

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", votes=" + votes +
                ", posterPath='" + posterPath + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Float.compare(movie.votes, votes) == 0 && Objects.equals(title, movie.title) && Objects.equals(posterPath, movie.posterPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, votes, posterPath);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getVotes() {
        return votes;
    }

    public void setVotes(float votes) {
        this.votes = votes;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public Movie(String title, float votes, String posterPath) {
        this.title = title;
        this.votes = votes;
        this.posterPath = posterPath;
    }

    @SerializedName("title") String title;
    @SerializedName("vote_average") float votes;
    @SerializedName("poster_path") String posterPath;

    public String getLargePosterUrl() { return BASE_POSTER_LARGE_URL + posterPath; }

}