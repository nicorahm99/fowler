import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    Movie testMovie = new Movie("TestMovie", Movie.CHILDRENS);

    @Test
    void getPriceCode() {
        assertEquals(Movie.CHILDRENS, testMovie.getPriceCode());
    }

    @Test
    void setPriceCode() {
        testMovie.setPriceCode(Movie.REGULAR);
        assertEquals(Movie.REGULAR, testMovie.getPriceCode());
    }

    @Test
    void getTitle() {
        assertEquals("TestMovie", testMovie.getTitle());
    }
}