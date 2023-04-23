import java.util.ArrayList;

public class Library {
    protected static ArrayList<Books> books;
    protected static ArrayList<Users> users;
    protected static ArrayList<Order> orders;
    protected static ArrayList<Loan> loans;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
        orders = new ArrayList<>();
        loans = new ArrayList<>();
    }

}
