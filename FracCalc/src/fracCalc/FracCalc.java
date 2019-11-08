//Keefer Yip
//FracCalc Checkpoint 1 - November 2019

package fracCalc;

import java.util.*;

public class FracCalc {

    	 public static void main(String[] args) 
    	    {
    	        Scanner userInput = new Scanner(System.in);
    	        String quit = " ";        
    	        String equation = " ";
    	        System.out.println("Welcome to FracCalc!");
    	        System.out.println("~ Checkpoint 1 ~");
    	        while(!quit.equalsIgnoreCase("quit")){
    	            System.out.println("What is your equation?");
    	            equation = userInput.nextLine();
    	            System.out.println(produceAnswer(equation));       
    	            System.out.println("Do you wish to continue? ( Enter \"quit\" to stop )");
    	            quit = userInput.nextLine();     }
    	
    	        userInput.close();
        }
// TODO: Read the input from the user and call produceAnswer with an equation

    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    	 public static String produceAnswer(String input) { 
    	        // TODO: Implement this function to produce the solution to the input
    	    	String [] split = input.split(" ");
    	    	String firstNum = split[0];
    	    	String operator = split[1];
    	    	String secondNum = split[2];
    	    	
    	    	String [] splitNum = splitOperators(firstNum);
    	    	String [] splitNum2 = splitOperators(secondNum);
    	    	int [] frac1 = new int[splitNum.length];
    	   	    int [] frac2 = new int[splitNum.length];
    	   	   
    	   	    for(int i = 0; i<frac1.length; i++) {
    	   		   frac1[i]=Integer.parseInt(splitNum[i]);
    	   		   frac2[i]=Integer.parseInt(splitNum2[i]);
    	   	    }
    	   	    
    	   	    int[] improper = toImproperfrac(frac1[0],frac1[1],frac1[2]);
    		    int[] improper2 = toImproperfrac(frac2[0],frac2[1],frac2[2]);
    	   	    
    		    int [] answer = new int[2];
    	   	    String end = "";
    	    	if (operator.equals("+") || operator.equals("-")) {
    	    			answer = addition(improper, operator, improper2);
    	    			end = simplify(answer[0], answer[1]);	
    	    	}
    			return end;
    	    }
    	    // TODO: Fill in the space below with any helper methods that you think you will need
    	   public static String[] splitOperators(String operand) {
    		   String whole="0";
    		   String numerator="0";
    		   String denominator="0";
    		  
    		   if(!operand.contains("/")) {
    	    		whole= operand;
    	    		numerator = "0";
    	    		denominator = "1";
    	    	} else if(operand.contains("_")) {
    	    		String [] secondArray = operand.split("/");    	
    	    		String second = secondArray[0];
    	    		denominator = secondArray[1];
    	    		String [] thirdArray = second.split("_");
    	    		whole = thirdArray[0];
    	    		numerator=thirdArray[1];
    	    	} else {
    	    		whole = "0";
    	    		String [] fraction = operand.split("/");
    	    		numerator=fraction[0];
    	    		denominator=fraction[1];  		
    	    	}
    		   String[] answer = {whole, numerator, denominator};
    	       return answer;
    	    }
    	   public static int[] addition( int[] frac1, String operator, int[] frac2) {
    		   int bottom = frac1[1] * frac2[1];
    		   frac1[0] *= frac2[1];
    		   frac1[1] *= frac2[0];
    		   if(operator.equals("-")) {
    			   frac1[1] = -frac1[1];
    		   }
    		   int top  = frac1[0]+frac1[1]; 
    	       int[] result = {top,bottom};
    		   return result;
    		   
    	   }
    	   
    	   public static String simplify(int num, int den) {
    		   String answer = "";
    		   int gcf = gcf(num, den);
    		    num /= gcf;
    		    den /= gcf;
    		   if(num > 0 && den < 0) {
    			   num=-num;
    			   den=-den;
    		   }
    		   if(num > den || num < 0 && num < den) {
    			   answer = toMixedNum(num, den);
    			   if(answer.charAt(0)=='0') {
    				   answer = num + "/" + den;
    			   } 
    		   }   
    		   else {
    				   answer = num + "/" + den;
    			   }
    		   if(num == 0) {
    			   answer = "0";
    		   } 
    		   if(den == 1) {
    			   answer = num + "";
    		   } 
    		   return answer;
    	   }
    	   
    	   //Calculate methods
    	   public static boolean isDivisibleBy(int num, int den) {
    			return num % den ==0;
    		}
    	   public static int[] toImproperfrac (int whole, int num, int den) {
    		   int improper = (whole * den);
    			if(whole >= 0) {
    				improper += num;
    			} else {
    				improper -= num;
    			}
    			int[] arr = {improper,den};
    			return arr;
    		}
    	   public static String toMixedNum (int num, int den) {
    			int improper = num / den;
    			int remainder = num % den;
    			return improper + "_" + absValue(remainder) + "/" + absValue(den);		
    		
    		}
    	   public static int min (int operand1, int operand2){
    			if (operand1 < operand2) {
    				return operand1;
    			} else {
    				return operand2;
    				}
    		}
    	   public static int absValue (int operand){
    		   if (operand < 0) {
    				return -operand;
    			} else {
    				return operand;
    			}
    		}
    	   public static int gcf(int operand1, int operand2) {
    			int gcf = 1;
    			operand1 = absValue(operand1);
    			operand2 = absValue(operand2);
    			for (int i = 1; i <= min(operand1, operand2); i++) {
    				if (isDivisibleBy(operand1, i) && isDivisibleBy(operand2, i)) {	
    						gcf = i;
    				}
    			}
    			return gcf;
    		}
    	}