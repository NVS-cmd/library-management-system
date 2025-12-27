public String getStatistics() {
    int totalBooks = books.size();
    long availableCount = books.stream().filter(Book::isAvailable).count();
    int issuedBooks = totalBooks - (int)availableCount;

    return String.format("Статистика: Всего книг: %d, Доступно: %d, Выдано: %d",
            totalBooks, availableCount, issuedBooks);
}
public boolean removeBook(int id) {
    Optional<Book> bookToRemove = books.stream()
            .filter(b -> b.getId() == id)
            .findFirst();

    if (bookToRemove.isPresent()) {
        books.remove(bookToRemove.get());
        operationLog.addEntry(OperationLog.OperationType.ADD_BOOK,
                "Удалена книга ID " + id + ": " + bookToRemove.get().getTitle());
        return true;
    }
    return false;
}
