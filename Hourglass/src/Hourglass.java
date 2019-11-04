//Keefer Yip October 8 2019 APCS 3rd
//Hourglass uses for loops to print an easily modifiable hourglass figure
import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        // Create new Scanner Object and print welcome message
        Scanner scanner = new Scanner(System.in);
   
        System.out.println("Enter the width of the hourglass ");
        int width = scanner.nextInt();
        if (width > 300) {
            scanner.nextLine();
            String sure = scanner.nextLine();
            if (sure.equals("yes!")) {
                // Build and print the hour glass with the given width
                buildHGlass(width);
            }
        } else {
            buildHGlass(width);
        }
        scanner.close();
    }

    public static void buildHGlass(int width) {
        buildTop(width);
        repeatThis(width - 1, " ");
        System.out.println("|   |"); 
        buildBottom(width);
    }

    public static void buildTop(int width){
        System.out.print("\n\n| ");
        repeatThis(width, "\" ");
        System.out.println("|");

        for (int row = 1; row <= (width - 2) / 2; row++) {
            repeatThis(row, "  ");
            System.out.print("\\ ");
            repeatThis(-2*row+width, ": ");
            System.out.println("/");
        }
    }

    public static void buildBottom(int width) {
        for (int row = (width - 2) / 2; row >= 1; row--) {
            repeatThis(row, "  ");
            System.out.print("/ ");
            repeatThis(-2*row+width, ": ");
            System.out.println("\\ ");
        }

        System.out.print("| ");
        repeatThis(width, "\" ");
        System.out.println("|");
    }

    public static void repeatThis(int times, String character) {
        for (int i = 0; i < times; i++)
            System.out.print(character);
    			}
		}




