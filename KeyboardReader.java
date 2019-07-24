/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;
import java.io.*;
import Util.InvalidValueException;

/**
 *
 * @author Alex Henry
 */
public class KeyboardReader 
{
    private static boolean isValid = true;
    private static int i = 0;
    private static double d = 0.0;
    
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    public static String getPromptedString(String prompt)
    {
        String response = null;
        System.out.print(prompt);
        try
        {
            response = in.readLine();
        }
        catch(IOException e)
        {
            System.out.println("IOException occured");
        }
        return response;
    }
    
    public static char getPromptedChar(String prompt)
    {
        return getPromptedString(prompt).charAt(0);
    }
    
    public static int getPromptedInt(String prompt)
    {
        if(isValid == false)
        {
            isValid = true;
        }
        
        while(isValid == true)
        {
            try
            {
                i = Integer.parseInt(getPromptedString(prompt));
                isValid = false;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Please enter a valid numeric value.");
                isValid = true;
            }
        }
        
        return i;
    }
    
    public static int getPromptedInt(String prompt, String err)
    {
        if(isValid == false)
        {
            isValid = true;
        }
        
        while(isValid == true)
        {
            try
            {
                i = Integer.parseInt(getPromptedString(prompt));
                isValid = false;
            }
            catch(NumberFormatException e)
            {
                System.out.println(err);
                isValid = true;
            }
        }
        
        return i;
    }
    
    public static double getPromptedDouble(String prompt)
    {
        if(isValid == false)
        {
            isValid = true;
        }
        
        while(isValid == true)
        {
            try
            {
                d = Double.parseDouble(getPromptedString(prompt));
                isValid = false;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Please enter a valid numeric value.");
                isValid = true;
            }
        }
        
        return d;
    }
    
    public static double getPromptedDouble(String prompt, String err)
    {
        if(isValid == false)
        {
            isValid = true;
        }
        
        while(isValid == true)
        {
            try
            {
                d = Double.parseDouble(getPromptedString(prompt));
                isValid = false;
            }
            catch(NumberFormatException e)
            {
                System.out.println(err);
                isValid = true;
            }
        }
        
        return d;
    }
}
