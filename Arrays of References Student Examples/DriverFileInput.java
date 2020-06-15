import java.util.*;
import java.io.*;
/**
 * THis version of the driver reads all the student
 * data from a data file.
 * 
 * @author L. Lehmann 
 * @version v1
 */
public class DriverFileInput
{
   public static void main(String[ ] args)throws IOException
   {
       Student [  ] roster; //declare a reference variable to hold address of array object
       Scanner keyboard;//to read the name of the data file
       Scanner dataFile;//to read data from the file
       StringTokenizer stok; //to break each line of input into the
                             //pieces needed to create a Student
       
       //local varibles to hold data as it is read in
       int numberOfStudents;
       String last;
       String first;
       int ID;
       double gpa;
       int credits;
       
       keyboard = new Scanner(System.in);
       System.out.print("Enter the path and name of the data file: ");
       dataFile = new Scanner(new File(keyboard.nextLine( ) ));
       //first line of the data file holds a int for number of records in the file
       numberOfStudents = dataFile.nextInt( );
       dataFile.nextLine( );//consume th new line character because next line
                            //of data will be read as a String
       roster = new Student[numberOfStudents];
       
       for(int k = 0; k < roster.length; k++)
       {
           stok = new StringTokenizer(dataFile.nextLine( ),",");
           
           last = stok.nextToken( );
           first = stok.nextToken( );
           ID = Integer.parseInt(stok.nextToken( ) );
           gpa = Double.parseDouble(stok.nextToken( ));
           credits = Integer.parseInt(stok.nextToken( ) );
           //create a Student object and store its address in the array
           roster[k] = new Student(last,first,ID, gpa, credits);
        }
       System.out.println("\nHere are the " + numberOfStudents + " students: ");
       for(int k = 0; k < roster.length; k++)
       {
           System.out.println(roster[k]);
        }
       
       
    }
}
