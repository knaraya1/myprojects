import java.util.ArrayList;
public class Library
{
   private ArrayList<Book> bookList; //create new ArrayList call bookList as a field for the Library class
   
   public Library() //constructor for the Library Class
   {
      bookList = new ArrayList<Book>();
   }
   public void addBook(Book book) //a method which adds a book to the bookList
   {
      boolean bookExists = false;
      for (int i = 0; i < bookList.size(); i++)
      {
         Book existingBook = bookList.get(i);
         if (existingBook.getISBN().equals(book.getISBN()))
            bookExists = true;
      }
      if (!bookExists)
         bookList.add(book);     
   }
   public boolean removeBook(String ISBNnumber) //a method which removes a book from the booklist based on the ISBN number
   {
      int index = -1;
      boolean bookFound = false;
      for (int i = 0; i < bookList.size(); i++)
      {
         Book existingBook = bookList.get(i);
         if (existingBook.getISBN().equals(ISBNnumber))
         {
            bookFound = true;
            index = i;
         }
      }
      bookList.remove(index);
      return bookFound;
    }
    public Book searchBook(String title)//method which searches for a book given its title
    {
      boolean bookFound = false;
      for (int i = 0; i < bookList.size(); i++)
      {
         Book existingBook = bookList.get(i);
         if (existingBook.getTitle().equals(title))
         {
            return existingBook;
         }
      }
      return null;
    }
    public void displayAllBooks()//method which displays all the books
    {
      int index = -1;
      boolean bookFound = false;
      for (int i = 0; i < bookList.size(); i++)
      {
         Book existingBook = bookList.get(i);
         System.out.println(existingBook + " ");
      }
    }
    public void displayNumBooks()//method which displays the number of books in the bookList array.
    {
      System.out.println("Number of books in the library:: " + bookList.size());
    }
}
    
    

      
         

      
   