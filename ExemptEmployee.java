/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author Alex Henry
 */
public class ExemptEmployee extends Employee implements finance.Payable
{
    public ExemptEmployee()
    {
        
    }
    
    public ExemptEmployee(String first, String last, int department, double pay)
    {
        super(first, last, department);//reference to the department only constructor of the base class aka "Employee"
        setPayRate(pay);
    }
    
    public ExemptEmployee(String first, String last)
    {
        super(first, last);//reference to base class "Employee" which provides access to it's base class "Person"
    }
    
    public ExemptEmployee(String first, String last, int department)
    {
        this(first, last);//reference to the name only constructor
        setDept(department);
    }
 
 
    public ExemptEmployee(String first, String last, double pay)
    {
        this(first, last);
        setPayRate(pay);
    }
 
     public String getPayInfo()
    {
        return "Printing info for Mr/Mrs/Miss " + getFullName() + " Their identification number is: " + getEmployeeId() + " They work in department: " + getDept() + " They earn a salary of $" + getPayRate() + " per month. And are an exempt employee.";
    }
     
     @Override
     public String toString()
     {
         return "Printing info for Mr/Mrs/Miss " + getFullName() + " Their identification number is: " + getEmployeeId() + " They work in department: " + getDept() + " They earn a salary of $" + getPayRate() + " per month. And are an exempt employee.";
     }
}