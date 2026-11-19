public class Task1 {
    private String title;
    private String author;
    private int pages;
    private boolean isRead;

    public Book(String title, String author, int pages, boolean isRead) {                   //создаеи книгу с параметрами которые нам нужны
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isRead = isRead;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPages() {                                         //получаем данные с private полей
        return pages;
    }
    public boolean isRead() {
        return isRead;
    }
    public void setRead(boolean read) {                                //сеттер для получения статуса книги
        isRead = read;
    }
    public String describe() {
        return "книга" + title + "автор" + author + "страниц прочитано:" + isRead;    //красиво возвращаем что то там да
    }
}