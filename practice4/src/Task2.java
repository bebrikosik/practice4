public class Reader {
    private String name;
    private String favoriteGenre;
    private Book lastBook;

    public Reader(String name, String favoriteGenre) {
        this.name = name;
        this.favoriteGenre = favoriteGenre;
    }
    public void readBook(Book book) {
        this.lastBook = book;                       //выбранную книгу помечаем как прочтенную
        book.setRead(true);
    }
    public String getLastBookInfo() {
        if (lastBook == null) {                                     //проверяем читал ли человек эту книгу и читал ли вообще
            return "Пока ничего не читал";
        }
        return lastBook.describe();                         //вызываем из прошлого задания вывод красиви
    }
public class Task2 {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Виктор", "экшен");
        Reader reader2 = new Reader("Антон", "анекдоты");

        Book book1 = new Book("капитанская дочка", "Пушкин А.С.", 333, false);
        Book book2 = new Book("Зимний вечер", "Пушкин А.С.", 322, false);

        reader1.readBook(book1);
        reader2.readBook(book2);

        System.out.println(reader1.getLastBookInfo());
        System.out.println(reader2.getLastBookInfo());
    }

    
}
