public abstract class Users {
    private String ID;
    private String Password;
    private String FirstName;
    private String LastName;
    private String Address;
    private String CellPhone;
    private String Email;
    private boolean Blocked;

    public Users(String ID, String Password, String FirstName, String LastName, String Address, String CellPhone, String Email, boolean Blocked) {
        this.ID = ID;
        this.Password = Password;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.CellPhone = CellPhone;
        this.Email = Email;
        this.Blocked = false;
    }

    public Users(int iD2, String password2, String firstName2, String lastName2, String address2, String cellPhone2,
            String email2) {
    }

    public String getID() {
        return ID;
    }

    public String getPassword() {
        return Password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getAddress() {
        return Address;
    }

    public String getCellPhone() {
        return CellPhone;
    }

    public String getEmail() {
        return Email;
    }

    public boolean Blocked() {
        return Blocked;
    }
    public void setBlocked(boolean blocked) {
        Blocked = blocked;
    }

    @Override
    public String toString() {
        return "User ID: " + ID +
                ", Name: " + FirstName + " " + LastName +
                ", Address: " + Address +
                ", Cellphone: " + CellPhone +
                ", Email: " + Email +
                ", Blocked: " + (Blocked ? "Yes" : "No");
    }
}
