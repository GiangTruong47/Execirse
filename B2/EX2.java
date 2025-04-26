package B2;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (bottom-left or top-left)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    printRectangle(3,6);
                    break;
                case 2:
                    System.out.println("a.Bottom-left triangle");
                    printBottomLeftTriangle(5);
                    System.out.println("b. Top-left triangle");
                    printTopLeftTriangle(5);
                    break;
                case 3:
                    printIsoscelesTriangle(5);
                    break;
                case 4:
                    System.out.println(("Exiting..."));
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }

    public static void printRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printBottomLeftTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1;j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printTopLeftTriangle(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1;j <= i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printIsoscelesTriangle(int height) {
        for (int i = 1; i < height; i++){
            for (int j = i; j < height; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
