package library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Добавляем книги
        library.addBook(new Book(1, "Война и мир", "Л.Н. Толстой", 1869, "978-5-17-090335-2"));
        library.addBook(new Book(2, "Преступление и наказание", "Ф.М. Достоевский", 1866, "978-5-17-098765-4"));
        library.addBook(new Book(3, "Мастер и Маргарита", "М.А. Булгаков", 1967, "978-5-17-123456-7"));

        // Поиск и операции
        System.out.println("Книга по ID 1:");
        System.out.println(library.findBookById(1));

        System.out.println("\nКниги Достоевского:");
        library.findBooksByAuthor("Достоевский").forEach(System.out::println);

        // Выдача и возврат
        library.borrowBook(1);
        library.returnBook(1);

        library.printOperationLog();
    }
}
