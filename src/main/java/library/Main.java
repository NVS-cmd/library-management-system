package library;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Добавление книг
        library.addBook(new Book(1, "Война и мир", "Л.Н. Толстой", 1869, "978-5-17-090335-2"));
        library.addBook(new Book(2, "Преступление и наказание", "Ф.М. Достоевский", 1866, "978-5-17-090336-9"));
        library.addBook(new Book(3, "Анна Каренина", "Л.Н. Толстой", 1877, "978-5-17-090337-6"));

        System.out.println("=== Добавлены книги ===\n");

        // Демонстрация поиска по ID
        System.out.println("Поиск книги по ID 2:");
        Book book = library.findBookById(2);
        System.out.println(book != null ? book : "Книга не найдена");
        System.out.println();

        // Поиск по автору
        System.out.println("Книги Л.Н. Толстого:");
        List<Book> tolstoyBooks = library.findBooksByAuthor("Л.Н. Толстой");
        tolstoyBooks.forEach(System.out::println);
        System.out.println();

        // Доступные книги
        System.out.println("Доступные книги:");
        library.getAvailableBooks().forEach(System.out::println);
        System.out.println();

        // Выдача и возврат книг
        System.out.println("=== Выдача и возврат книг ===");
        library.borrowBook(1);
        library.borrowBook(2);

        System.out.println("После выдачи книг 1 и 2:");
        library.getAvailableBooks().forEach(System.out::println);
        System.out.println();

        library.returnBook(2);
        System.out.println("После возврата книги 2:");
        library.getAvailableBooks().forEach(System.out::println);
        System.out.println();

        // Журнал операций
        System.out.println("Журнал операций:");
        library.printOperationLog();
    }
}
