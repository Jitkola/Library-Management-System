import java.util.*;

public class Library {

    //since library consist of holding the books and data
    private ArrayList<Book> books;
    private ArrayList<User> users;

    //now we create constrctor
    public Library(){
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    // now adding a book into library
    public void addBook(Book book){
        books.add(book);
    }

    // now adding user into library
    public void addUser(User user){
        users.add(user);
    }

    // now issuing book to user
    public void issueBook(int bookId, int userId) {
        Book bookToIssue = null;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == bookId) {
                bookToIssue = books.get(i);
                break;
            }
        }

        User user = null;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == userId) {
                user = users.get(i);
                break;
            }
        }

        if (bookToIssue != null && user != null && bookToIssue.isAvailable()) {
            bookToIssue.setAvailable(false); 
            user.borrowBook(bookToIssue);   
            System.out.println(user.getName() + " borrowed " + bookToIssue.getTitle());
        } else {
            System.out.println("Book not available or User not found.");
        }
    }

    // now for returning the book
     public void returnBook(int bookId, int userId) {
        Book bookToReturn = null;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == bookId) {
                bookToReturn = books.get(i);
                break;
            }
        }

        User user = null;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == userId) {
                user = users.get(i);
                break;
            }
        }

        if (bookToReturn != null && user != null) {
            bookToReturn.setAvailable(true);
            user.returnBook(bookToReturn);
            System.out.println(user.getName() + " returned " + bookToReturn.getTitle());
        } else {
            System.out.println("Return failed. Book/User not found.");
        }
    }

    // to diplay all books and users
    public void showBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }
    
    public void showUsers() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }

}
