package Constructor;

class Counter {

    int count = 0;

    Counter() {
        count++;
        System.out.println(count);
    }

}

public class Counter_static {

    public static void main(String[] args) {

        Counter s1 = new Counter();
        Counter s2 = new Counter();
        Counter s3 = new Counter();
    }

}
