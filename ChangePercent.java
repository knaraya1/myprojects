import java.util.Scanner; 
public class ChangePercent
{ 
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in); //get the scanner keyboard
      
      System.out.println("What is the stock symbol?"); //get the stock symbol from the user
      String stockSymbol = keyboard.nextLine();
      
      System.out.println("What is the stock name?"); //get the stock name from the user
      String stockName = keyboard.nextLine();
      
      System.out.println("What is the closing price of the stock the prior day?"); //get the prior stock price from the user
      double stockPriorClosingPrice = keyboard.nextDouble();
      
      System.out.println("What is the current price of the stock?"); //get the current price of the stock from the user
      double stockCurrentPrice = keyboard.nextDouble();
      
      Stock stock1 = new Stock(stockSymbol, stockName, stockPriorClosingPrice, stockCurrentPrice); //create a new stock instance and pass the user entered variables through the constructor
      System.out.printf("The percentage change of " + stockName + " from " + stockPriorClosingPrice + " to " + stockCurrentPrice + " is %.2f ", stock1.getChangePercent()); //print the stock name, the prior price, current price, and percentage change
   
   }
}
