package finalExam.Books;

public class CanadaLibrary extends Library {
    public CanadaLibrary() {
        super(Country.Canada);
    }

    @Override
    public Book addBook(Book book) {
        books.add(book);
        return book;
    }
}
