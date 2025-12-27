public String getStatistics() {
    int totalBooks = books.size();
    long availableCount = books.stream().filter(Book::isAvailable).count();
    int issuedBooks = totalBooks - (int)availableCount;

    return String.format("Статистика: Всего книг: %d, Доступно: %d, Выдано: %d",
            totalBooks, availableCount, issuedBooks);
}
