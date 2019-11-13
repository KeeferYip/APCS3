//Keefer Yip October 8 2019 APCS 3rd
//Hourglass uses for loops to print an easily modifiable hourglass figure
import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        // Create new Scanner Object and print welcome message
        Scanner scanner = new Scanner(System.in);
   
        System.out.println("Enter the size of the hourglass ");
        int size = scanner.nextInt();
        if (size > 300) {
            scanner.nextLine();
            String sure = scanner.nextLine();
            if (sure.equals("yes!")) {
             
                produceHourGlass(size);
            }
        } else {
            produceHourGlass(size);
        }
        scanner.close();
    }

    public static void produceHourGlass(int size) {
    	top(size);
        loopRepeated(size - 1, " ");
        System.out.println("|   |"); 
        bottom(size);
    }

    public static void top(int size){
        System.out.print("\n\n| ");
        loopRepeated(size, "\" ");
        System.out.println("|");

        for (int row = 1; row <= (size - 2) / 2; row++) {
            loopRepeated(row, "  ");
            System.out.print("\\ ");
            loopRepeated(-2*row+size, ": ");
            System.out.println("/");
        }
    }

    public static void bottom(int size) {
        for (int row = (size - 2) / 2; row >= 1; row--) {
            loopRepeated(row, "  ");
            System.out.print("/ ");
            loopRepeated(-2*row+size, ": ");
            System.out.println("\\ ");
        }

        System.out.print("| ");
        loopRepeated(size, "\" ");
        System.out.println("|");
    }

    public static void loopRepeated(int times, String character) {
        for (int i = 0; i < times; i++)
            System.out.print(character);
    			}
		}




