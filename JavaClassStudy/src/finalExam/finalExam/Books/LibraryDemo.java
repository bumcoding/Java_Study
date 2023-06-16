package finalExam.Books;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class LibraryDemo {
    public static BookManagement createBookManagement(String inputPath) {
        BookManagement bm = new BookManagement();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputPath));
            String line;

            while ((line = reader.readLine()) != null) {
                Book book = bm.createBook(line);
                bm.addBookToLib(book);
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bm;
    }

    public static void bookListToCSV(ArrayList<Book> books, String outputPath) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));

            for (Book book : books) {
                writer.write(book.toString());
                writer.newLine();
            }

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inputPath = args[0];
        String outputPath = args[1];

        try {
            BookManagement bm = createBookManagement(inputPath);
            ArrayList<Book> findBooks = bm.findBooksByPublisher("Futura", "Scribner", "MIT Press", "Vintage",
                    "Mariner Books", "Basic Books");

            bookListToCSV(findBooks, outputPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
