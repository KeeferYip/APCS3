
	import java.util.Scanner;
	public class QuadraticClient {
	    public QuadraticClient() {
	    }

	    public static void main(String[] args) {
	        Scanner console = new Scanner(System.in);
	        boolean keepGoing = true;
	        System.out.println("Welcome to the Quadratic Describer");
	        System.out.println("Provide values for coefficients a, b, and c\n");

	        while(keepGoing) {
	            String input;
	            try {
	                System.out.print("a: ");
	                input = console.nextLine();
	                double a = Double.parseDouble(input);
	                System.out.print("b: ");
	                input = console.nextLine();
	                double b = Double.parseDouble(input);
	                System.out.print("c: ");
	                input = console.nextLine();
	                double c = Double.parseDouble(input);
	                Quadratic.quadraticDescriber(a, b, c);
	                System.out.println("\nDo you want to keep going? (Type \"quit\" to end)");
	                input = console.nextLine();
	                if (input.charAt(0) == 'q' || input.charAt(0) == 'Q') {
	                    keepGoing = false;
	                }

	                System.out.println();
	            } catch (Exception var10) {
	                System.out.println("Error:  " + var10.getMessage() + ". Do you want to keep going?  (Type \"quit\" to end)");
	                input = console.nextLine();
	                if (input.charAt(0) == 'q' || input.charAt(0) == 'Q') {
	                    keepGoing = false;
	                }

	                System.out.println();
	            }
	        }

	        console.close();
	    }
	}


