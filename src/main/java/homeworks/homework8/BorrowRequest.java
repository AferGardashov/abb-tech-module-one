package homeworks.homework8;

public class BorrowRequest{

    public String borrowerName;

    public String isbn;


    public BorrowRequest(String borrowerName, String isbn) {
        this.borrowerName = borrowerName;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "BorrowRequest{" +
                "borrowerName='" + borrowerName + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

}
