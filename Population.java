import java.util.Scanner;
public class Population
{
   public static void main(String[] args)
   {
      double numOrganisms;
      double dailyIncrease;
      double numDays;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter the number of organisms : ");
      numOrganisms = keyboard.nextDouble();
      
      while (numOrganisms < 2)
      {
         System.out.print("That is not a valid starting population. Try again : ");
         numOrganisms = keyboard.nextDouble();
      }
      
      System.out.print("Enter the % daily increase : ");
      dailyIncrease = keyboard.nextDouble();
      
      while (dailyIncrease < 0)
      {
         System.out.println("That is not a valid % daily increase. Try again : "); 
         dailyIncrease = keyboard.nextDouble();
      }
      
      dailyIncrease = dailyIncrease * 0.01;
      
      System.out.print("Enter the number of days allowed to multiply : ");
      numDays = keyboard.nextDouble();
      
      while (numDays < 0)
      {
         System.out.println("That is not a valid number of days. Try again : ");
         numDays = keyboard.nextDouble();
      }
      
      for (int counter = 2; counter <= numDays; counter++)
      {
         numOrganisms = numOrganisms * dailyIncrease + numOrganisms;
         System.out.printf("Day" + counter + " : %,.0f organisms\n", numOrganisms);
      }
    }
}        
    