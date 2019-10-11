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
		public static double min(int a, int b) {
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
		public static int factorial(int num) { 
			int answer = num;
			for ( int i = num - 1; i > 0; i--) {
				answer = answer * i;
			}
			 return answer;
		}
		//determines if a number is a prime number or not 
		public static boolean isPrime(int num) {
			boolean answer = true;
			for (int i=2; i< num; i++) {
			boolean result = isDivisibleBy(num,i);
			if (result==true) {
			answer = false;
			
			}
		}	
			return answer;
}
		//returns the greatest common factor between two numbers
		public static int gcf(int x,int y) {
			int larger = (int) max(x,y);
			int factor = 1;
			for(int i = 2; i < larger;i++) {
				if (x % 1 == 0 && y % i ==0) {
					factor =i;
				}
			}
			return factor;
		}
		//returns the square root of a number after using guesses
		public static double sqrt(double x) {
			double guess = 0.01;
			while (guess + .00005 < (0.5 * (x/guess + guess))) { 
				guess += .0000005;
			}
			return round2(guess);
		}
		//calls to a quadratic formula of 3 numbers, will return "no real roots" if imaginary number
		public static String quadForm(int a, int b, int c) {
			if(discriminant ( a , b, c) < 0) {
				System.out.println("no real roots");
			}
			double root1 = (-b + (sqrt(discriminant(a, b, c)))) / (2 * a);
			double root2 = (-b - (sqrt(discriminant(a, b, c)))) / (2 * a);
				if (root1 == root2) {
					return "The repeated root is" + round2(root1);
				}else {
					double rootmin = min((int)root1, (int)root2);
					double rootmax = max(root1, root2);
					return "The roots are " + round2(rootmin) + "and" + round2(rootmax);
				}
		}
		
	}

			



		




	




