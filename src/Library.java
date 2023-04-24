import java.util.ArrayList;

public class Library {
    protected static ArrayList<Books> books = new ArrayList<>();
    protected static ArrayList<Users> users = new ArrayList<>();
    protected static ArrayList<Librarians> librarians = new ArrayList<>();
    protected static ArrayList<Readers> readers = new ArrayList<>();
    protected static ArrayList<Order> orders = new ArrayList<>();
    protected static ArrayList<Loan> loans = new ArrayList<>();

    public Library() {
        
       
    }
    public static void printBooks(){
        books.forEach(System.out::println);
    }
    public static void printUsers(){
        users.forEach(System.out::println);
    }
    public static void printOrders(){
        orders.forEach(System.out::println);
    }
    public static void printLoans(){
        loans.forEach(System.out::println);
    }
    public static void printLibrarians(){
        librarians.forEach(System.out::println);
    }
    public static void printReaders(){
        readers.forEach(System.out::println);
    }
}
