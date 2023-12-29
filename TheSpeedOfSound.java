import java.util.Scanner;
public class TheSpeedOfSound
{
   public static void main(String[] args)
   {
   final int AIR = 1100;
   final int WATER = 4900;
   final int STEEL = 16400;
   double time = 0;
   
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("Enter air, water, or steel");
   String medium = keyboard.nextLine();
   
   System.out.println("Enter the distance in feet");
   double distance = keyboard.nextDouble();
   
   if (medium.equalsIgnoreCase("air"))
   {
      time = distance / AIR;
      System.out.printf("It will take %.2f seconds for the sound to travel in air for %.2f feet", time, distance);
   }
   else if (medium.equalsIgnoreCase("water"))
   {
      time = distance / WATER;
      System.out.printf("It will take %.2f seconds for the sound to travel in water for %.2f feet", time, distance);
   }
   else if (medium.equalsIgnoreCase("steel"))
   {
      time = distance / STEEL;
      System.out.printf("It will take %.2f seconds for the sound to travel in steel for %.2f feet", time, distance);
   }
   else
   {
      System.out.println("That is not a valid medium");
   }
   keyboard.close();
   }
}
