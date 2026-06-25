package library;

public class LibraryCard {
    Book book;
    String borrowerName;

    public LibraryCard(Book book, String borrowerName) {
        this.book = book;
        this.borrowerName = borrowerName;
    }

    public void showDetails() {
        System.out.println("====== Library Card ======");
        System.out.println("Book      : " + book.getTitle());
        System.out.println("Author    : " + book.getAuthor());
        System.out.println("Pages     : " + book.getPages());
        System.out.println("Borrower  : " + borrowerName);
        System.out.println("==========================");
    }
}
