import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;

    public Borrower() {
        this.borrowedBooks = new ArrayList<Book>();
    }

    public void borrow(Library library) {
        this.borrowedBooks.add(library.lend());
    }

    public int borrowCount() {
        return this. borrowedBooks.size();
    }
}
