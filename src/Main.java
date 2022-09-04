public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Little Golden Calf", 1931, "ilia", "ilf");
        Book book2 = new Book("12 chair", 1927, "evgen", "petroff");

        System.out.println(book1.getNameBook() + " " + book1.getYearBook() + " " + book1.getAuthor().getNameAuthor() + " " + book1.getAuthor().getSurnameAuthor());
        System.out.println(book2.getNameBook() + " " + book2.getYearBook() + " " + book2.getAuthor().getNameAuthor() + " " + book2.getAuthor().getSurnameAuthor());

        book1.setYearBook(2021);
        System.out.println(book1.getNameBook() + " " + book1.getYearBook() + " " + book1.getAuthor().getNameAuthor() + " " + book1.getAuthor().getSurnameAuthor());
    }
}