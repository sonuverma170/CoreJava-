package Number_pattern;

public class Pattern_13 {
    public static void main(String[] args) {
        int i, j, w = 6;
        for (i = w; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
