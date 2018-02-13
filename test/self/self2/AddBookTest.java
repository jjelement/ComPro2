package self.self2;

import org.junit.Test;
import sorrawich.self.self2.Book;
import sorrawich.self.self2.BookCatalog;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author User
 */
public class AddBookTest {

    @Test
    public void addSuccessOneBookToFreeSpace() {
        Book b1 = new Book(123456789, "Web Programming", "programming", true);
        BookCatalog bc = new BookCatalog(2);
        int expected = 0;
        int actual = bc.addBook(b1);
        assertEquals(expected, actual);
    }

    @Test
    public void addFailOneBookNoSpace() {
        Book b1 = new Book(123456789, "Web Programming", "programming", true);
        Book b2 = new Book(120056110, "Database Management", "database", true);

        BookCatalog bc = new BookCatalog(1);
        bc.addBook(b1);

        int expected = -1;
        int actual = bc.addBook(b1);
        assertEquals(expected, actual);
    }

}
