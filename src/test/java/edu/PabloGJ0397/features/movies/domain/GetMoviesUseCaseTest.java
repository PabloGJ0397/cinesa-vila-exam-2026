package edu.PabloGJ0397.features.movies.domain;

import edu.PabloGJ0397.mocks.EmptyMovieMockRepository;
import edu.PabloGJ0397.mocks.MovieMockRepository;
import edu.PabloGJ0397.mocks.NullMovieMockRepository;
import edu.PabloGJ0397.movies.domain.GetMoviesUseCase;
import edu.PabloGJ0397.movies.domain.Movie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

public class GetMoviesUseCaseTest {
    public GetMoviesUseCase getMoviesUseCase;
    public MovieMockRepository movieMockRepository;
    public EmptyMovieMockRepository emptyMovieMockRepository;
    public NullMovieMockRepository nullMovieMockRepository;

    @BeforeEach
    void setUp(){
        movieMockRepository = new MovieMockRepository();
        getMoviesUseCase = new GetMoviesUseCase(movieMockRepository);
    }

    //Test returning a List of Movies.
    @Test
    public void shouldReturnMovieListWhenExecuted(){
        // Given
        // Needed parametters have been declared in setUp()

        // When
        ArrayList<Movie> movies = getMoviesUseCase.execute();

        // Then
        Assertions.assertEquals(4,movies.size());
        Assertions.assertEquals("tt0133093", movies.get(0).getId());
    }


    //Test returning an Empty Movie List.
    @Test
    public void shouldReturnEmptyMovieListWhenExecuted(){
        // Given
        emptyMovieMockRepository = new EmptyMovieMockRepository();
        getMoviesUseCase = new GetMoviesUseCase(emptyMovieMockRepository);

        // When
        ArrayList<Movie> movies = getMoviesUseCase.execute();

        // Then
        Assertions.assertEquals(0,movies.size());
    }

    // Test returning Null.
    @Test
    public void shouldReturnNullWhenExecuted(){
        // Given
        nullMovieMockRepository = new NullMovieMockRepository();
        getMoviesUseCase = new GetMoviesUseCase(nullMovieMockRepository);

        // When
        ArrayList<Movie> movies = getMoviesUseCase.execute();

        // Then
        Assertions.assertNull(movies);

    }
}
