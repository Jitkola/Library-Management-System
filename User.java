import java.util.*;

public class User {

    private int id;
    private String name;
    private ArrayList<Book> borrowedBooks;

    // now we will create constructor for this
    public User(int id, String name){
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    // now will create getters for it
    public int getId(){return id;}
    public String getName(){return name;}
    public ArrayList<Book> getBorrowedBooks(){return borrowedBooks;}

    // borrowed book getting add to list
    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }
    // return and remove from borrowedbooks
    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }

    @Override
    public String toString(){
        return id + " - " + name + " | Borrowed Books: " + borrowedBooks.size();
    }

}
