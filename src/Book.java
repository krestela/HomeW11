public class Book {
    private String title;
    private final Object Author;
    private int year;


    public Book(String title, Object Author, int year) {
        this.title = title;
        this.Author = Author;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public Object getAuthor() {
        return Author;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }


}
