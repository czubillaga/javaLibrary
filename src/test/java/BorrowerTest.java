import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before() {
        borrower = new Borrower();
        book = new Book("Jurassic Park", "Michael Crichton", "Science Fiction");
        library = new Library(10);
        library.addBook(book);
    }

    @Test
    public void canBorrow() {
        borrower.borrow(library);
        assertEquals(0, library.bookCount());
        assertEquals(1, borrower.borrowCount());
    }
}
