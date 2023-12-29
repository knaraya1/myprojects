public class Book
{
   private String title; //all of the fields for the Book class
   private String author;
   private String ISBN;
   private String numPages;
   private String yearPublished;
   
   public Book(String one, String two, String three, String four, String five) //book class constructor
   {
      title = one;
      author = two;
      ISBN = three;
      numPages = four;
      yearPublished = five;
   }
   public String getTitle() //getters for the Book class
   {
      return title;
   }
   public String getAuthor()
   {
      return author;
   }
   public String getISBN()
   {
      return ISBN;
   }
   public String getNumPages()
   {
      return numPages;
   }
   public String getYearPublished()
   {
      return yearPublished;
   }
   public void setAuthor(String setAuthor) //setters for the book class
   {
      author = setAuthor;
   }
   public void setTitle(String setTitle)
   {
      title = setTitle;
   }
   public void setISBN(String setISBN)
   {
      ISBN = setISBN;
   }
   public void setNumPages(String setNumPages)
   {
      numPages = setNumPages;
   }
   public void setYearPublished(String setYearPublished)
   {
      yearPublished = setYearPublished;
   }
   public String toString() //toString method for the Book class
   {
      return String.format("\nTitle: " + title + "\nAuthor: " + author +
                           "\nISBN: " + ISBN + "\nPages: " + numPages +
                           "\nYear: " + yearPublished);
   }
}