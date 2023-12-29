import java.util.Scanner;
public class PracticeExam2
{
   public static void main(String[] args)
   {
      double weightOfPackage = 0; // initializing variables
      double numOfMiles = 0;
      double shippingCharges = 0;
      
      final double RATE10POUNDSORMORE = 3.80; //intializing and delcaring constants
      final double RATE6POUNDSORMORE = 3.70;
      final double RATE2POUNDSORMORE = 2.20;
      final double RATELESSTHAN2POUNDS = 1.10;
      
      Scanner keyboard = new Scanner(System.in); // create scanner variable
      
      System.out.println("Enter the weight of the package in pounds"); //get users input for weight of package
      weightOfPackage = keyboard.nextDouble();
      
      System.out.println("Enter the number of miles"); //get user's input for number of miles
      numOfMiles = keyboard.nextDouble();
      
      if (weightOfPackage >= 10) //set shippingcharges equal to 3.80 if weight is greater than 10 pounds
         shippingCharges = RATE10POUNDSORMORE;
      else if (weightOfPackage >= 6) //set shippingCharges equal to 2.70 if weight is greater than 6 pounds
         shippingCharges = RATE6POUNDSORMORE;
      else if (weightOfPackage >= 2) //set shippingCharges equal to 2.20 if weight is greater than 2 pounds
         shippingCharges = RATE2POUNDSORMORE;
      else                             //set shipipngCharges equal to 1.10 if weight is less than 2 pounds
         shippingCharges = RATELESSTHAN2POUNDS;
         
      shippingCharges = shippingCharges * (numOfMiles / 500); //calculate shipping charges based off of number of miles divided by 500
      
      System.out.println();
      System.out.printf("The shipping charges for your package is $%,.2f\n", shippingCharges); //output the shipping charges rounded to 2 decimal places with comma and dollar sign
      
      }
}
      