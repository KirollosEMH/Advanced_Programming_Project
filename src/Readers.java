public class Readers extends Users {
    private String Type;
    private static int ReaderCount = 0;
    public Readers(String Password, String FirstName, String LastName, String Address, String CellPhone, String Email, boolean Blocked) {
        super(Password, FirstName, LastName, Address, CellPhone, Email, Blocked);
        this.Type = "Reader";
    }

    public String getType() {
        return Type;
    }
    public void searchBooks(String Title) {
        Library.books.stream().filter(book -> book.getTitle().equals(Title)).forEach(System.out::println);
    }
    
    public void searchMembers(String FirstName, String LastName) {
        Library.users.stream().filter(user -> user.getFirstName().equals(FirstName) && user.getLastName().equals(LastName)).forEach(System.out::println);
    }
    
    public void addSelfToOrderList(Books book) {
        Order order = new Order(this, book);
        Library.orders.add(order);
    }
    
    public void rentBook(Books book) {
        Loan loan = new Loan(this, book);
        Library.loans.add(loan);
    }

    public static int getReaderCount() {
        return ReaderCount;
    }
    
    
}
