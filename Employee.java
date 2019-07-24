/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * puts the Employee class in the employees package
 */
package employees;
import Util.InvalidValueException;

/**
 *
 * @author Alex Henry
 * represents an employee
 */
public abstract class Employee extends Person implements finance.Payable
{
/**
 * sets employeeId to the value of nextId and increments nextId by 1 each time its called
 */
 private int employeeId = nextId++;
 /**
  * The employee's department number
  */
 private int deptNum;
 /**
  * The current pay rate of the employee
  */
 private double payRate;
 /**
  * sets the identification number to 1
  */
 private static int nextId = 1;
 
 /**
  * an empty constructor
  */
 
 public Employee()
 {
     
 }
 /**
  * A constructor all with parameters
  * @param first The employee's first name, it is expected to be a string value.
  * @param last The employee's last name, it is expected to be a string value.
  * @param department The employee's department number, it needs to be a none zero integer.
  * @param pay The employee's pay rate, it is a double none zero number.
  */
 
 public Employee(String first, String last, int department, double pay)
 {
     this(first, last, department);//reference to the department only constructor
     setPayRate(pay);
 }
 /**
  * Name only constructor
  * @param first The employee's first name, it is expected to be a string value.
  * @param last The employee's last name, it is expected to be a string value.
  */
 
 public Employee(String first, String last)
 {
    super(first, last);
 }
 /**
  * Name and department only constructor
  * @param first The employee's first name, it is expected to be a string value.
  * @param last The employee's last name, it is expected to be a string value.
  * @param department The employee's department number, it needs to be a none zero integer.
  */
 
 public Employee(String first, String last, int department)
 {
     this(first, last);//reference to the name only constructor
     setDept(department);
 }
 /**
  * Name and pay rate only constructor
  * @param first The employee's first name, it is expected to be a string value.
  * @param last The employee's last name, it is expected to be a string value.
  * @param pay The employee's pay rate, it is a double none zero number.
  */
 
 public Employee(String first, String last, double pay)
 {
     this(first, last);
     setPayRate(pay);
 }
 /**
  * Allows for access to the employeeId variable.
  * @return The employee's Identification number
  */
 
 public int getEmployeeId()
 {
     return employeeId;
 }
 /**
  * Allows for manual setting of the nextId variable
  * @param nextId Used to increment the employeeId variable, it must be a none zero integer.
  */
 
 public static void setNextId(int nextId)
 {
   Employee.nextId = nextId;
 }
 /**
  * Allows for access to the nextId variable.
  * @return The value of "nextId"
  */
 
 public static int getNextId()//
 {
     return nextId;
 }
 
 /**
  * Allows for setting of the employee's department number
  * @param deptNum The employee's department number, it needs to be a none zero integer.
  */
 public void setDept(int deptNum)
 {
     if(deptNum >= 0)
     {
         this.deptNum = deptNum;
     }
 }
 /**
  * Allows for access to the deptNum variable.
  * @return The value of deptNum
  */
 
 public int getDept()
 {
     return deptNum;
 }
 /**
  * Allows for setting of the employee's pay rate.
  * @param payRate The employee's pay rate, it is a double none zero number.
  */
 
 public void setPayRate(double payRate)
 {
     String errMsg = "\nValue must be greater than 0.\n";
     try
     {
         this.payRate = payRate;
         throw new InvalidValueException(errMsg, this.payRate);
     }
     
     catch(InvalidValueException e)
     {
     }
 }
 /**
  * Allows for access to the payRate variable
  * @return the value of payRate
  */
 
 public double getPayRate()
 {
     return payRate;
 }
 /**
  * Prints out the employee's information to the screen.
  */
 
 public abstract String getPayInfo();
 
}