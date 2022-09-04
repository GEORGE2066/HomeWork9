public class Author {
    private String nameAuthor;
    private String surname;

    public Author(String nameAuthor, String surname) {
        this.nameAuthor = nameAuthor;
        this.surname = surname;
    }

    public String getAuthorName() {
        return nameAuthor;
    }

    public String getAuthorSurname() {
        return surname;
    }
}
