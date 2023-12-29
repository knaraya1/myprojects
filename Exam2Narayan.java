import java.util.Scanner; 
public class Exam2Narayan
{ 
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      String calculateAnother = "Y";
      int counter = 0;
      
      while (calculateAnother.equalsIgnoreCase("Y"))
      {
         int menuChoice = displayMenu();
         double propertyValue = propertyValue();
         String homesteadStatus = residentialProperty();
         String propertyType = propertyType(menuChoice);
         double millageRate = millageRate(menuChoice);
         double propertyTax = propertyTax(menuChoice, millageRate, homesteadStatus, propertyValue);
         displayMethod(propertyType, propertyValue, propertyTax);
         
         System.out.println();
         System.out.println();
         System.out.print("Calculate Another? Y = yes, N = no: ");
         calculateAnother = keyboard.nextLine();
         System.out.println();
         counter = counter + 1;
      }
      System.out.println();
      System.out.println();
      System.out.println("Total properties processed: " + counter);
       
   }
   public static int displayMenu()
   {
      Scanner keyboard = new Scanner(System.in);
      int choice;
      System.out.println("Choose a property from the list below:");
      System.out.println("1. Residential");
      System.out.println("2. Religious");
      System.out.println("3. Commercial");
      System.out.print("Enter choice here: ");
      choice = keyboard.nextInt();
      return choice;
    }
   public static double propertyValue()
   {
     Scanner keyboard = new Scanner(System.in);
     double value;
     System.out.print("Enter property value: ");
     value = keyboard.nextDouble();
     while (value < 50000 || value > 900000)
     {
         System.out.print("Please enter a value between 50000 and 900000: ");
         value = keyboard.nextDouble();
     }
     return value;
   }
   public static String residentialProperty()
   {
      Scanner keyboard = new Scanner(System.in);
      String decision;
      System.out.print("Provision Homestead? Y = yes, N = no: ");
      decision = keyboard.nextLine();
      return decision;
      
   }
   public static String propertyType(int c)
   {
      String propertyType = " ";
      if (c == 1)
         propertyType = "Residential";
      else if (c == 2)
         propertyType = "Religious";
      else
         propertyType = "Commercial";
      return propertyType;
    }
    public static double millageRate(int c)
    {
      double millageRate;
      if (c == 1)
         millageRate = 7.50;
      else if (c == 2)
         millageRate = 8.00;
      else
         millageRate = 9.00;
      return millageRate;
    }
    public static double propertyTax(int menuChoice, double millageRate, String homesteadStatus, double propertyValue)
    {
      if (homesteadStatus.equalsIgnoreCase("y") && menuChoice == 1)
         propertyValue = propertyValue - 50000;
      double tax = (millageRate * propertyValue) / 1000;
      return tax;
    }
    public static void displayMethod(String propertyType, double propertyValue, double propertyTax)
    {
      System.out.println();
      System.out.println("Property type: " + propertyType);
      System.out.printf("The value, $%,.2f, is the property value\n", propertyValue);
      System.out.printf("The property tax is: $%,.2f\n", propertyTax);
    }
 
 
}
