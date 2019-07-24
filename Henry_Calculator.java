/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package henry_ed2go_exercises;

/**
 *
 * @author Alex Henry
 */
class Henry_Calculator //class name
{
    public static double add(double num1,double num2)//Method for adding two numbers
    {
        double sum1 = num1 + num2;//takes 2 doubles and adds them to sum1 variable
        
        return sum1;//returns variable sum1
    }
    
    public static double subtract(double num1, double num2)//For subtracting two numbers
    {
        double sum2 = num1 - num2;//see above except subtraction
        
        return sum2;
    }
    
    public static double multiply(double num1, double num2)//For multiplying
    {
        double sum3 = num1 * num2;//see above
        
        return sum3;
    }
    
    public static double divide(double num1, double num2)//Division
    {
        double sum4 = num1/num2;//See above
        
        return sum4;
    }
    public static void main(String args[])//main method
    {
        double a = 4;
        double b = 2;
        double c;
        
       c = add(a, b);//calls the add method
        System.out.println("a + b = " + c);//prints the result of the add method to the screen
        
       c = subtract(a, b);
       System.out.println("a - b = " + c);
       
       c = multiply(a, b);
       System.out.println("a * b = " + c);
       
       c = divide(a, b);
       System.out.println("a/b = " + c);
       
       int x = 5;
       int y = 20;
       
       x -= x-(y+x);
       
       System.out.println(x);
    }
}