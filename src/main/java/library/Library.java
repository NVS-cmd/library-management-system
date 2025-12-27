package library;

import java.util.List;

public class Library {
    private List<Book> books;
    private OperationLog operationLog;

    public Library() {
        // TODO: инициализация
    }

    // Заглушки методов
    public void addBook(Book book) { /* TODO */ }
    public Book findBookById(int id) { return null; }
    public List<Book> findBooksByAuthor(String author) { return null; }
    public boolean borrowBook(int id) { return false; }
    public boolean returnBook(int id) { return false; }
    public List<Book> getAvailableBooks() { return null; }
    public void printOperationLog() { /* TODO */ }

    // Вложенный класс — пока пустой
    public static class OperationLog {
        // TODO: реализация
    }
}
