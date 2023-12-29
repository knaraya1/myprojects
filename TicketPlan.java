public class TicketPlan
{
   private String familyLastName; //fields for the TicketPlan Class
   private double ticketPlan;
   private double numAdults;
   private double numChildren;
   private double numDays;
   private double costPerDayForAdult;
   private double costPerDayForChild;
   
   public TicketPlan() //no arg constructor for TicketPlan class
   {
      familyLastName = "LastName";
      ticketPlan = 0;
      numAdults = 0;
      numChildren = 0;
      numDays = 0;
   }
   public TicketPlan(String lastname, double plan, double adults, double children, double days)
   {
      familyLastName = lastname; //constructor for TicketPlan class that accepts arguments
      ticketPlan = plan;
      numAdults = adults; 
      numChildren = children;
      numDays = days;
   }
   public void setLastName(String settingLastName)
   {
      familyLastName = settingLastName; //setter for last name
   }
   public void setTicketPlan(double settingTicketPlan)
   {
      ticketPlan = settingTicketPlan; //setter for ticket plan
   }
   public void setNumAdults(double settingNumAdults)
   {
      numAdults = settingNumAdults; //setter for number of adults
   }
   public void setNumChildren(double settingNumChildren)
   {
      numChildren = settingNumChildren; //setter for number of children
   }
   public void setNumDays(double settingNumDays)
   {
      numDays = settingNumDays; //setter for number of days
   }
   public String getLastName()
   {
      return familyLastName; //getter for the last name
   }
   public String getTicketPlan() //getter for the ticketplan
   {
      String ticketPlanType = " ";
      if (ticketPlan == 1)
         ticketPlanType = "Amusement Park Only";
      else if (ticketPlan == 2)
         ticketPlanType = "Water Park Only";
      else if (ticketPlan == 3)
         ticketPlanType = "Both Parks";     
      return ticketPlanType;
   }
   public double getNumAdults()
   {
      return numAdults; //getter for the number of aduts
   }
   public double getNumChildren()
   {
      return numChildren; //getter for the number of children
   }
   public double getNumDays()
   {
      return numDays; //getter for the number of days
   }
   public double getCostPerDayAdult()
   {      
      if (ticketPlan == 1) //getter for the cost per day for adults
      {
         if (numDays > 4)
            costPerDayForAdult = 94.99;
         else if (numDays > 0)
            costPerDayForAdult = 104.99;
      }
      if (ticketPlan == 2)
      {
         if (numDays > 4)
            costPerDayForAdult = 79.99;
         else if (numDays > 0)
            costPerDayForAdult = 84.99;
      }
      if (ticketPlan == 3)
      {
         if (numDays > 4)
            costPerDayForAdult = 149.99;
         else if (numDays > 0)
            costPerDayForAdult = 169.99;
      }
      return costPerDayForAdult;
   }
   public double getCostPerDayChild()
   {      
      if (ticketPlan == 1) //getter for cost per day for children
      {
         if (numDays > 2)
            costPerDayForChild = 47.49;
         else if (numDays > 0)
            costPerDayForChild = 52.49;
      }
      if (ticketPlan == 2)
      {
         if (numDays > 2)
            costPerDayForChild = 39.99;
         else if (numDays > 0)
            costPerDayForChild = 42.49;
      }
      if (ticketPlan == 3)
      {
         if (numDays > 2)
            costPerDayForChild = 74.99;
         else if (numDays > 0)
            costPerDayForChild = 84.99;
      }
      return costPerDayForChild;
   }
   public double getPlanPrice()
   {
      getCostPerDayChild(); //getter for the total plan price
      getCostPerDayAdult();
      double planPrice = ((costPerDayForChild * numChildren) + (costPerDayForAdult * numAdults)) * numDays;
      return planPrice;
   }
}