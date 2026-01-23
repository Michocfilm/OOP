import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class LibraryBook extends Book implements BorrowAble {
    private Type type;
    private boolean isAvailable = true;
    private LocalDate borrowDate;

    public LibraryBook(int id, String title, String author,String publisher, int year, int pages,Type type) {
        super(id, title, author, publisher, year, pages);
        this.type = type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public boolean checkoutItem(int yy, int mm, int dd) {
        if (type != Type.PRINT || !isAvailable)return false;
        borrowDate = LocalDate.of(yy, mm, dd);
        isAvailable = false;
        return true;
    }

    @Override
    public long returnItem(int yy, int mm, int dd) {
        if (isAvailable)return 0;
        LocalDate today = LocalDate.of(yy, mm, dd);
        long daysBetween = ChronoUnit.DAYS.between(borrowDate, today);
        isAvailable = true;
        if (daysBetween > 7)return daysBetween - 7;
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() +" [LibraryBook : " + type +", available=" + isAvailable + "]";
    }
}
