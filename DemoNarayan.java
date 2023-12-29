import java.io.*;
import java.util.Scanner; 
public class DemoNarayan
{ 
   public static void main(String[] args) throws IOException
   {
      Library library = new Library(); //create new library object
      File file = new File("BookList.txt"); //create a new file booklist.txt
      Scanner inputFile = new Scanner(file); //create new file scanner to scan file
      
      
         
         for (int i = 0; i < 35; i++) //iterate through the lines of the booklist.txt file
         {
            
            while (inputFile.hasNext())
            {

               String title = inputFile.nextLine();
               String author = inputFile.nextLine();
               String ISBN = inputFile.nextLine();
               String numPages = inputFile.nextLine();
               String yearPublished = inputFile.nextLine();
               Book newBook = new Book(title, author, ISBN, numPages, yearPublished); //create new book object with the lines in the booklist.txt file
               library.addBook(newBook); //add the newBook object to the library's array list
        
            }
         }
         
      
      inputFile.close();
      //display the menu
      Scanner keyboard = new Scanner(System.in); //create a new keyboard scanner object
      boolean continueLoop = true; //use variable to control the while loop
      while (continueLoop) 
      {     //display the menu choice options
         System.out.println("1. Search for a title in the library\n 2.Remove a book from the library\n 3. Display all books in the library\n 4. Display the number of books in the library\n 5. Exit \n Please enter your choice: ");
         int menuChoice = keyboard.nextInt();
      
         if (menuChoice == 1) //menu choice 1 searches the library array list for a book with specific title and prints the contents of the book
         {
            System.out.println("Please enter the title of the book");
            String title = keyboard.nextLine();
            title = keyboard.nextLine();
            Book book = library.searchBook(title);
            if (book != null)
               System.out.println(book.toString());
            else 
               System.out.println("book not found");
          }
         if (menuChoice == 2) //menu choice 2 removes a book based on the ISBN number of the book
         {
            System.out.println("Please enter the ISBN number of the book you want to remove: ");
            String ISBN = keyboard.nextLine();
            ISBN = keyboard.nextLine();
            boolean removedBook = library.removeBook(ISBN);
            if (!removedBook)
               System.out.println("Book not removed");
            else
               System.out.println("Book removed from library");
         }
         if (menuChoice == 3) //menu choice 3 calls the displayAllBooks method to display all the books in the library
         {
            System.out.println("All books in the library\n");
            library.displayAllBooks();   
         }
         if (menuChoice == 4) //menu choice 4 displays the number of books in the menu
         {
            library.displayNumBooks();
         }     
         if (menuChoice == 5)//menu choice 5 exits the loop
         {
            continueLoop = false;
         }
      }
   }
   
}