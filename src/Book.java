public class Book {
    private String nameBook;
    private int yearBook;
    private Author nameAuthor;
    private Author surnameAuthor;

    public Book(String nameBook, int yearBook, Author nameAuthor, Author surnameAuthor) {
        this.nameBook = nameBook;
        this.yearBook = yearBook;
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }
}
