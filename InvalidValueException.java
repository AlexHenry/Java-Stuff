/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author Alex Henry
 */
public class InvalidValueException extends Exception
{
    public InvalidValueException(String msg, int num)
    {
        if(num < 0)
        {
            System.out.println(msg);
        }
    }
    
    public InvalidValueException(String msg, double num)
    {
        if(num < 0)
        {
            System.out.println(msg);
        }
    }
}
