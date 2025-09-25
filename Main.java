import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Show Books");
            System.out.println("6. Show Users");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter Book ID: ");
                int bookId = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Book Title: ");
                String title = sc.nextLine();
                System.out.print("Enter Author Name: ");
                String author = sc.nextLine();
                library.addBook(new Book(bookId, title, author));
                System.out.println("Book added successfully!");
            } else if (choice == 2) {
                System.out.print("Enter User ID: ");
                int userId = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter User Name: ");
                String userName = sc.nextLine();
                library.addUser(new User(userId, userName));
                System.out.println("User added successfully!");
            } else if (choice == 3) {
                System.out.print("Enter Book ID to issue: ");
                int issueBookId = sc.nextInt();
                System.out.print("Enter User ID: ");
                int issueUserId = sc.nextInt();
                library.issueBook(issueBookId, issueUserId);
            } else if (choice == 4) {
                System.out.print("Enter Book ID to return: ");
                int returnBookId = sc.nextInt();
                System.out.print("Enter User ID: ");
                int returnUserId = sc.nextInt();
                library.returnBook(returnBookId, returnUserId);
            } else if (choice == 5) {
                System.out.println("\n Books in Library:");
                library.showBooks();
            } else if (choice == 6) {
                System.out.println("\n Users:");
                library.showUsers();
            } else if (choice == 0) {
                System.out.println("Exiting program...");
            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}
