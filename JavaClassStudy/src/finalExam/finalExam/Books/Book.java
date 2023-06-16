package finalExam.Books;

import java.time.LocalDate;

public class Book {
    private String title;
    private String authors;
    private String isbn;
    private Country country;
    private LanguageCode languageCode;
    private int numPages;
    private LocalDate publicationDate;
    private String publisher;
    private Library library;

    public Book(String title, String authors, String isbn, Country country, int numPages, String publicationDate,
            String publisher) {
        this.title = title;
        this.authors = authors;
        this.isbn = isbn;
        this.country = country;
        this.numPages = numPages;
        this.publicationDate = LocalDate.parse(publicationDate);
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthors() {
        return authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public Country getCountry() {
        return country;
    }

    public LanguageCode getLanguageCode() {
        return languageCode;
    }

    public int getNumPages() {
        return numPages;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%d,%s,%s,%s", title, authors, isbn, country, numPages,
                publicationDate.toString(), publisher, library.getCountryName() + " Library");
    }
}
