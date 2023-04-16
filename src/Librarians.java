public class Librarians extends Users {

    public Librarians(String ID, String Password, String FirstName, String LastName, String Address, String CellPhone, String Email, boolean Blocked) {
        super(ID, Password, FirstName, LastName, Address, CellPhone, Email, Blocked);
    }

    public void addBook(Books book) {
    }

    public void removeBook(Books book) {
    }

    public void addUser(Users user) {
    }

    public void removeUser(Users user) {
    }

    public void searchBooks(String title) {
    }

    public void searchMembers(String FirstName, String LastName) {
    }

    public void addBookToOrderList(Users user, Books book) {
    }
    
    public void removeUserFromOrderList(Users user) {
    }
    
    public void blockUser(Users user) {
    }
    
    public void rentBook(Users user, Books book) {
    }
    
}