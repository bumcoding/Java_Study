package finalExam.Books;

import java.util.ArrayList;

public class BookManagement {
    private ArrayList<Book> books;
    private CanadaLibrary canadaLibrary;
    private UKLibrary ukLibrary;
    private USALibrary usaLibrary;

    public BookManagement() {
        books = new ArrayList<>();
        canadaLibrary = new CanadaLibrary();
        ukLibrary = new UKLibrary();
        usaLibrary = new USALibrary();
    }

    public Book createBook(String strBookInfo) {
        String[] bookInfo = strBookInfo.split(",");

        String title = bookInfo[0].trim();
        String authors = bookInfo[1].trim();
        String isbn = bookInfo[2].trim();
        String languageCode = bookInfo[3].trim();
        int numPages = Integer.parseInt(bookInfo[4].trim());
        String publicationDate = bookInfo[5].trim();
        String publisher = bookInfo[6].trim();

        Country country;

        switch (languageCode) {
            case "en-CA":
                country = Country.Canada;
                break;
            case "en-GB":
                country = Country.UK;
                break;
            case "en-US":
                country = Country.USA;
                break;
            default:
                country = null;
                break;
        }

        return new Book(title, authors, isbn, country, numPages, publicationDate, publisher);
    }

    public void addBookToLib(Book book) {
        switch (book.getCountry()) {
            case Canada:
                canadaLibrary.addBook(book);
                break;
            case UK:
                ukLibrary.addBook(book);
                break;
            case USA:
                usaLibrary.addBook(book);
                break;
        }
    }

    public ArrayList<Book> findBooksByPublisher(String... publishers) {
        ArrayList<Book> foundBooks = new ArrayList<>();

        for (String publisher : publishers) {
            foundBooks.addAll(canadaLibrary.findBooksByPublisher(publisher));
            foundBooks.addAll(ukLibrary.findBooksByPublisher(publisher));
            foundBooks.addAll(usaLibrary.findBooksByPublisher(publisher));
        }

        return foundBooks;
    }
}
