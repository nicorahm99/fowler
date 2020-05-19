import static org.junit.jupiter.api.Assertions.*;

class RentalTest {

    Movie testMovie = new Movie("testMovie", 2);
    Rental rental = new Rental(testMovie, 5);

    @org.junit.jupiter.api.Test
    void getDaysRented() {
        assertEquals(5, rental.getDaysRented());
    }

    @org.junit.jupiter.api.Test
    void getMovie() {
        assertEquals(testMovie, rental.getMovie());
    }
}