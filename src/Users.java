public class Users extends Library{
    
    private String Password;
    private String FirstName;
    private String LastName;
    private String Address;
    private String CellPhone;
    private String Email;
    private boolean Blocked;
    private static int UserCount = 0;
    public Users(String Password, String FirstName, String LastName, String Address, String CellPhone, String Email, boolean Blocked) {
        
        this.Password = Password;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.CellPhone = CellPhone;
        this.Email = Email;
        this.Blocked = Blocked;
        
        UserCount++;
    }
    /*
    public Users(int iD2, String password2, String firstName2, String lastName2, String address2, String cellPhone2,
            String email2) {
    }
    */
    


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

    public static int getUserCount() {
        return UserCount;
    }
    public String toString() {
        return 
                " Name: " + FirstName + " " + LastName +
                ", Address: " + Address +
                ", Cellphone: " + CellPhone +
                ", Email: " + Email +
                ", Blocked: " + Blocked;
    }
}
