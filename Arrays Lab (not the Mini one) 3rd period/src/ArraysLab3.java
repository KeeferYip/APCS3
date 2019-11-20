//Keefer Yip APCS 3rd
//followed instructions posted on canvas to create 6 methods

import java.util.*;

public class ArraysLab3 {

	public static void main(String[] args) {
	
// main follows directions from step 6
// "6) Write a method main that will....."
	int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
	int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
	//Form sumArr by calling the sum method with a1 and a2 as inputs
	int[] sumArr = sum(a1, a2);
	//Declare int appendNum and set it to 200.
	int appendNum = 200;
	//Form appendArr by calling the append method with a1 and appendNum as inputs
	int[] appendArr = append(a1, appendNum);
	//Declare int removeIdx and set it to 5.
	int removeIdx = 5;
	//Form removeArr by calling remove with a2 and removeIdx
	int[] removeArr = remove(a2, removeIdx);
	//Form sumOfEvens by calling sumEven with appendArr as the input
	int[] sumOfEvens = sumEven(appendArr);
	//Call rotateRight with a1 as the input
				rotateRight(a1);
				System.out.println(Arrays.toString(sumArr));
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
	}
//1)Write a method sum that accepts two arrays of integers arr1 and arr2
//and returns an array of integers, in which every element is the sum
//of the elements at that index for the arrays arr1 and arr2. You can assume arrays arr1 and arr2
//have at least one element each and are the same length.


			public static int[] sum(int[] arr1, int[] arr2) {
				for(int i = 0; i < arr1.length; i++) {
					arr1[i] = arr1[i] + arr2[i];
				}
			return arr1;
			}
//2) Write a method append that accepts an array of integers arr of length n 
//and an integer num, and returns an array of integers of length n+1 that consists of the elements		
//of arr with num appended to the end.  You can assume array arr has at least one element.
			public static int[] append(int[] arr1, int num) {
				int[] output = new int[arr1.length + 1];
				for(int i = 0; i < output.length - 1; i++) {
					output[i] = arr1[i];
				}
				output[arr1.length] = num;
				return output;
			}
//3) Write a method remove that accepts an array of integers arr and an integer idx and returns an array of integers 
//consisting of all of the elements of arr except for the element at index idx 		
//(thus, the returned array has a length of arr.length – 1).  You can assume arr has at least two elements.
			public static int[] remove(int[] arr1, int index) {
				int[] output = new int[arr1.length - 1];
				for(int i = 0; i < output.length - 1; i++) {
					if(i == index) {
						i++;
					}
					output[i] = arr1[i];
				}
				return output;
			}
//4) Write a method sumEven that accepts an array of integers arr and returns an integer containing the sum 
//of the elements at the even indices of arr.  (That means elements at indices 0,2,4,6,8.)  
//You can assume arr has at least one element.
			public static int[] sumEven(int[] arr1) {
				int[] output = new int[arr1.length / 2 + 1];
				for(int i = 0; i <= output.length + 1; i++){
					if(i % 2 == 0 || i == 0){
						output[i / 2] = arr1[i];
					}
				}
				return output;
			}
//Write a method rotateRight that accepts an array of integers arr and does not return a value.  
//The rotateRight method moves each element of arr one index to the right 
//(element 0 goes to element 1, element 1 goes to element 2, …, element n-1 goes to element 0).  
//You can assume arr has at least one element.			
			public static void rotateRight(int[] arr1) {
		         int last = arr1[arr1.length - 1];
		         for (int i = arr1.length - 1; i > 0; i--)
		             arr1[i] = arr1[i-1];
		         arr1[0] = last;
			}
		
	}
	
// ;)
