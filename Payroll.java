/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package henry_ed2go_exercises;
import java.util.*;
import employees.*;
import Util.KeyboardReader;
import finance.*;

/**
 *
 * @author Alex Henry
 */
public class Payroll 
{
    
    public static void main(String args[])
    {
        String firstN = "";
        String lastN = "";
        int deprtNum = 0;
        double pay = 10;
        double hour = 0;
        String query = "";
        int index;
        char empType = 'E'; 
        
        
        Employee.setNextId(22);//sets the value of "nextId" to 22
        
        List<Employee> emp = new ArrayList<Employee>();
        ExemptEmployee eEmp = new ExemptEmployee();
        NonexemptEmployee nEmp = new NonexemptEmployee();
        ContractEmployee cEmp = new ContractEmployee();
        
        List<Invoice> inv = new Vector<Invoice>();
        
        List<Payable> payables = new ArrayList<Payable>();
        List<Payable> payments = new ArrayList<Payable>();
        
        inv.add(new Invoice("Etta", 5.25));
        inv.add(new Invoice("Jane", 30.45));
        
        
        for(int i = 0; i < 1; i++)
        {
            empType = KeyboardReader.getPromptedChar("\nWhich type of employee are you entering? Type E for Exempt, N for Nonexempt, and C for Contract: ");
            
            firstN = KeyboardReader.getPromptedString("Please enter first name: ");
            lastN = KeyboardReader.getPromptedString("Please enter last name: ");
        
            do
            {
                deprtNum = KeyboardReader.getPromptedInt("Please enter department number: ", "Please enter a valid numeric value.");
            
                if(deprtNum < 0)
                {
                    System.out.println("\nFor department please enter a value greater than or equal to 0.\n");
                }
            }
            while (deprtNum < 0);
        
            
            switch(empType)
            {
                case 'E':
                case 'e':
                    
                    do
                    {
                        pay = KeyboardReader.getPromptedDouble("Please enter Pay rate: ", "Please enter a valid numeric value.");
                        eEmp = new ExemptEmployee(firstN, lastN, deprtNum, pay);
                        emp.add(eEmp);
                    }
                    while(pay < 0);
                    
                    break;
                    
                case 'N':
                case 'n':
                    
                    do
                    {
                        pay = KeyboardReader.getPromptedDouble("Please enter Pay rate: ", "Please enter a valid numeric value.");
                    }
                    while(pay < 0);
                    
                    do
                    {
                        hour = KeyboardReader.getPromptedDouble("Please enter number of hours nonexempt employee has worked: ", "Please enter a valid numeric value.");
                        nEmp = new NonexemptEmployee(firstN, lastN, deprtNum, pay, hour);
                        emp.add(nEmp);
                    }
                    while(hour < 0);
                    
                    break;
                    
                case 'C':
                case 'c':
                    
                    do
                    {
                        pay = KeyboardReader.getPromptedDouble("Please enter Pay rate: ", "Please enter a valid numeric value.");
                    }
                    while(pay < 0);
                    
                    do
                    {
                        hour = KeyboardReader.getPromptedDouble("Please enter number of hours contract employee has worked: ", "Please enter a valid numeric value.");
                        cEmp = new ContractEmployee(firstN, lastN, deprtNum, pay, hour);
                        emp.add(cEmp);
                    }
                    while(hour < 0);
                    
                    break;
                    
                default:
                    System.out.println("Invalid choice, please try again.");
                    i--;
                    break;
            }
        }
        
        /*Iterator em = emp.iterator();
        while(em.hasNext())
        {
            System.out.println(em.next());
        }*/
        
        payments.addAll(emp);
        payments.addAll(inv);
        
        CheckPrinter.printChecks(payments.toArray(new Payable[]{}));
        
        
        /*while(emp.size() > 0)
        {
            while(emp.contains(eEmp))
            {
                System.out.println("\nExempt Employee: ");
                index = emp.indexOf(eEmp);
                System.out.println(emp.get(index));
                emp.remove(index);
            }         
        
            while(emp.contains(nEmp))
            {
                System.out.println("\nNonexempt Employee: ");
                index = emp.indexOf(nEmp);
                System.out.println(emp.get(index));
                emp.remove(index);
            }
        
            while(emp.contains(cEmp))
            {
                System.out.println("\nContract Employee");
                index = emp.indexOf(cEmp);
                System.out.println(emp.get(index));
                emp.remove(index);
            }  
        }/*
        
        /*System.out.println("\ninvoices");
        CheckPrinter.printChecks(inv);
        System.out.println("\nemployees");
        CheckPrinter.printChecks(emp);*/
        
        /*query = KeyboardReader.getPromptedString("Please enter a last name to search for: ");
        for(int i = 0; i < emp.length; i++)
        {
            
            if(query.equals(emp[i].getLastName()))
            {
                emp[i].getPayInfo();
            }
        }*/
            
    }
}
