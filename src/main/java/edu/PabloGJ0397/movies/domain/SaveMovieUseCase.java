package edu.PabloGJ0397.movies.domain;

public class SaveMovieUseCase {
    private MovieRepository movieRepository;

    public SaveMovieUseCase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    public void execute(Movie movie){
        movieRepository.save(movie);
    }
}
