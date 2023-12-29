
import javax.swing.JOptionPane;
public class PersonalInformation
{
   public static void main(String[] args)
   { 
      String name;
      String address;
      String telephoneNumber;
      String collegeMajor;
      
      name = JOptionPane.showInputDialog("what is your name?");
      address = JOptionPane.showInputDialog("what is your address?");
      telephoneNumber = JOptionPane.showInputDialog("what is your phone number?");
      collegeMajor = JOptionPane.showInputDialog("What is your college major?");
     
      System.out.println(name + "\n" + address + "\n" + telephoneNumber + "\n" + collegeMajor);
      
      System.exit(0);
      }
}
      