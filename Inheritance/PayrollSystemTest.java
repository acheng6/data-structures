// Fig. 10.17: PayrollSystemTest.java
// Employee hierarchy test program.
import java.text.DecimalFormat;
public class PayrollSystemTest {

   public static void main( String[] args ) 
   {
      DecimalFormat twoDigits = new DecimalFormat( "0.00" );

      // create Employee array
      Employee employees[ ] = new Employee[ 4 ];

      // initialize array with Employees
      employees[ 0 ] = new SalariedEmployee( "John", "Smith", 
         "111-11-1111", 800.00 );
      employees[ 1 ] = new CommissionEmployee( "Sue", "Jones", 
         "222-22-2222", 10000, .06 );
      employees[ 2 ] = new BasePlusCommissionEmployee( "Bob", "Lewis", 
         "333-33-3333", 5000, .04, 300 );
      employees[ 3 ] = new HourlyEmployee( "Karen", "Price", 
         "444-44-4444", 16.75, 40 );

      String output = "";

      // generically process each element in array employees
      for ( int i = 0; i < employees.length; i++ )
      {
         output += employees[ i ].toString();
         
         System.out.println(output);

         //determine whether element is a BasePlusCommissionEmployee
         if ( employees[ i ] instanceof BasePlusCommissionEmployee ) 
         {

            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee currentEmployee = 
               ( BasePlusCommissionEmployee ) employees[ i ];

            double oldBaseSalary = currentEmployee.getBaseSalary();
            output += "\nold base salary: $" + oldBaseSalary;      
            
            currentEmployee.setBaseSalary( 1.10 * oldBaseSalary );
            output += "\nnew base salary with 10% increase is: $" +
               currentEmployee.getBaseSalary();

         } // end if

         output += "\nearned $" + employees[ i ].earnings() + "\n";

      } // end for

      // get type name of each object in employees array
      for ( int j = 0; j < employees.length; j++ )
       {  output += "\nEmployee " + j + " is a " +
            employees[ j ].getClass().getName(); 
        }

      System.out.println(output );  // display output
     

   } // end main

} // end class PayrollSystemTest


