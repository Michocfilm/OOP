public interface BorrowAble {
    boolean checkoutItem(int yy, int mm, int dd);
    long returnItem(int yy, int mm, int dd);
}
