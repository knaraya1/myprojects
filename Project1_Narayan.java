import java.util.Scanner;
public class Project1_Narayan
{
   public static void main(String[] args)
   {
      double gpuClockSpeed;
      double cpuClockSpeed;
      int numCores;
      
      double performanceScore = 0;
      int menuChoice;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("What is the GPU clock speed?");
      gpuClockSpeed = keyboard.nextDouble();
      
      System.out.println("What is the CPU clock speed?");
      cpuClockSpeed = keyboard.nextDouble();
      
      System.out.println("What is the number of cores?");
      numCores = keyboard.nextInt();
      
      System.out.println("Computer Hardware Graphics Quality Recommendation Tool");
      
      System.out.println(gpuClockSpeed);
      System.out.println(cpuClockSpeed);
      System.out.println(numCores);
      
      // part 2
      
      System.out.println("1. 1280 x 720 \n2. 1920 x 1080 \n3. 2560 x 1440 \n4. 3840 x 2160 \n");
      
      System.out.println("enter a menu choice of 1, 2, 3, or 4");
      menuChoice = keyboard.nextInt();
      
      if (menuChoice == 1)
      {
      performanceScore = ((5 * gpuClockSpeed) + (numCores * cpuClockSpeed)) * 1;
      System.out.println("1280 x 720");
      System.out.println(performanceScore);
      }
      else if (menuChoice == 2)
      {
      performanceScore = ((5 * gpuClockSpeed) + (numCores * cpuClockSpeed)) * 0.75;
      System.out.println("1920 x 1080");
      System.out.println(performanceScore);
      }
      else if (menuChoice == 3)
      {
      performanceScore = ((5 * gpuClockSpeed) + (numCores * cpuClockSpeed)) * 0.55;
      System.out.println("2560 x 1440");
      System.out.println(performanceScore);
      }
      else if (menuChoice == 4)
      {
      performanceScore = ((5 * gpuClockSpeed) + (numCores * cpuClockSpeed)) * 0.35;
      System.out.println("3840 x 2160");
      System.out.println(performanceScore);
      }
      else
      {
      System.out.println("That is not a valid menu number");
      }
      
      
      
      if (performanceScore > 17000)
      {
      System.out.println("Ultra");
      }
      else if (performanceScore > 15000 && performanceScore <= 17000)
      {
      System.out.println("High");
      }
      else if (performanceScore > 13000 && performanceScore <= 15000)
      {
      System.out.println("Medium");
      }
      else if (performanceScore > 11000 && performanceScore <= 13000)
      {
      System.out.println("Low");
      }
      else
      {
      System.out.println("Unable to play");
      }
      
      
      keyboard.close();
      }
}
      
      
      