import java.io.*;
class Book 
{
    private String bookName;
    private String ISBN;
    private String author;
    private String publisher;
    
    public Book() {  //test[1]
        bookName = "Timeless advice";
        ISBN = "\n978-3-16-148410-0";
        author = "\nNapoleon Hill";
        publisher = "\nJaicobooks";
    }
    public Book (String bn, String isbn, String au, String pb)
    {
        bookName = bn;
        ISBN = isbn;
        author = au;
        publisher = pb;
    }
    
    public void setBookName(String bn){
        bookName = bn;
    }
    public void setISBN(String isbn){
        ISBN = isbn;
    }
    public void setAuthor(String au){
        author = au;
    }
    public void setPublisher(String pb){
        publisher= pb;
    }
    
    String getBookName(){
        return bookName;
    }
    String getISBN(){
        return ISBN;
    }
    String getAuthor(){
        return author;
    }
    String getPublisher(){
        return publisher;
    }
    public void getBookInfo(){
        System.out.printf("%s %s %s %s", bookName,ISBN,author,publisher);
    }
}
public class ArrayOfBooks{
    public static void main(String args[ ]){
        Book test[] = new Book[30];
        test[1] = new Book();
        test[1].getBookInfo();
    }
}




