package finalExam.Books;

import java.util.ArrayList;

public abstract class Library {
    protected ArrayList<Book> books;
    protected Country country;

    public Library(Country country) {
        this.country = country;
        books = new ArrayList<>();
    }

    public String getCountryName() {
        return country.toString();
    }

    public ArrayList<Book> findBooksByPublisher(String publisher) {
        ArrayList<Book> foundBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                foundBooks.add(book);
            }
        }

        return foundBooks;
    }

    public abstract Book addBook(Book book);
}
