import java.util.ArrayList;
import java.util.Scanner; 
public class DemoNarayan
{ 
   public static void main(String[] args)
   {
      AssemblyLine line1 = null;
      String averageAssemblyLineQuality;
      double total = 0;
      double average;
      ArrayList<Double> nameList = new ArrayList<Double>();
      
      Scanner keyboard = new Scanner(System.in);
      String enterAnother = "Y";
      
      while (enterAnother.equalsIgnoreCase("Y"))
      {
         System.out.println("What is the name of the assembly line");
         String assemblyLineName = keyboard.nextLine();
         
         System.out.println("Enter the total number of widgets that were manufactured");
         double numWidgets = keyboard.nextDouble();
         
         while (numWidgets < 1)
         {
            System.out.println("Please enter a number greater than 0");
            numWidgets = keyboard.nextDouble();
         }
            
         System.out.println("Enter the number of rejected widgets that were manufactured");
         double numRejectedWidgets = keyboard.nextDouble();
         
         while (numRejectedWidgets < 0 || numRejectedWidgets > numWidgets)
         {
            System.out.println("Please enter a valid number of rejected widgets");
            numRejectedWidgets = keyboard.nextDouble();
         }
         
         line1 = new AssemblyLine(assemblyLineName, numWidgets, numRejectedWidgets);
         nameList.add(line1.assemblyLineQuality());
         
         System.out.println("Do you wish to enter information for another assembly line (Y/N)?");
         enterAnother = keyboard.nextLine();
         enterAnother = keyboard.nextLine();
     }
      for (int index = 0; index < nameList.size(); index++)
      {
         total += nameList.get(index);
         System.out.println("Assembly Line: " + line1.getName());
         System.out.printf("Quality (as a percentage): %.2f\n", nameList.get(index) * 100);
      }
         
      average = total / nameList.size();
      if (average > 95.00)
         averageAssemblyLineQuality = "Excellent";
      else if (average > 90.00)
         averageAssemblyLineQuality = "Good";
      else
         averageAssemblyLineQuality = "Unacceptable";
      System.out.println("The effeciency of the factory is: " + averageAssemblyLineQuality);
         
     }
}         