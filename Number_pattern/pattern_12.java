package Number_pattern;

public class pattern_12 {
    public static void main(String[] args) {
        int r = 9;
        for (int i = 1; i <= r; i++) {
            for (int j = r; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
