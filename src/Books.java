public class Books extends Library{
    private String Title;
    private String Genre;
    private String Author;
    private int ISBN;
    private boolean Available;

    public Books(String Title, String Genre, String Author, int ISBN, boolean Available) {
        this.Title = Title;
        this.Genre = Genre;
        this.Author = Author;
        this.ISBN = ISBN;
        this.Available = true;
    }

    public String getTitle() {
        return Title;
    }

    public String getGenre() {
        return Genre;
    }

    public String getAuthor() {
        return Author;
    }

    public int getISBN() {
        return ISBN;
    }
    
    public void setAvailable(boolean available) {
        Available = available;
    }

    public boolean Available() {
        return Available;
    } 

    
    @Override
    public String toString() {
        return "Book ID: " + ISBN +
                ", Title: " + Title +
                ", Author: " + Author +
                ", Genre: " + Genre +
                ", Availability: " + (Available ? "Available" : "Not Available");
    }

}
