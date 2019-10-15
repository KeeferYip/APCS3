
public class printstuff {

	public static void main(String[] args) {
		pikachuPrint();
		drawBox();
		System.out.println();
		drawBox();
		System.out.println();
		drawBox();
	}
	public static void pikachuPrint() {
		System.out.println("Hello");
		System.out.println("Pikachu goes here");
		
	}
	public static void plusMinusPlus () {
		System.out.println("+----------+");
	}
	public static void twoVerticalLines() { 
		System.out.println("|          |");
	}
	public static void drawBox() { 
		plusMinusPlus (); 
		twoVerticalLines();
		twoVerticalLines();
		twoVerticalLines();
		twoVerticalLines();
		plusMinusPlus ();
		
	}
}
