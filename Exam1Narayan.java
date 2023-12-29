import java.util.Scanner;
public class Exam1Narayan
{
   public static void main(String[] args)
   {
      double recordingInMinutes = 0; //declaring variabels that are inputs from the user
      String nameOfPodcast = " ";
      String couponCode = " "; 
          
      double subTotal = 25.99;
      double subTotalWithTax = 0;   //declaring other variables used for calculations
      double totalCost = 0;
      String podcastType = " ";
      double recordingInHours = 0;
      
      final double SESSIONRATEWITHCOUPON = 6.50; //declaring and initializing constants
      final double SESSIONRATEWITHOUTCOUPON = 8.00;
      final double SALESTAX = 0.0475;
      final String TITLENAME = "Welcome to the CPCC Podcast Studios";
      
      Scanner keyboard = new Scanner(System.in); //declaring a scanner variable to get inputs from user
      
      System.out.println(TITLENAME); //print title
      System.out.println();
      System.out.print("Enter the duration of the podcast in minutes: ");
      recordingInMinutes = keyboard.nextDouble(); //get users input of recording in minutes
      
      nameOfPodcast = keyboard.nextLine(); //clear the buffer
      
      System.out.print("Enter the name of the podcast recorded: ");
      nameOfPodcast = keyboard.nextLine(); //get users input of the name of the podcast
      
      System.out.print("Do you have a coupon? Enter yes or no: ");
      couponCode = keyboard.nextLine(); //get users input of whether to use a coupon code
      
      if (recordingInMinutes >= 120) // Selection structure for podcast type
         podcastType = "Long";
      else if (recordingInMinutes >= 81)
         podcastType = "Standard";
      else if (recordingInMinutes >= 60)
         podcastType = "Short form";
      else
         podcastType = "Not categorized";      
         
      if (couponCode.equalsIgnoreCase("yes") && (recordingInMinutes >= 60)) //selection structure to apply coupon code
         subTotal = subTotal + ((recordingInMinutes / 60) * SESSIONRATEWITHCOUPON);
      else
         subTotal = subTotal + ((recordingInMinutes / 60) * SESSIONRATEWITHOUTCOUPON);
       
      subTotal = subTotal + ((recordingInMinutes - 60) * 0.25);//25 cent fee for every minute over or under 60 minutes     
      subTotalWithTax = subTotal * SALESTAX;//calculating the subtotal with salestax
      totalCost = subTotal + subTotalWithTax;//calculating the total cost by adding the subtotal with the subtotal with tax
      
      recordingInHours = recordingInMinutes / 60;
      
                 
      System.out.println();
      System.out.println("Podcast Name: " + nameOfPodcast);
      System.out.printf("Recording Duration : %.0fHour(s) and %.0fMinute(s)\n", recordingInHours, recordingInMinutes);
      System.out.println();
      System.out.printf("Subtotal: $%,.2f\n",  subTotal);
      System.out.printf("Sales Tax: $%,.2f\n", subTotalWithTax);
      System.out.printf("Final Total: $%,.2f\n", totalCost); 
      System.out.println("Podcast Type: " + podcastType);
      
      
      
         
         
         
         
      
      }
}