/**
   A class to test the Employee class.
*/
public class EmployeeTester
{
   public static void main(String[] args)
   {
      Employee employee = new Employee();
/**
 * Establishes employee to be tested
 */
      employee.Name();
      employee.Salary(10,000);
      employee.raiseSalary(2,000);
/**
 * returns variables for raise and salary
 */
      double raise = employee.getSalary();
      double salary = employee.getSalary();
      /**
       * prints employee, salary, and raise
       */
      System.out.println(raise);      
      System.out.println(employee); 
      System.out.println(salary);
   }
}