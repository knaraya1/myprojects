import java.util.Scanner; 
public class Project4
{ 
   public static void main(String[] args)
   {
      int numOfComputers;
      double gpuClockSpeed;
      int cpuCoreNumber;
      int monitorResolution;
      
      String monitorResolutionAsString;
      String recommendedQualitiy;
      
      double multiplier;
      double performancescore;
      
      boolean = true
      
      double CLOCK_SPEED_GPU_LOW_THRESHOLD = 800;   
      double CLOCK_SPEED_GPU_HI_THRESHOLD = 2000;
      double CLOCK_SPEED_CPU_LOW_THRESHOLD = 1000;   
      double CLOCK_SPEED_CPU_HI_THRESHOLD =5500;
      
      int CORES_LOW_THRESHOLD = 1;
      int CORES_HI_THRESHOLD = 20;
      
      Scanner keyboard = new Scanner(System.in);
      
      numOfComputers = getNumComputers();
      
      displayTitle();
      
      for (int counter; counter <= numOfComputers; counter++)
      {
         System.out.print("Please enter the clock speed (in Megahertz) of your graphics card: ");
         gpuClockSpeed = keyboard.nextDouble();
         
         while (gpuClockSpeed < CLOCk_SPEED_GPU_LOW_THRESHOLD || gpuClockSpeed > CLOCK_SPEED_GPU_HI_THRESHOLD)
         {
            System.out.println("The clock speed should be between " + CLOCK_SPEED_GPU_LOW_THRESHOLD + " and " + CLOCK_SPEED_GPU_HI_THRESHOLD + " Megahertz.");
            System.out.print("Please enter the clock speed (in Megahertz) of your graphics card: ");
         }
          
         System.out.print("Please enter the clock speed (in Megahertz) of your processor: ");
         cpuClockSpeed = keyboard.nextDouble();
         
         while (cpuClockSpeed < CLOCK_SPEED_CPU_LOW_THRESHOLD || cpuClockSpeed > CLOCK_SPEED_CPU_HI_THRESHOLD)
         {
            System.out.println("The clockspeed should be between " + CLOCK_SPEED_CPU_LOW_THRESHOLD + " and " + CLOCK_SPEED_CPU_HI_THRESHOLD + " Megahertz");
            System.out.print("Please enter the clock speed (in Megahertz) of your processor :");
         }
         
         System.out.print("Please enter the number of cores of your processor :");
         cpuCoreNumber = keyboard.nextInt():
         
         while (cpuCoreNumbber < CORES_LOW_THRESHOLD || cpuCoreNumber > CORES_HI_THRESHOLD)
         {
            System.out.println("The nmber of cores should be between " + CORES_LOW_THRESHOLD + " and " + CORES_HIGH_THRESHOLD + " MHz");
            System.out.print("Please enter the number of cores of your processor :");
         }
         
         System.out.println("What is the resolution of your monitor?");
         System.out.println("1. 1280 x 720");
         System.out.println("2. 1920 x 1080");
         System.out.println("3. 2560 x 1440");
         System.out.println("4. 3840 x 2160");
         
         System.out.print("Please select from the options above (1, 2, 3, or 4): ");
         monitorResolution = keyboard.nextInt();
         
         while (monitorResolution < 1 || monitorResolution > 4)
            System.out.println("Invalid menu selction. Please select from the options above :");
         
         getResolutionString(monitorResolution);
         
         getMultiplierValue();
         
         calculatePerformanceScore();
         
         displayInofrmation();
         
         if (firstComputer)
         {
            highestPerformanceScore = performanceScore;
            lowestPerformanceScore = performanceScore;
            firstComputer = false;
         }
         else
         {
            if (performanceScore > highestPerformanceScore)
               highestPerformanceScore = performanceScore;
            if (performanceScore < lowestPerformanceScore)
               lowestPerformanceScore = performanceScore;
         }
      }
      
      System.out.printf("The lowest performance score is %.4f", lowestPerformanceScore);
      System.out.printf("The highest performance score is %.4f", highestPerformanceScore);
      
      
      }
      
      public static int getNumComputers()
      {
         Scanner keyboard = new Scanner(System.in);
         int numOfComputers = keyboard.nextInt();
         
         while (numOfComputers < 1)
            System.out.println("Error: The number must be 1 or higher. Try again. ")
         
         return numOfComputers;
       }
       
       public static void displayTitle()
       {
         System.out.println("Graphics Quality Recommendation Tool");
       }
       public static void
       
}

      
      
      