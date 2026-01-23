public class ArchiveMaterial extends Book {
    private Status status;
    
    public ArchiveMaterial(int id, String title, String author,String publisher, int year, int pages,Status status) {
        super(id, title, author, publisher, year, pages);
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + " [Archive : " + status + "]";
    }
}
