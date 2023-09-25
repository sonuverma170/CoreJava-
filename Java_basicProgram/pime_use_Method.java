package Java_basicProgram;

public class pime_use_Method {
    static void prime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + "not prime");

        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + "not prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " prime");
            }
        }
    }

    public static void main(String[] args) {
        prime(7);
    }
}
