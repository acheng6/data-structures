
/**
 * This is an example of creating an array
 * of object references
 * 
 * @author L. Lehmann 
 * @version v1
 */
public class DriverHardCodedValues
{
   public static void main(String[ ] args)
   {
       Student [  ] roster; //declare a reference variable that can hold the address of an array
       roster = new Student[3]; //create the array. Each of the three slots holds a null reference
       
      // Now create three student objects and store their address in
      // the array elements
       roster[0] = new Student("Alpine","Rory",800123,3.2,45);
       roster[1] = new Student("Bonta","Karl",800345,2.8,30);
       roster[2] = new Student("Camera","Lucy",800567,2.9,60);
       
       for(int k = 0; k < roster.length; k++)
       {
           System.out.println(roster[k]);
        }
       
       
    }
}
