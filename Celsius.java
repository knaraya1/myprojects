import java.util.Scanner; 
public class Celsius
{ 
   public static void main(String[] args)
   {   
      for (double counter = 0; counter <= 20; counter++)
         System.out.println(counter + " " + celsius(counter));  
   }
   
   public static double celsius(double fahrenheit)
   {
      double result = (5.0 / 9.0)*(fahrenheit - 32);     
      return result;
   }
   
}