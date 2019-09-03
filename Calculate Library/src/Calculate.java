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
	public static double average(double number1, double number2) {
		double answer;
		answer=(number1+number2)/2;
		return answer;
	}
	//call to average, accepts 3 doubles 
	public static double average(double number1, double number2, double number3) {
		double answer;
		answer=(number1+number2+number3)/3;
		return answer;
	}
	//call to toDegrees, converts an angle measure in radians to degrees
	public static double toDegrees(double x) {

		return x * (180 / 3.14159);
	
	}
	//call to toRadians, converts degrees to radians 
	public static double toRadians(double x) {
		
		return x * (3.14159 / 180);
	
	}
	public static double discriminant(double a, double b, double c) {
		
		return (b*b) - (4 * a * c);
	}
}



