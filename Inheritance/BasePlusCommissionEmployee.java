// Fig. 10.16: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee class extends CommissionEmployee.

public class BasePlusCommissionEmployee extends CommissionEmployee 
{
   private double baseSalary;  // base salary per week

   // constructor
   public BasePlusCommissionEmployee( String first, String last, 
      String socialSecurityNumber, double grossSalesAmount,
      double rate, double baseSalaryAmount )
   {
      super( first, last, socialSecurityNumber, grossSalesAmount, rate );
      baseSalary= baseSalaryAmount ;
   } 

   // set base-salaried commission employee's base salary
   public void setBaseSalary( double salary )
   {
      baseSalary = salary < 0.0 ? 0.0 : salary;
   } 

   // return base-salaried commission employee's base salary
   public double getBaseSalary()
   {
      return baseSalary;
   } 

   // calculate base-salaried commission employee's earnings;
   // override method earnings in CommissionEmployee
   public double earnings()
   {
      return baseSalary + super.earnings();
   } 

   // return String representation of BasePlusCommissionEmployee
   public String toString()
   {
      return "\nbase-salaried commission employee: " +
         super.getFirstName() + " " + super.getLastName() +
         "\nsocial security number: " + super.getSocialSecurityNumber();
   } 
   
} // end class BasePlusCommissionEmployee

