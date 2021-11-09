import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book newBook;

    @Before
    public void before() {
        library = new Library(1);
        book = new Book("Jurassic Park", "Michael Crichton", "Sci-Fi");
        newBook = new Book("Sphere", "Michael Crichton", "Sci-Fi");
    }

    @Test
    public void canCountBooks() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void checksCapacity() {
        library.addBook(book);
        library.addBook(newBook);
        assertEquals(1, library.bookCount());
    }

//    @Test
//    public void canGetBookCountByGenre() {
//        library.addBook(book);
//        library.addBook(newBook);
//        assertEquals(2, library.genreCount("Sci-Fi"));
//    }
}
