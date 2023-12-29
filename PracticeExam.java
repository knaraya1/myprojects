import java.util.Scanner;
public class PracticeExam
{
   public static void main(String[] args)
   {
      int gasolineType;
      int octaneRating;
      double gasCost = 0;
      double numLiters;
      double numGallons;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("1. Discount\n2. Premium");
      gasolineType = keyboard.nextInt();
      
      System.out.println("Enter the octane rating");
      octaneRating = keyboard.nextInt();
      
      System.out.println("Enter the amount of gasoline in liters");
      numLiters = keyboard.nextDouble();
 
      numGallons = numLiters * 0.264172;
      
      if (gasolineType == 1)
      {
         gasCost = (2.49 - (100 - octaneRating) * 0.01) * numGallons;
      }
      else if (gasolineType == 2)
      {
         gasCost = (2.99 - (100 - octaneRating) * 0.01) * numGallons;
      }
      
      System.out.printf("The cost of gas is $%.2f", gasCost);
      keyboard.close();
      
      }
}
   