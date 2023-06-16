package finalExam.Books;

import java.time.LocalDate;

public class UKLibrary extends Library {
    public UKLibrary() {
        super(Country.UK);
    }

    @Override
    public Book addBook(Book book) {
        books.add(book);
        return book;
    }
}
