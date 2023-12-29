import java.util.Scanner;
public class DistanceTraveled
{
   public static void main(String[] args)
   {
      int milesPerHour;
      int hours;
            
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("What is the speed of the vehicle in miles per hour? : ");
      milesPerHour = keyboard.nextInt();
      
      while (milesPerHour < 0)
      {
         System.out.print("Speed cannot be negative, try again : ");
         milesPerHour = keyboard.nextInt();
      }
      
      System.out.print("What is the period of time the vehicle travelled in hours? : ");
      hours = keyboard.nextInt();
      
      while (hours < 1)
      {
         System.out.print("Number of hours cannot be less than one, try again : ");
         hours = keyboard.nextInt();
      }
      
      System.out.println("Hour \tDistance Traveled");
      distanceTravelled(milesPerHour, hours);
      
      }
      
      public static void distanceTravelled(int x, int y)
      {
         for (int counter = 1; counter <= y; counter++)
            System.out.println(counter + "\t\t" + (x * counter));     
      }
      
}