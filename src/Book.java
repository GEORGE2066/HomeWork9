public class Book {
    private String name;
    private int yearPublisher;
    private Author nameAuthor;
    private Author surnameAuthor;

    public Book(String name, int yearPublisher, Author nameAuthor, Author surnameAuthor) {
        this.name = name;
        this.yearPublisher = yearPublisher;
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    public String getName() {
        return name;
    }
    public int getYearPublisher() {
        return yearPublisher;
    }
    public Author getNameAuthor() {
        return nameAuthor;
    }
    public Author getSurname() {
        return surnameAuthor;
    }

    public void setYearPublisher(int yearPublisher) {
        this.yearPublisher = yearPublisher;
    }
}
