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
public abstract class Person 
{
    
 /**
  * the first name and last name of the employee
  */
 private String firstName, lastName;
 
 public Person()
 {
     
 }
 
 public Person(String firstName, String lastName)
 {
     this.firstName = firstName;
     this.lastName = lastName;
 }
 
 /**
  * Allows for setting of the first and last name of the employee
  * @param firstName The employee's first name, it is expected to be a string value.
  * @param lastName The employee's last name, it is expected to be a string value.
  */
 
 public void setName(String firstName, String lastName)
 {
     this.firstName = firstName;//the "this" key word allows for the "firstName" Global variable to have the same name as the "firstName" local variable used by setName
     this.lastName = lastName;
 }
 
 public String getfirstName()
 {
     return firstName;
 }
 
 public String getLastName()
 {
     return lastName;
 }
 /**
  * Allows for access to the firstName and lastName variables.
  * @return The value of firstName and lastName with a space in between
  */
 
 public String getFullName()
 {
     return firstName+" "+lastName;
 }
}
