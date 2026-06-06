// Q-- Create a Book class for a library system.
// • Instance variables: title, author, isbn.
// • Static variable: totalBooks, a counter for the total number of book instances.
// • Instance methods: borrowBook(), returnBook().
// • Static method: getTotalBooks(), to get the total number of books in the library.

public class Book {

    String title;
    String author;
    int isbn;
    boolean isBorrowed;
    static int totalBooks = 0;

    Book(int isbn, String title, String author) {

        this.isbn = isbn;
        this.author = author;
        this.title = title;
        totalBooks++;

    }

    public static void main(String[] args) {
        System.out.println("--- WELCOME TO THE LIBRARY ---");
        Book b1 = new Book(1, "python", "ankur");
        Book b2 = new Book(2, "Java", "ankur sharma");

        b1.borrowBook();
        b1.borrowBook();
        b2.returnBook();
        b2.borrowBook();
        b1.returnBook();

        System.out.println("Total book in library = " + Book.getTotalBooks());

    }

    public void borrowBook() {

        if (!isBorrowed) {
            System.out.println("Book: " + title + " borrowed successfully.");

            isBorrowed = true;

        } else {
            System.out.println("Book "+ title + " is not available right now.");
        }

    }

    public void returnBook() {
        if (isBorrowed) {
            System.out.println("Thank you for returning The "+ title +" book.");
            isBorrowed = false;

        } else {
            System.out.println("Book "+ title+ " is already in library.");
        }

    }

    public static int getTotalBooks() {

        return totalBooks;

    }

}
