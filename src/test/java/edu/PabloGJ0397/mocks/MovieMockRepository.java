package edu.PabloGJ0397.mocks;

import edu.PabloGJ0397.movies.domain.Movie;
import edu.PabloGJ0397.movies.domain.MovieRepository;

import java.util.ArrayList;
import java.util.List;

public class MovieMockRepository implements MovieRepository {
    public Integer countSaveMethod = 0;

    @Override
    public void save(Movie movie) { countSaveMethod++;
    }

    @Override
    public ArrayList<Movie> getMovies() {
        Movie movie1 = new Movie("tt0133093","140","Drama","25/05/1995","Disney","Tarzán");
        Movie movie2 = new Movie("tt0133094","140","Comedy","25/05/2010","Pixar","Entangled");
        Movie movie3 =new Movie("tt0133095", "98","Animation","12/12/2010","Pixar","Wall-E");
        Movie movie4 =new Movie("tt0133096", "110","Drama","05/06/2005", "Warner","Devil´s wears Prada");
        ArrayList<Movie> movies = new ArrayList<>(List.of(movie1,movie2,movie3,movie4));
        return movies;
    }

    @Override
    public void delete(String id) {

    }
}
