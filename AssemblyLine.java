public class AssemblyLine
{
   private String name;
   private double widgets;
   private double rejectedWidgets;
   
   public AssemblyLine(String theName, double numWidgets, double numRejectedWidgets)
   {
      name = theName;
      widgets = numWidgets;
      rejectedWidgets = numRejectedWidgets;
   }
   public AssemblyLine()
   {
      name = "AssemblyLine";
      widgets = 0;
      rejectedWidgets = 0;
   }
   public void setName(String settingName)
   {
      name = settingName;
   }
   public void setwidgets(double settingWidgets)
   {
      widgets = settingWidgets;
   }
   public void setrejectedWidgets(double settingRejectedWidgets)
   {
      rejectedWidgets = settingRejectedWidgets;
   }
   public String getName()
   {
      return name;
   }
   public double getWidgets()
   {
      return widgets;
   }
   public double getRejectedWidgets()
   {
      return rejectedWidgets;
   }
   public double acceptableWidgets()
   {
      double acceptableWidgets = widgets - rejectedWidgets;
      return acceptableWidgets;
   }
   public double assemblyLineQuality()
   {
      double acceptableWidgets = widgets - rejectedWidgets;
      double assemblyLineQuality = acceptableWidgets / widgets;
      return assemblyLineQuality;
   }
}

      