package finalExam.Books;

import java.time.LocalDate;

public class USALibrary extends Library {
    public USALibrary() {
        super(Country.USA);
    }

    @Override
    public Book addBook(Book book) {
        LocalDate publicationDate = book.getPublicationDate();
        if (publicationDate != null && publicationDate.getYear() >= 2000) {
            books.add(book);
        }
        return book;
    }
}
