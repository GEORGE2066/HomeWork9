public class Book {
    private String nameBook;
    private int yearBook;
    private Author author;

    public Book(String nameBook, int yearBook, String nameAuthor, String surnameAuthor) {
        this.nameBook = nameBook;
        this.yearBook = yearBook;
        this.author = new Author(nameAuthor, surnameAuthor);
    }



    /*ГЕТТЕРЫ*/
    public String getNameBook() {
        return nameBook;
    }
    public int getYearBook() {
        return yearBook;
    }

    public Author getAuthor() {
        return author;
    }

    /*СЕТТЕРЫ*/

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
    public void setNameSurnameAuthor(Author nameSurnameAuthor) {
        this.author = nameSurnameAuthor;
    }
}
