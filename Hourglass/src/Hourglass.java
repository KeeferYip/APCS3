//Keefer Yip October 8 2019 APCS 3rd
//Hourglass uses for loops to print an easily modifiable hourglass figure
public class Hourglass {
	int size = 10;
	public static void main(String[] args) {
		System.out.print("|");
		for(int i = 0; i < 10; i++) {
			System.out.print("\"");
		}
			System.out.println("|");
		for (int row = 1 ; row <= 4; row++) {
			for (int space = 1; space <= row; space++) {
				System.out.print(" ");
			}
			System.out.print("\\");
			for (int colon = 1; colon <= -2 * row + 10; colon++) {
				System.out.print(":");
			}
			System.out.println("/");
			
				
			}
		}
	}

