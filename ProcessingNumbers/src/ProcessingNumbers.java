	import java.util.*;
	//Keefer Yip October 1 2019 ProcessingNumbers
	//Pair programming assignment; code accepts a string of numbers from user
	//then it prints the smallest and largest number
	//it also prints the sum of all the even numbers; largest even number entered from user
	public class ProcessingNumbers {
	
		public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many numbers do you wish to enter?");
		int numVal = userInput.nextInt();
		System.out.println("Enter your first integer");
		int number = userInput.nextInt();
		int max = number;
		int min = number;
		int evenSum = 0;
		int maxEven = Integer.MIN_VALUE;
		boolean foundEven = false;
		if (number % 2 == 0) {
			foundEven = true;
			maxEven = number;
		
			
		}
		for (int i = 1; i < numVal; i++) {
			System.out.println("Enter your next integer");
			number = userInput.nextInt();
			if (number % 2 == 0) {
				if (!foundEven) {
				foundEven = true;
				maxEven = number;
		}else {
				if (number > maxEven) {
					maxEven = number;
					}
				
				}
				if (number % 2 == 0) {
				evenSum += number;
			}
			}
			if (number < min) {
				min = number;
			}else if (number > max) {
				max = number; 
				
				}
			
		}
			System.out.println("MIN:" + min);
			System.out.println("MAX:" + max);
			if (foundEven) {
				System.out.println("LARGEST MAX(EVEN):" + maxEven);
				System.out.println("SUM (EVEN):" + evenSum);
			}else{
				System.out.println("-1");
			}
			
		userInput.close();
			}
	
		}
	