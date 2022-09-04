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



    /*ГЕТТЕРЫ*/
    public String getNameBook() {
        return nameBook;
    }
    public int getYearBook() {
        return yearBook;
    }
    public void setNameAuthor(Author nameAuthor) {
        this.nameAuthor = nameAuthor;
    }
    public Author getSurnameAuthor() {
        return surnameAuthor;
    }



    /*СЕТТЕРЫ*/

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
}
