/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import Util.InvalidValueException;

/**
 *
 * @author Alex Henry
 */
public class ContractEmployee extends Employee implements finance.Payable
{
    private double hours; //a veriable for hours the employee worked
   
    public ContractEmployee()
    {
        
    }
    
    public ContractEmployee(String first, String last, int department, double pay, double hours)
    {
        super(first, last, department);//reference to the department only constructor of the base class aka "Employee"
        setPayRate(pay);
        setHours(hours);
    }
    
    public ContractEmployee(String first, String last)
    {
        super(first, last);//reference to base class "Employee" which provides access to it's base class "Person"
    }
    
    public ContractEmployee(String first, String last, int department)
    {
        this(first, last);//reference to the name only constructor
        setDept(department);
    }
 
 
    public ContractEmployee(String first, String last, double pay, double hours)
    {
        this(first, last);
        setPayRate(pay);
        setHours(hours);
    }
 
    
    public void setHours(double hours)
    {
        String errMsg = "\nValue must be greater than 0.\n";
        
        try
        {
            this.hours = hours;
            throw new InvalidValueException(errMsg, this.hours);
        }
     
        catch(InvalidValueException e)
        {
        }
    }
     
    public double getHours()
    {
        return hours;
    }
     
    public double getPayRate()
    {
        return super.getPayRate() * hours;
    }
     
    public String getPayInfo()
    {
        return "Printing info for Mr/Mrs/Miss " + getFullName() + " Their identification number is: " + getEmployeeId() + " They work in department: " + getDept() + " They earned $" + getPayRate() + " this week. And are a contract employee.";
    }
    
    @Override
     public String toString()
     {
         return "Printing info for Mr/Mrs/Miss " + getFullName() + " Their identification number is: " + getEmployeeId() + " They work in department: " + getDept() + " They earned $" + getPayRate() + " this week. And are a contract employee.";
     }
}
