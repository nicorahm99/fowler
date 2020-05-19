import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    Movie testMovie = new Movie("TestMovie", 5);

    @Test
    void getPriceCode() {
        assertEquals(5, testMovie.getPriceCode());
    }

    @Test
    void setPriceCode() {
        testMovie.setPriceCode(6);
        assertEquals(6, testMovie.getPriceCode());
    }

    @Test
    void getTitle() {
        assertEquals("TestMovie", testMovie.getTitle());
    }
}