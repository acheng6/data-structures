// Fig. 10.13: SalariedEmployee.java
// SalariedEmployee class extends Employee.

public  class SalariedEmployee extends Employee 
{
   private double weeklySalary;

   public SalariedEmployee( )
   {
    weeklySalary = 0;
   }    
   // constructor
   public SalariedEmployee( String first, String last, 
      String socialSecurityNumber, double salary )
   {
      super( first, last, socialSecurityNumber );
      weeklySalary = salary;
   } 

   // set salaried employee's salary
   public void setWeeklySalary( double salary )
   {
      weeklySalary = salary < 0.0 ? 0.0 : salary;
   } 
    public double earnings()
   {
      return weeklySalary;
   } 

   // return salaried employee's salary
   public double getWeeklySalary()
   {
      return weeklySalary;
   } 
   
   

   // calculate salaried employee's pay;
   // override abstract method earnings in Employee
  
   // return String representation of SalariedEmployee object
   public String toString()
   {
      return "\nsalaried employee: " + super.toString() + weeklySalary;
   } 
   
} // end class SalariedEmployee

