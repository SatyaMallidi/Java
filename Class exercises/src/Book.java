public class Book {
    int bookID;
    String title;
    String author;
    boolean checkedout;

    void checkOut(){
        if(!checkedout){
            checkedout = true;
            System.out.println("The book is ready to checkedout");
        }
        else{
            System.out.println("The book is already checkedout");
        }
    }
    void returnBook(){
        if(checkedout){
            checkedout = false;
            System.out.println("The book is returned successfully");
        }
        else{
            System.out.println("The book is not returned");
        }

    }
    void bookDetails(){
        System.out.println("Book ID : " + bookID);
        System.out.println("Book Title : " + title);
        System.out.println("Book Authour name : " + author);
        System.out.println("Book Status : " +(checkedout? "checked out" : "Available"));

    }
    public static void main(String[] args){
        Book book = new Book();
        book.bookID=101;
        book.title="Harry potter";
        book.author="J.K Rowling";
        book.checkedout=false;

        System.out.println("Initial Book Details:");
        book.bookDetails();

        System.out.println("\nChecking out the book:");
        book.checkOut();
        book.bookDetails();

        System.out.println("\nReturning the book:");
        book.returnBook();
        book.bookDetails();
    }

}
