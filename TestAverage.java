import java.util.Scanner; 
public class TestAverage
{ 
   public static void main(String[] args)
   {   
      Scanner keyboard = new Scanner(System.in);
      
      double test1, test2, test3, test4, test5;
      
      System.out.print("Enter the first test score: ");
      test1 = keyboard.nextDouble();
      
      System.out.print("Enter the second test score: ");
      test2 = keyboard.nextDouble();
      
      System.out.print("Enter the third test score: ");
      test3 = keyboard.nextDouble();
      
      System.out.print("Enter the fourth test score: ");
      test4 = keyboard.nextDouble();
      
      System.out.print("Enter the final test score: ");
      test5 = keyboard.nextDouble();
      
      System.out.println(calcAverage(test1, test2, test3, test4, test5));
      double averaged = calcAverage(test1, test2, test3, test4, test5);
      System.out.println(determineGrade(averaged));
      
   }
   public static double calcAverage(double test1, double test2, double test3, double test4, double test5)
   {
      double average = (test1 + test2 + test3 + test4 + test5) / 5;
      return average;
   }
   
   public static String determineGrade(double average)
   {
      String grade;
      if (average >= 90)
         grade = "A";
      else if (average >= 80)
         grade = "B";
      else if (average >= 70)
         grade = "C";
      else if (average >= 60)
         grade = "D";
      else
         grade = "F";
     return grade;
    } 
}