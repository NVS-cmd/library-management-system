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
    // ... (структура Library остается)

    public static class OperationLog {
        public class LogEntry {
            private OperationType type;
            private LocalDateTime timestamp;
            private String description;

            public LogEntry(OperationType type, String description) {
                this.type = type;
                this.timestamp = LocalDateTime.now();
                this.description = description;
            }

            // геттеры + toString()
            public OperationType getType() { return type; }
            public LocalDateTime getTimestamp() { return timestamp; }
            public String getDescription() { return description; }

            @Override
            public String toString() {
                return String.format("[%s] %s: %s", timestamp, type, description);
            }
        }

        public enum OperationType {
            ADD_BOOK, BORROW, RETURN
        }

        private List<LogEntry> entries;

        public OperationLog() {
            this.entries = new ArrayList<>();
        }

        public void addEntry(OperationType type, String description) {
            entries.add(new LogEntry(type, description));
        }

        public List<LogEntry> getEntries() { return new ArrayList<>(entries); }

        public void printLog() {
            System.out.println("=== Журнал операций ===");
        }
    }

}
}
