//Keefer Yip
//October 21, 2019
//APCS 3rd
import java.util.*;
public class Split {

 public static void main(String[] args) {

// Your task Part 0

//String.split();

//It's a method that acts on a string, <StringName>.split(<sp>);

//Where sp is the string where the string splits

//And it returns an array

// Example: "I like apples!".split(" ");

// it will split at spaces and return an array of ["I","like","apples!"]
	  System.out.println("Example 1:");
	 String[] example1 = "I like apples!".split("");
     System.out.println(Arrays.toString(example1));
// Example 2: "I really like really red apples!".split("really")

// it will split at the word "really" and return an array of ["I "," like ","red apples!"]
     System.out.println("Example 2:");
     String[] example2 = "I really like really red apples!".split("really");
     System.out.println(Arrays.toString(example2));
//play around with String.split!

//What happens if you "I reallyreally likeapples".split("really") ?
   
//Your task Part 1:

/*Write a method that take in a string like

* "applespineapplesbreadlettucetomatobaconmayohambreadcheese"

* describing a sandwich.

* Use String.split to split up the sandwich by the word "bread" and return what's in the middle of

* the sandwich and ignores what's on the outside

* What if it's a fancy sandwich with multiple pieces of bread?
*/ 
     System.out.println("Example 3:");
     String[] sandwichTask = "I reallyreally likeapples".split("really");
     System.out.println(Arrays.toString(sandwichTask));


//Your task pt 2:

	 /*Write a method that take in a string like

	 * "apples pineapples bread lettuce tomato bacon mayo ham bread cheese"

	 * describing a sandwich

	 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of

	 * the sandwich and ignores what's on the outside.

	 *The output for the example above should be lettucetomatobaconmayoham

	 * You should call the method from part one in order to increase your reuse of code and reduce

	 *the complexity of part 2.

	 */
	 System.out.println(splitInput("applespineapplesbreadlettucetomatobaconmayohambreadcheese"));
	 System.out.println(splitSpace("apples pineapples bread lettuce tomato bacon mayo ham bread cheese"));
 }
 
 public static String splitInput(String input) {
	 if(input.indexOf("bread") != -1) {
		 int index = input.indexOf("bread");
		 String[] output = input.split("bread", index);
		 Arrays.toString(output);
		 return output[1];
	 }else {
		 return "This is not a sandwich :(";
	 }
 } 
 
 public static String splitSpace(String input) {
	 if(input.indexOf("bread") != -1) {
		 int index = input.indexOf("bread");
		 String[] output = input.split(" ");
		 Arrays.toString(output);
		 return output[index];
	 }else {
		 return "This is not a sandwich :(";
	 }
 }
}




