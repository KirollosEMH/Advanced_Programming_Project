public class Order {
    private Users user;
    private Books book;
    
    public Order(Users user, Books book) {
        this.user = user;
        this.book = book;
    }

    public Users getUser() {
        return user;
    }

    public Books getBook() {
        return book;
    }
}
