import java.util.*;

class Book {
    int bookId;
    String title;
    boolean isIssued;

    Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.isIssued = false;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Status: " + (isIssued ? "Issued" : "Available"));
        System.out.println("----------------------");
    }
}

public class LMS {
    static Scanner sc = new Scanner(System.in);
    static Book[] books = new Book[100];
    static int count = 0;

    static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        books[count++] = new Book(id, title);
        System.out.println("Book Added Successfully!\n");
    }

    static void displayBooks() {
        if (count == 0) {
            System.out.println("No books available!\n");
            return;
        }

        for (int i = 0; i < count; i++) {
            books[i].display();
        }
    }

    static void issueBook() {
        System.out.print("Enter Book ID to issue: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (books[i].bookId == id) {
                if (!books[i].isIssued) {
                    books[i].isIssued = true;
                    System.out.println("Book Issued Successfully!\n");
                } else {
                    System.out.println("Book already issued!\n");
                }
                return;
            }
        }

        System.out.println("Book not found!\n");
    }

    static void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (books[i].bookId == id) {
                if (books[i].isIssued) {
                    books[i].isIssued = false;
                    System.out.println("Book Returned Successfully!\n");
                } else {
                    System.out.println("Book was not issued!\n");
                }
                return;
            }
        }

        System.out.println("Book not found!\n");
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("---- Library Management System ----");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1: addBook(); break;
                case 2: displayBooks(); break;
                case 3: issueBook(); break;
                case 4: returnBook(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!\n");
            }
        } while (choice != 5);
    }
}