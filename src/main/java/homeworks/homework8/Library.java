package homeworks.homework8;

import java.util.*;

public class Library {

    private List<Book> list = new LinkedList<>();

    private Set<String> set = new HashSet<>();

    private Queue<BorrowRequest> queue = new LinkedList<>();

    public void addBook(String title, String author, String isbn) {
        list.add(new Book(title, author, isbn));
    }

    public void listBooks() {
        if (list.isEmpty()) {
            System.out.println("No book");
            return;
        }
        for (Book show : list) {
            System.out.println(show);
        }
    }

    public void addBorrowRequest(String borrowerName, String isbn) {
        queue.add(new BorrowRequest(borrowerName, isbn));
    }

    public void processRequest() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        BorrowRequest request = queue.peek();
        String isbn = request.isbn;
        String borrowerName = request.borrowerName;

        for (Book a : list) {
            if (a.getIsbn().equals(isbn)) {
                list.remove(a);
                set.add(borrowerName);
                queue.poll();
                return;
            }
        }
        System.out.println("No book has left with isbn:" + isbn);

    }

    public void listBorrowers() {
        if (list.isEmpty()) {
            System.out.println("No borrowers");
            return;
        }
        for (String show : set) {
            System.out.println(show);
        }
    }

    public void listQueue(){
        if (queue.isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for (BorrowRequest show : queue){
            System.out.println(show);
        }
    }

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook("The Kite Runner", "Khaled Hosseini", "1111");
        library.addBook("1984", "George Orwell", "1112");
        library.addBook("Animal Farm", "George Orwell", "1113");
        library.addBook("The Metamorphosis", "Franz Kafka", "1114");

        library.listBooks();

        library.addBorrowRequest("Name1", "1112");
        library.addBorrowRequest("Name2", "1112");
        library.addBorrowRequest("Name3", "1113");

        System.out.println();
        library.listQueue();
        library.processRequest();
        System.out.println();
        library.listQueue();
        System.out.println();
        library.processRequest();
        System.out.println();
        library.listQueue();
        System.out.println();
        library.listBooks();
        System.out.println();
        library.listBorrowers();
    }

}
