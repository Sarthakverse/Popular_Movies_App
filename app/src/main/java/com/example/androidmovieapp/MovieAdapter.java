package com.example.androidmovieapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.androidmovieapp.databinding.ItemMovieBinding;
import com.example.androidmovieapp.models.Movie;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private LayoutInflater layoutInflater;
    private final List<Movie> movies;

    public MovieAdapter(@NonNull List<Movie> movies){
        this.movies=movies;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (layoutInflater == null){
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        ItemMovieBinding binding= DataBindingUtil.inflate(layoutInflater,R.layout.item_movie,parent,false);
        return new MovieViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie movie = movies.get(position);

        // Use Glide to load the image into the ImageView
        RequestOptions requestOptions = new RequestOptions()
                .placeholder(R.drawable.thor) // Placeholder image
                .error(R.drawable.thor); // Error image (if loading fails)

        Glide.with(holder.itemView.getContext())
                .load(movie.getLargePosterUrl())
                .apply(requestOptions)
                .into(holder.binding.ivMoviePoster);

        // Bind other data as needed
        holder.binding.setMovie(movie);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    static class MovieViewHolder extends RecyclerView.ViewHolder {
        private final ItemMovieBinding binding;
        public MovieViewHolder(@NonNull ItemMovieBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
