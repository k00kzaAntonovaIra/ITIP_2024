import java.util.HashMap;

public class BookTable{
    private HashMap<String, Book> books;

    public BookTable() {
        books = new HashMap<>();
    }

    public void addBook(String isbn, Book book) {
        books.put(isbn, book);
    }

    public Book getBook(String isbn) {
        return books.get(isbn);
    }

    public Book removeBook(String isbn) {
        return books.remove(isbn);
    }

    public int size() {
        return books.size();
    }

    public boolean isEmpty() {
        return books.isEmpty();
    }

    public static void main(String[] args) {
        // Создание экземпляра библиотеки
        BookTable library = new BookTable();

        // Создание книг
        Book book1 = new Book("1984", "George Orwell", 3);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 2);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 5);

        // Добавление книг в библиотеку
        library.addBook("978-0451524935", book1);
        library.addBook("978-0061120084", book2);
        library.addBook("978-0743273565", book3);

        // Вывод количества книг в библиотеке
        System.out.println("Количество книг в библиотеке: " + library.size()); // 3

        // Получение книги по ISBN
        Book retrievedBook = library.getBook("978-0451524935");
        if (retrievedBook != null) {
            System.out.println("Полученная книга: " + retrievedBook.getName() + " автор: " + retrievedBook.getAuthor() + ", копий: " + retrievedBook.getNum());
        } else {
            System.out.println("Книга не найдена.");
        }

        // Удаление книги
        Book removedBook = library.removeBook("978-0061120084");
        if (removedBook != null) {
            System.out.println("Удалена книга: " + removedBook.getName());
        } else {
            System.out.println("Книга не найдена для удаления.");
        }

        // Проверка, пуста ли библиотека
        System.out.println("Библиотека пуста? " + library.isEmpty()); // false

        // Вывод оставшихся книг в библиотеке
        System.out.println("Осталось книг в библиотеке: " + library.size()); // 2

        // Вывод всех оставшихся книг
        System.out.println("Список оставшихся книг:");
        for (String isbn : library.books.keySet()) {
            Book book = library.getBook(isbn);
            System.out.println("ISBN: " + isbn + ", Название: " + book.getName() + ", Автор: " + book.getAuthor() + ", Копий: " + book.getNum());
        }
    }
}