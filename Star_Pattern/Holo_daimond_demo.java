package Star_Pattern;

import java.util.Scanner;

/**
 * Holo_daimond_demo
 */
public class Holo_daimond_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        System.out.println("Enter the number of rows you want to print: ");
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = n; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (k = 1; k < 2 * (i - 1); k++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println("");
            } else {
                System.out.println("*");
            }
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = n; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (k = 1; k < 2 * (i - 1); k++) {
                System.out.print(" ");
            }
            if (i == 1)
                System.out.println("");
            else
                System.out.println("*");
        }
    }

}