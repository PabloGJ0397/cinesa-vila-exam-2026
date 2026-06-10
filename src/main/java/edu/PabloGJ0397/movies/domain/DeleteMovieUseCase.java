package edu.PabloGJ0397.movies.domain;

public class DeleteMovieUseCase {
    private MovieRepository movieRepository;

    public DeleteMovieUseCase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    public void execute(String id){
        movieRepository.delete(id);
    }
}
