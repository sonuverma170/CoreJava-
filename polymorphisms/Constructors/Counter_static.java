package polymorphisms.Constructors;

public class Counter_static {
    int count = 0;

    Counter_static() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {

        Counter_static s1 = new Counter_static();
        Counter_static s2 = new Counter_static();
        Counter_static s3 = new Counter_static();
    }

}
