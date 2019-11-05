//Keefer Yip
//FracCalc Checkpoint 1 - November 2019

package fracCalc;

import java.util.*;

public class FracCalc {

    	 public static void main(String[] args) 
    	    {
    	        Scanner scanner = new Scanner(System.in);
    	        String quit = " ";        
    	        String equation = " ";
    	        System.out.println("Welcome to FracCalc");
    	        System.out.println("~ Checkpoint 1 ~");
    	        while(!quit.equalsIgnoreCase("quit")){
    	            System.out.println("What is your equation?");
    	            equation = scanner.nextLine();
    	            System.out.println(produceAnswer(equation));       
    	            System.out.println("Do you wish to continue? ( Enter \"quit\" to stop)");
    	            quit = scanner.nextLine();     }
    	    scanner.close();
 // TODO: Read the input from the user and call produceAnswer with an equation

    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
    	String[] frac = input.split(" ");
        return frac[2];

    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
