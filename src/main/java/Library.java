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
            if(this.genreList.keySet().contains(book.getGenre())) {
                this.genreList.put(book.getGenre(), this.genreList.get(book.getGenre()) + 1);
            } else {
                this.genreList.put(book.getGenre(), 1);
            }
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

    public int getGenreCount(String genre) {
        return this.genreList.get(genre);
    }
}
