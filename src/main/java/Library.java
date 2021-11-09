import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> booksList;
    private int capacity;
    private HashMap<String, Integer> genreList;

    public Library(int capacity) {
        this.booksList = new ArrayList<>();
        this.capacity = capacity;
        this.genreList = new HashMap<String, Integer>();
    }

    public int bookCount() {
        return this.booksList.size();
    }

    public void addBook(Book book) {
        if(this.atCapacity()) {
            this.booksList.add(book);
        }
    }

    public boolean atCapacity() {
        if(this.capacity == bookCount()) {
            return false;
        }
        return true;
    }

    public Book lend() {
        return this.booksList.remove(0);
    }
}
