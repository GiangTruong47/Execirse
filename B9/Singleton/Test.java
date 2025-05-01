package B9.Singleton;

public class Test {
    public static void main(String[]args) {
        System.out.println("BEGIN TESTING SINGLE PATTERN");

        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println("BookBorrowed1 asked to borrow the book");
        System.out.println("BookBorrowed1 Author and Title: ");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        bookBorrower2.borrowBook();
        System.out.println("BookBorrowed2 asked to borrow the book");
        System.out.println("BookBorrowed2 Author and Title: ");
        System.out.println(bookBorrower2.getAuthorAndTitle());

        bookBorrower1.returnBook();
        System.out.println("BookBorrowed1 returned the book");

        bookBorrower2.borrowBook();
        System.out.println("BookBorrowed2 Author and Title: ");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        System.out.println("END TESTING SINGLETON PATTERN");
    }
}
