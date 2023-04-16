public class Readers extends Users {
    private String Type;

    public Readers(String ID, String Password, String FirstName, String LastName, String Address, String CellPhone, String Email, boolean Blocked, String Type) {
        super(ID, Password, FirstName, LastName, Address, CellPhone, Email, Blocked);
        this.Type = Type;
    }

    public String getType() {
        return Type;
    }
    public void searchBooks(String Title) {
    }
    
    public void searchMembers(String FirstName, String LastName) {
    }
    
    public void addSelfToOrderList(Books book) {
    }
    
    public void rentBook(Books book) {
    }    
}
