import java.util.Scanner;
public class RestaurantBill
{
   public static void main(String[] args)
   {
   final double TAX = 0.0675;
   final double TIP = 0.2;
   double mealCharge;
   
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("What is the charge for the meal?");
   mealCharge = keyboard.nextDouble();
   
   System.out.println("The charge for the meal is " + mealCharge);
   System.out.println("The tax amount is " + mealCharge * TAX);
   double tipCharge = ((mealCharge * TAX) + mealCharge) * TIP;
   System.out.println("The tip amount is " + tipCharge);
   System.out.println("The total bill for the meal is " + ((mealCharge * TAX) + (tipCharge) + (mealCharge)));
   
   }
   
}
   
   
   