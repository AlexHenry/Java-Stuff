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
public class HelloArgs
{
    public static void main(String[] args)
    {   
        args = new String[]{"Java", "HelloArgs", "From", "Me"};
        
        for(int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }
    }
}
