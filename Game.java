/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package henry_ed2go_exercises;
import Util.KeyboardReader;
import java.util.*;

/**
 *
 * @author Alex Henry
 */



public class Game 
{
    private Random r = new Random();
    private int range;
    private int answer;
    
    public Game(char level)
    {
        switch(level)
        {
            default:
                System.out.println("Invalid input. Defaulting to begginer difficulty.");
            case 'B':
            case 'b':
                range = 10;
                break;
                
            case'I':
            case'i':
                range = 100;
                break;
                
            case'A':
            case'a':
                range = 1000;
                break;
        }
        
        answer = r.nextInt(range) + 1;
        System.out.println(answer);
       
            
    }
    
    public Game()
    {
        this('i');
    }
    
    public void play()
    {
        String[] correct = new String[] {"Correct!", "Righto!", "Good Guess!"};
        String[] tooLow = new String[] {"Too Low!", "The number is higher!", "Try higher number!"};
        String[] tooHigh = new String[] {"Too High!", "The number is lower", "Try lower number"};
        
        int guess = 0;
        char playing;
        int randNum;
        
        
        
        do
        {
            while (guess != answer)
            {
        
                guess = KeyboardReader.getPromptedInt("Please enter your guess between 1 and " + range + ": ");
   
                if(guess < answer)
                {
                    randNum = r.nextInt(tooLow.length);
                    
                    System.out.println(tooLow[randNum]);
                }
                else if(guess > answer)
                {
                    randNum = r.nextInt(tooHigh.length);
                    
                    System.out.println(tooHigh[randNum]);
                }
                else
                { 
                    randNum = r.nextInt(correct.length);
                    
                    System.out.println(correct[randNum]);
                }
            }
     
            playing = KeyboardReader.getPromptedChar("Would you like to play again? Enter Y for yes and N for no.");
            
            if(playing == 'Y')
            {
                guess = 0;
            
                answer = r.nextInt(range) + 1;
                System.out.println(answer);
            }
        }
        while((playing == 'Y') && (playing != 'N'));
    }
    
    public static void main(String args[])
    {
        char diff = KeyboardReader.getPromptedChar("Please enter difficulty choice: B for beginner, I for intermediate, A for advanced. ");
        
        Game fun = new Game(diff);  
        fun.play();
    }
}
