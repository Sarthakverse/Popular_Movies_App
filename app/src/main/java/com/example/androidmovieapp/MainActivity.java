package com.example.androidmovieapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.androidmovieapp.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private FragmentManager fragmentManager;
    private Fragment fragment=null;
    public static final String FRAG_TAG_POPULAR="frag-popular";
    public static final String FRAG_TAG_TOP_RATED="frag-top-rated";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.bottomNavigation.setOnNavigationItemSelectedListener(this);

        fragmentManager=getSupportFragmentManager();
        loadPopularMoviesFragment();
    }

    public void openImdbWebsite(MenuItem menuItem)
    {

        //implicit intent code = we don't know source and destination but we know the work to be done
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.imdb.com/chart/moviemeter/"));
        startActivity(intent);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_popular){
            loadPopularMoviesFragment();
            return true;
        }
        else if (item.getItemId() == R.id.action_top_rated){
            loadTopRatedMoviesFragment();
            return true;
        }
        else if (item.getItemId() == R.id.action_imdb){

            Toast.makeText(this, "No app available to open IMDb website", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
    private void loadPopularMoviesFragment(){
        fragment=fragmentManager.findFragmentByTag(FRAG_TAG_POPULAR);
        if (fragment!=null) {
            fragmentManager.beginTransaction().show(fragment).commit();
        }else {
            fragmentManager.beginTransaction().add(R.id.fragment_container,new MovieFragment(),FRAG_TAG_POPULAR).commit();
        }

        hideFragments(FRAG_TAG_TOP_RATED);
    }

    private void loadTopRatedMoviesFragment(){
        fragment=fragmentManager.findFragmentByTag(FRAG_TAG_TOP_RATED);
        if (fragment!=null) {
            fragmentManager.beginTransaction().show(fragment).commit();
        }else {
            fragmentManager.beginTransaction().add(R.id.fragment_container,new MovieFragment(),FRAG_TAG_TOP_RATED).commit();
        }

        hideFragments(FRAG_TAG_POPULAR);
    }

    private void hideFragments(String... tags){
        for (String tag : tags){
            fragment = fragmentManager.findFragmentByTag(tag);
            if (fragment!=null){
                fragmentManager.beginTransaction().hide(fragment).commit();
            }
        }
    }
}
