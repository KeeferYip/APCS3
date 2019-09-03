/* Keefer Yip
 * August 29, 2019 
 * Library of math functions
*/ 
public class Calculate {
	// call to square, returns the square of the value passed
	public static int square(int number) {   
		int answer;
		answer = number*number;
		return answer;
	}
	// call to cube, returns the square of the value passed
	public static int cube(int number) { 
		int answer;
		answer=number*number*number;
		return answer;
	}
	//call to average, returns the average of values passed (double)
	public static double average(double number) {
		double answer;
		answer=number+number %2;
		return answer;
	}
}


