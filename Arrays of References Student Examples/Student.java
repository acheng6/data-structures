
/**
 * An class to demsonstrate the equals( ) and the
 * compareTo( ) methods,
 * 
 * @author L. Lehmann 
 * @version v1
 */
public class Student
{
    
    private String lastName;
    private String firstName;
    private int ID;
    private double gpa;
    private int creditHours;
    
   
    
    public Student()
    {
        lastName = new String("unknown");
        firstName = new String("unknown");
        ID = 0;
        gpa = 0.0;
        creditHours = 0;
           
    }
    
    public Student(String inLast, String inFirst, int inID, double inGPA, int inCredits)
    {
        lastName = new String(inLast);
        firstName = new String(inFirst);
        ID = inID;;
        gpa = inGPA > 0?inGPA:0;
        creditHours = inCredits> 0?inCredits:0;
    }
       
    public String toString( )
    {   return  "\nStudent Name: " + this.lastName + ", " + firstName
               + "\tID: " + this.ID + "\tGPA: " + this.gpa + "\tCredits: " + creditHours;
    }
   
    //The equals( ) method must return a boolean.
    //When you write this code, you determine what fields to
    //use to determine if two Student objects should be consisdered equal.
    //Notice the paramter is a reference to another Student
    //Write this equals( ) method based on the ID field
    
    
    
    //The compareTo( ) method must return an int.
    //When you write this code, you determine what fields to
    //use to determine the ordering of two Student objects.
    //Notice the paramter is a reference to another Student
    //Write the compareTo( ) method based on the fields
   
    
    public void setGPA(double inG)
    {
        gpa = inG >= 0? inG:gpa;
    }
    
     public void setCredits(double inCredits)
    {
        gpa = inCredits >= 0? inCredits:inCredits;
    }
    
    
    
   
    
}
