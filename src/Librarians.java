public class Librarians extends Users {
    private int ID;
    private String Type;
    private static int LibrarianCount = 0;
    public Librarians(String Password, String FirstName, String LastName, String Address, String CellPhone, String Email, boolean Blocked) {
        super(Password, FirstName, LastName, Address, CellPhone, Email, Blocked);
        this.ID = LibrarianCount;
        this.Type = "Librarian";
    }
    
    public int getID() {
        return ID;
    }

    public void addBook(Books book) {
        Library.books.add(book);
    }

    public void removeBook(Books book) {
        Library.books.remove(book);
    }

    public void addUser(Users user) {

        Library.users.add(user);
    }

    public void removeUser(Users user) {
        Library.users.remove(user);
    }

    public void searchBooks(String title) {
        Library.books.stream().filter(book -> book.getTitle().equals(title)).forEach(System.out::println);
    }

    public void searchMembers(String FirstName, String LastName) {
        Library.users.stream().filter(user -> user.getFirstName().equals(FirstName) && user.getLastName().equals(LastName)).forEach(System.out::println);
    }

    public void addUserToOrderList(Users user, Books book) {
        Order order = new Order(user, book);
        Library.orders.add(order);
    }
    
    public void removeUserFromOrderList(Users user) {
        Library.orders.removeIf(order -> order.getUser().equals(user));
    }
    
    public void blockUser(Users user) {
        user.setBlocked(true);
    }
    
    public void rentBook(Books book) {
        Loan loan = new Loan(this, book);
        Library.loans.add(loan);
    }
    @Override
    public String toString() {
        return "User ID: " + this.ID +
                ", Name: " + super.getFirstName() + " " + super.getLastName() +
                ", Address: " + super.getAddress() +
                ", Cellphone: " + super.getCellPhone() +
                ", Email: " + super.getEmail() +
                ", Blocked: " + (super.Blocked() ? "Yes" : "No");
    }

    public String getType() {
        return Type;
    }
    public static int getLibrarianCount() {
        return LibrarianCount;
    }
    public void makeReaderLibrarian(Readers reader) {
        Librarians librarian = new Librarians(reader.getPassword(), reader.getFirstName(), reader.getLastName(), reader.getAddress(), reader.getCellPhone(), reader.getEmail(), reader.Blocked());
        Library.librarians.add(librarian);
        Library.readers.remove(reader);
    }
}