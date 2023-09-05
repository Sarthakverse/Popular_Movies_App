package com.example.androidmovieapp;

import com.example.androidmovieapp.models.Movie;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;


public class MovieNetworkResponse {
    @SerializedName("page") Integer page;
    @SerializedName("total_results") Integer totalResults;
    @SerializedName("total_pages") Integer totalPages;
    @SerializedName("results")
    List<Movie> movies;

    public MovieNetworkResponse(Integer page, Integer totalResults, Integer totalPages, List<Movie> movies) {
        this.page = page;
        this.totalResults = totalResults;
        this.totalPages = totalPages;
        this.movies = movies;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieNetworkResponse that = (MovieNetworkResponse) o;
        return Objects.equals(page, that.page) && Objects.equals(totalResults, that.totalResults) && Objects.equals(totalPages, that.totalPages) && Objects.equals(movies, that.movies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, totalResults, totalPages, movies);
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "MovieNetworkResponse{" +
                "page=" + page +
                ", totalResults=" + totalResults +
                ", totalPages=" + totalPages +
                ", movies=" + movies +
                '}';
    }
}