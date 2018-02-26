package self.self2;

/**
 *
 * @author Tisanai.Cha
 */
public class BookCatalog {

    private int numOfBooks;
    private Book[] books;

    public BookCatalog(int lengthOfCatalog) {
        books = new Book[lengthOfCatalog];

        for(int i = 0; i < lengthOfCatalog; i++) {
            Book b1 = new Book(12345678+i, "Web Programming", "programming", true);
            addBook(b1);
        }
    }

    public int size() {
        return books.length;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int addBook(Book bookAdded) {
        for(int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                books[i] = bookAdded;
                numOfBooks++;
                return i;
            }
        }
        return -1;
    }

    public int unAvailableBook(Book bookUnAvailable) {
        for(int i = 0; i < books.length; i++) {
            if(books[i].equals(bookUnAvailable)) {
                books[i].setAvailable(false);
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String listOfBooks = "***List of Books***\n";
        for (int i = 0; i < numOfBooks; i++) {
            listOfBooks += books[i] + "\n";
        }

        return listOfBooks;
    }

}
