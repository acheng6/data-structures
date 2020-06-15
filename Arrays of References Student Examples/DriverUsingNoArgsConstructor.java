/**
 * Another example of creating an array of references.
 * Since it is ridiculus to hard-code values for each
 * object, I use a loop here to create the Student objects.
 * 
 * @author L. Lehmann
 * @version v1
 */
public class DriverUsingNoArgsConstructor
{
   public static void main(String[ ] args)
   {
       Student [  ] roster; //declare a reference variable
       roster = new Student[25]; //create an array
       
       for(int k = 0; k < roster.length;k++)
       {
          roster[k] = new Student( );
       }
       
       
       for(int k = 0; k < roster.length; k++)
       {
           System.out.println(roster[k]);
        }
       
       
    }
}
