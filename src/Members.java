public class Members extends Users {
    private boolean isLibrarian;

    public Members(int ID, String Password, String FirstName, String LastName, String Address, String CellPhone, String Email, boolean isLibrarian) {
        super(ID, Password, FirstName, LastName, Address, CellPhone, Email);
        this.isLibrarian = isLibrarian;
    }

    public boolean isLibrarian() {
        return isLibrarian;
    }

    public void setLibrarian(boolean librarian) {
        isLibrarian = librarian;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Role: " + (isLibrarian ? "Librarian" : "Reader");
    }
}