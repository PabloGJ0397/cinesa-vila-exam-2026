package edu.PabloGJ0397.features.movies.domain;

import edu.PabloGJ0397.mocks.MovieMockRepository;
import edu.PabloGJ0397.movies.domain.Movie;
import edu.PabloGJ0397.movies.domain.SaveMovieUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SaveMovieUseCaseTest {
    public SaveMovieUseCase saveMovieUseCase;
    public MovieMockRepository movieMockRepository;

    @BeforeEach
    void setUp() {
        movieMockRepository = new MovieMockRepository();
        saveMovieUseCase = new SaveMovieUseCase(movieMockRepository);
    }

    //Test returning nothing. Validation on save() method execution via counter.
    @Test
    public void shouldCallSaveMethodWhenExecuted() {
        // Given
        Movie movie5 = new Movie("tt0133099", "160", "Drama", "25/05/2001", "Paramount", "Invictus");

        // When
        saveMovieUseCase.execute(movie5);

        // Then
        Assertions.assertEquals(1, movieMockRepository.countSaveMethod);
    }

}
