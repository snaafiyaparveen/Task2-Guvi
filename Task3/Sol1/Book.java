package Task3.Sol1;

public class Book {
    int bookId;
    String title;
    String author;
    boolean isAvailable;
    public Book() {

    }
    public Book(int bookId, String title, String author, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public int getBookId() {

        return bookId;
    }

    public void setBookId(int bookId) {

        this.bookId = bookId;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return  " Book ID:" + bookId +
                "\n Title:" + title +
                "\n Author:" + author +
                "\n Availablability:" + isAvailable ;
    }
}
