import java.util.*;
/**
 * The example using a loop and calling the
 * no-args constructor created student objects
 * with meaninless values for their fields
 * 
 * @author L. Lehmann
 * @version v1
 */
public class DriverUserTypesInput
{
   public static void main(String[ ] args)
   {
       Student [  ] roster; //declare a reference variable
       roster = new Student[3]; //create an array
       //local varibae to hold data as it is read in
       String last;
       String first;
       int ID;
       double gpa;
       int credits;
       
       Scanner input;
       
       input = new Scanner(System.in);
       for(int k = 0; k < roster.length; k++)
       {
           System.out.print("Enter last name for student " + (k+1) + ": ");
           last = input.nextLine( );
           System.out.print("Enter first name for student " + (k+1) + ": ");
           first = input.nextLine( );
           System.out.print("Enter ID student " + (k+1) + ": ");
           ID = input.nextInt( );
           System.out.print("Enter GPA for student " + (k+1) + ": ");
           gpa = input.nextDouble( );
           System.out.print("Enter credit hours for student " + (k+1) + ": ");
           credits = input.nextInt( );
           input.nextLine( );
           //finally, create a Student object and assign its
           //address to a slot in the array
           roster[k] = new Student(last, first, ID, gpa, credits);
        }
           
       for(int k = 0; k < roster.length; k++)
       {
           System.out.println(roster[k]);
        }
       
       
    }
}
