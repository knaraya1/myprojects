import java.util.ArrayList;
import java.util.Scanner; 
public class TicketPlanDemo
{ 

   static ArrayList<TicketPlan> nameList = new ArrayList<TicketPlan>(); //new ArrayList to hold the TicketPlan objects
   public static void main(String[] args)
   {
      String enterAnotherTicket = "Y";
      Scanner keyboard = new Scanner(System.in); //create new scanner keyboard
      
      
      
      while (enterAnotherTicket.equalsIgnoreCase("Y")) //while loop for the user to enter the data
      {
         System.out.print("Enter the last nae of the family purchasing the plan: ");
         String lastName = keyboard.nextLine(); //get the last name from the user
         
         System.out.println("1. Amusement Park only\n2. Water Parks Only\n3. BothParks\n"); //display ticket plan options
         System.out.print("Select a Ticket Plan from the menu above: ");
         double ticketPlan = keyboard.nextDouble(); //get the ticket plan from the user
         
         while (ticketPlan < 1 || ticketPlan > 3) //validate ticketplan input
         {
            System.out.println("**ERROR** PLEASE ENTER A NUMBER BETWEEN 1 AND 3.");
            ticketPlan = keyboard.nextDouble();
         }
          
         System.out.print("Enter the number of adults on the ticket plan :");
         double numAdults = keyboard.nextDouble();//get the number of aduts from the user
         
         while (numAdults < 1) //validate number of adults input
         {
            System.out.println("**ERROR** AT LEAST 1 ADULT MUST BE ENTERED. TRY AGAIN.");
            numAdults = keyboard.nextDouble();
         }
         
         System.out.print("Enter the number of children on the ticket plan: ");
         double numChildren = keyboard.nextDouble();//get the number of children from the user
         
         while (numChildren < 0)//validate the number of children input
         {
            System.out.println("**ERROR** A NEGATIVE NUMBER OF CHILDREN CANNOT BE ENTERED. TRY AGAIN.");
            numChildren = keyboard.nextDouble();
         }
         
         System.out.print("Enter the number of days the ticket plan covers: ");
         double numDays = keyboard.nextDouble();//get the number of days from the user
         
         while (numDays < 1)//validate the number of days input
         {
            System.out.println("**ERROR** AT LEAST 1 DAY MUST BET ENTERED. TRY AGAIN.");
            numDays = keyboard.nextDouble();
         }
         
         TicketPlan ticket1 = new TicketPlan(lastName, ticketPlan, numAdults, numChildren, numDays);//create a new ticketplan object with the constructor that accepts arguments
         nameList.add(ticket1);//add the ticketplan object to the ArrayList 
         
         System.out.println();
         System.out.print("Do you wish to enter information for another ticket plan (Y/N)? ");
         enterAnotherTicket = keyboard.nextLine(); //ask the user if they want to enter another ticketplan
         enterAnotherTicket = keyboard.nextLine(); //clear the buffer
         
      }
      System.out.println("Ticket Plan Report");
      System.out.println();
      
      displayReport(); //call the displayReport method
      
   }
   
   private static void displayReport()
   {
     
      
      for (int i = 0; i < nameList.size(); i++) //for loop that loops through the ArrayList
      {
  
         TicketPlan ticket1 = nameList.get(i); //display all the information from the objects in the arraylist
         System.out.println("Last Name: " + ticket1.getLastName());
         System.out.println("Ticket Plan Type: " + ticket1.getTicketPlan());
         System.out.println("Number of Adults: " + ticket1.getNumAdults());
         System.out.println("Number of Children: " + ticket1.getNumChildren());
         System.out.println("Number of Days: " + ticket1.getNumDays());
         System.out.printf("Price of Ticket Plan: $%.2f", ticket1.getPlanPrice());
         System.out.println();
         
      }

   }
}