package Star_Pattern;

public class Downward_Trangle {
    public static void main(String[] args) {
        int n = 7;

        for (int i = n - 1; i >= 0; i--) {

            for (int j = 0; j <= i; j++) {

                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
