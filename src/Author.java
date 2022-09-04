public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }



    /*ГЕТТЕРЫ*/

    public String getNameAuthor() {
        return nameAuthor;
    }
    public String getSurnameAuthor() {
        return surnameAuthor;
    }



    /*СЕТТЕРЫ*/

    public void setSurnameAuthor(String surnameAuthor) {
        this.surnameAuthor = surnameAuthor;
    }
    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }
}