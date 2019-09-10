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
	//call to discriminant, provides the coefficients of a quadratic equation, returns the discriminant
	public static double discriminant(double a, double b, double c) {
		
		return (b*b) - (4 * a * c);
	}
	//call to improper frac, converts mixed number to improper fraction
	public static String toImproperFrac(int a, int num, int denom) {   //denom is denominator , a is whole number, num is numerator
	
		return (a * denom) + num + "/" + denom;
	}
	//call to mixed number, converting improper fraction to mixed number
	public static String toMixedNum(int num, int denom ) { //num is numerator, dum is denominator 
		
		return  (num / denom) + "_" + (num % denom) + "/" + denom;
	}
	//call to foil, converts a binomial multiplication of the (ax+b)(cx+d) into a quadratic equation in the form of ax^2+bx+c
	public static String foil(int a, int b, int c, int d, String var) {
		
		return a * c + var + "^2"+ " + " + (a * d + b * c) + var + " + " + b * d;
	}
	// PART 2
	//determines whether or not one integer is evenly divisible by another (will state true/false)
	public static boolean isDivisibleBy(int a, int b) {
		int remainder = a % b;
		if (remainder != 0) {
			return false;
		}else {
			return true;
		}
	}
	//returns the absolute value of the number passed 
	public static double absValue(double a) {
		if (a < 0) {
			return -a;
		}else{
			return a;
		}	
	}
	//returns the larger of the values passed 
	public static double max(double a, double b) {
		if (a < b) {
			return b;
		}else {
			return a;
		}
	}
	//overloads max, accepts three doubles 
		public static double max(double a, double b, double c) {
			if (a > b && a > c){
				return a;
			}else if (b > a && b > c){
				return b;
			}else {
				return c;
			}
			
		}
		// returns the smaller of the two values
		public static double min(double a, double b) {
			if (a < b) {
				return a;
		}else {
				return b;
		}
	}
		//rounds a double to 2 decimal places, returns it
		public static double round2(double num) {
			num = num * 100;
			num = num + .5;
			num = (int) num;
			num = (double) num / 100;
			return num;
			
		}
		// PART 3
		//raises the number to a positive integer power 
		public static double exponent(double base, int power) {
			int i = 1;
			double answer = base;
			while (i != power) {
				answer *= base;
				i++;
			}
			return answer; 
		
		}
		//returns factorial of a number
		public static int factorial(int a) {
			
		}
}
			



		




	




