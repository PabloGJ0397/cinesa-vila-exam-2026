package edu.PabloGJ0397.movies;

import edu.PabloGJ0397.movies.domain.Movie;
import edu.PabloGJ0397.movies.presentation.MovieView;

public class Main {

    //Main test on SaveMovieUseCase
    public static void main(String[] args) {
        Movie movie1 = new Movie("tt0133093","140","Drama","25/05/1995","Disney","Tarzán");
        MovieView.save(movie1);
    }


}
