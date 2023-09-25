package Number_pattern;

public class Pattern_14 {

    public static void main(String[] args) {
        int s = 6, i, j;
        for (i = s; i >= 1; i--) {
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
