import java.util.HashMap;
public class Library {
    static HashMap<Integer, Book> allBooks = new HashMap<>();

    static {
        allBooks.put(1,new LibraryBook(1,"Charlotte's Web","EB White","abc",1952,100,Type.PRINT));
        allBooks.put(2,new LibraryBook(2,"Charlotte's Web","EB White","abc",1952,100,Type.ECOPY));
        allBooks.put(3,new LibraryBook(3,"The BFG","Roald Dahl","abc",1982,300,Type.PRINT));
        allBooks.put(4,new LibraryBook(4,"The Little Prince","Antoine de Saint-Exupéry","abc",1943,200,Type.ECOPY));
        allBooks.put(5,new ArchiveMaterial(5,"My Mister","not KBS","abc",2018,400,Status.READY));
        allBooks.put(6,new ArchiveMaterial(6,"Sword Snow Stride","CNTV","abc",2018,500,Status.REPAIRED));
    }

    public Book getBookById(int id) {
        return allBooks.get(id);
    }

    public boolean checkOut(Book b, int yy, int mm, int dd) {
        if (b instanceof LibraryBook) {
            LibraryBook lb = (LibraryBook) b;
            return lb.checkoutItem(yy, mm, dd);
        }
        return false;
    }

    public void checkIn(Book b, int yy, int mm, int dd) {
        if (!(b instanceof LibraryBook)) {
            System.out.println("The item has not been check out");
            return;
        }
        LibraryBook lb = (LibraryBook) b;

        if (lb.isAvailable()) {
            System.out.println("The item has not been check out");
            return;
        }
        long lateDays = lb.returnItem(yy, mm, dd);

        if (lateDays == 0) {
            System.out.println("see you next time");
        } else {
            System.out.println("Pay fine for " + lateDays + " days.");
        }
    }
}
