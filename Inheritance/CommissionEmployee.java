// Fig. 10.15: CommissionEmployee.java
// CommissionEmployee class extends Employee.

public class CommissionEmployee extends Employee
 {
   private double grossSales;      // gross weekly sales
   private double commissionRate;  // commission percentage

   // constructor
   public CommissionEmployee( String first, String last, 
      String socialSecurityNumber, 
      double grossWeeklySales, double percent )
   {
      super( first, last, socialSecurityNumber );
      grossSales = grossWeeklySales;
      commissionRate =  percent ;
   } 

   // set commission employee's rate
   public void setCommissionRate( double rate )
   {
      commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
   } 

   // return commission employee's rate
   public double getCommissionRate()
   {
      return commissionRate;
   } 

   // set commission employee's weekly base salary
   public void setGrossSales( double sales )
   {
      grossSales = sales < 0.0 ? 0.0 : sales;
   } 

   // return commission employee's gross sales amount
   public double getGrossSales()
   {
      return grossSales;
   } 

   // calculate commission employee's pay;
   // override abstract method earnings in Employee
   public double earnings()
   {
      return commissionRate * grossSales;
   } 

   // return String representation of CommissionEmployee object
   public String toString()
   {
      return "\ncommission employee: " + super.toString();
   } 
   
} // end class CommissionEmployee

