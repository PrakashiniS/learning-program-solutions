import java.util.*;
class Book {
    int bookId;
    String title;
    String author;
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }
}
public class LibraryManagementSystem {
    public static void linearSearch(Book[] books, String searchTitle) {
        boolean found = false;
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(searchTitle)) {
                System.out.println("Book found (Linear Search): " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found using Linear Search.");
        }
    }
    public static void binarySearch(Book[] books, String searchTitle) {
        int left = 0;
        int right = books.length - 1;
        boolean found = false;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(searchTitle);
            if (cmp == 0) {
                System.out.println("Book found (Binary Search): " + books[mid]);
                found = true;
                break;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Book not found using Binary Search.");
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of books: ");
            int n = scanner.nextInt();
            scanner.nextLine(); 
            Book[] books = new Book[n];
            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details of Book " + (i + 1));
                System.out.print("Enter Book ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Enter Title: ");
                String title = scanner.nextLine();
                System.out.print("Enter Author: ");
                String author = scanner.nextLine();

                books[i] = new Book(id, title, author);
            }
            Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase()));
            System.out.print("\nEnter book title to search: ");
            String searchTitle = scanner.nextLine();
            linearSearch(books, searchTitle);
            binarySearch(books, searchTitle);
        }
    }
}