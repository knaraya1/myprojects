public class Stock
{
   private String symbol; //the data field with the symbol, name, prior closing price, and current price
   private String name;
   private double priorClosingPrice;
   private double currentPrice;
   
   public Stock(String sym, String nam, double prior, double current)
   {
      symbol = sym; //the constructor that accepts 4 arguments (the symbol, name, prior closing price, and current price)
      name = nam;
      priorClosingPrice = prior;
      currentPrice = current;
   }
   public double getChangePercent() //a method which returns the percentage change from the prior closing price to he current price
   {
      double changePercent = ((currentPrice - priorClosingPrice) / priorClosingPrice) * 100;
      return changePercent;
   }
}