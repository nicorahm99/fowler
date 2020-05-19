import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer = new Customer("CustomerName");

    @Test
    void statement() {
        String statement = "Rental Record for CustomerName\n\tTitle		Days	Amount\nAmount owed is 0.0\nYou earned 0 frequent renter points";

        assertEquals(statement, customer.statement());
    }

    @Test
    void getName() {
        assertEquals("CustomerName", customer.getName());
    }

    @Test
    void addRental() {
        String statement = "Rental Record for CustomerName\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tmovie1\t\t10\t30.0\n" +
                "Amount owed is 30.0\n" +
                "You earned 2 frequent renter points";
        Movie movie = new Movie("movie1", 1);
        Rental rental = new Rental(movie, 10);
        customer.addRental(rental);

        assertEquals(statement, customer.statement());
    }


}