public abstract class Book {
    protected int id;
    protected String title;
    protected String author;
    protected String publisher;
    protected int year;
    protected int pages;

    public Book(int id, String title, String author,String publisher, int year, int pages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " : " + title + " by " + author +" (" + year + "), pages=" + pages;
    }
}
