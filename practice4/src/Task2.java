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
}