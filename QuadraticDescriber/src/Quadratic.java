
public class Quadratic {
	   public Quadratic() {
	    }

	    public static void quadraticDescriber(double a, double b, double c) {
	        System.out.println("\nDescription of the graph of: \ny = " + a + " x^2 + " + b + " x + " + c + "\n");
	        if (a < 0.0D) {
	            System.out.println("Opens: Down");
	        } else {
	            System.out.println("Opens: Up");
	        }

	        double aos = -b / (2.0D * a) + 0.0D;
	        System.out.println("Axis of Symmetry: " + round2(aos));
	        double aosY = aos * aos * a + b * aos + c;
	        System.out.println("Vertex: (" + round2(aos) + ", " + round2(aosY) + ")");
	        String roots = quadForm(a, b, c);
	        if (roots.equals("no real roots")) {
	            System.out.println("x-intercept(s): None");
	        } else {
	            System.out.println("x-intercept(s): " + roots);
	        }

	        System.out.println("y-intercept: " + c);
	    }

	    public static double discriminant(double a, double b, double c) {
	        double discr = square(b) - 4.0D * a * c;
	        return discr;
	    }

	    public static double square(double num) {
	        double ans = num * num;
	        return ans;
	    }

	    public static String quadForm(double a, double b, double c) {
	        double dis = discriminant(a, b, c);
	        double root1;
	        String root;
	        if (dis > 0.0D) {
	            root1 = (-b + sqrt(dis)) / (2.0D * a);
	            double root2 = (-b - sqrt(dis)) / (2.0D * a);
	            root = round2(root1) + " and " + round2(root2);
	        } else if (dis == 0.0D) {
	            root1 = (-b - sqrt(dis)) / (2.0D * a);
	            root = String.valueOf(round2(root1));
	        } else {
	            root = "no real roots";
	        }

	        return root;
	    }

	    public static double sqrt(double input) {
	        double a = 1.0D;
	        if (input < 0.0D) {
	            throw new IllegalArgumentException("Negative value: " + input);
	        } else {
	            int x;
	            for(x = 1; (double)(x * x) < input; ++x) {
	                a = (double)x;
	            }

	            for(x = 1; x < 10; ++x) {
	                a = 0.5D * (input / a + a);
	            }

	            double sq = round2(a);
	            return sq;
	        }
	    }

	    public static double round2(double x) {
	        int hun = (int)(100.0D * x);
	        int hun2 = hun * 10;
	        int thou = (int)(1000.0D * x);
	        if (thou >= hun2 + 5) {
	            ++hun;
	        }

	        double dec = (double)hun / 100.0D;
	        return dec;
	    }
	}


