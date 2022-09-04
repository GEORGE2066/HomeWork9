public class Book {
    private String name;
    private int yearPublisher;
    private Author nameAuthor;
    private Author surname;

    public Book(String name, int yearPublisher, Author nameAuthor, Author surname) {
        this.name = name;
        this.yearPublisher = yearPublisher;
        this.nameAuthor = nameAuthor;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public int getYearPublisher() {
        return yearPublisher;
    }
    public void setYearPublisher(int yearPublisher) {
        this.yearPublisher = yearPublisher;
    }
}
