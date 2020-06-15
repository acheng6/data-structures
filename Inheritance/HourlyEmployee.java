// Fig. 10.14: HourlyEmployee.java
// HourlyEmployee class extends Employee.

public class HourlyEmployee extends Employee 
{
   private double wage;   // wage per hour
   private double hours;  // hours worked for week

   // constructor
   public HourlyEmployee( String first, String last, 
      String socialSecurityNumber, double hourlyWage, double hoursWorked )
   {
         super( first, last, socialSecurityNumber );
         wage = hourlyWage;
         hours = hoursWorked; 
   } 

   // set hourly employee's wage
   public void setWage( double wageAmount )
   {
      wage = wageAmount < 0.0 ? 0.0 : wageAmount;
   } 

   // return wage
   public double getWage()
   {
      return wage;
   } 

   // set hourly employee's hours worked
   public void setHours( double hoursWorked )
   {
      hours = ( hoursWorked >= 0.0 && hoursWorked <= 168.0 ) ?
         hoursWorked : 0.0;
   } 

   // return hours worked
   public double getHours()
   {
      return hours;
   } 

   // calculate hourly employee's pay;
   // override abstract method earnings in Employee
   public double earnings( )
   {
      if ( hours <= 40 )  // no overtime
         return wage * hours;
      else
         return 40 * wage + ( hours - 40 ) * wage * 1.5;
   } 

   // return String representation of HourlyEmployee object
   public String toString()
   {
      return "\nhourly employee: " + super.toString( );
   } 
   
} // end class HourlyEmployee

