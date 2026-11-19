import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
    }
    public List<Book> findByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();                                      //поиск нужных кинг и создание нового списка для них
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {                    //equalsIgnoreCase - шоб upper/lower case не пугали код(он стесняшка и может не увидеть нужную нам книжку)
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
    public int getTotalPages() {
        int total = 0;
        for (Book book : books) {
            total += book.getPages();
        }
        return total;
    }

    public List<Book> getUnreadBooks() {
        List<Book> unreadBooks = new ArrayList<>();                         //ищем книжки которые не читали(все)
        for (Book book : books) {
            if (!book.isRead()) {
                unreadBooks.add(book);
            }
        }
        return unreadBooks;
    }
}