package library;

public class Main {
    public static void main(String[] args) {
        Book book = new library.Book(1, "Война и мир", "Л.Н. Толстой", 1869, "978-5-17-090335-2");
        System.out.println(book);

        book.setAvailable(false);
        System.out.println(book);
    }
}