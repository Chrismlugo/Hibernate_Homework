import DB.DBHelper;
import models.Author;
import models.Book;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Author author1 = new Author("Stephen","King");
        DBHelper.save(author1);

        Author author2 = new Author("HP","Lovecraft");
        DBHelper.save(author2);

        Book book1 = new Book("Call of the Cthulu", author2);
        DBHelper.save(book1);

        Book book2 = new Book("The Shining", author1);
        DBHelper.save(book2);

        Book book3 = new Book("Christine", author1);
        DBHelper.save(book3);

        Book book4 = new Book("The Shadow over Innsmouth", author2);
        DBHelper.save(book4);

        book3.setTitle("Salem's Lot");
        DBHelper.update(book3);




        List<Book> books = DBHelper.getAll("Book");

        List<Author> authors = DBHelper.getAll("Author");

        List<Book> booksByAuthor = DBHelper.getBooks(author2.getId());

    }
}
