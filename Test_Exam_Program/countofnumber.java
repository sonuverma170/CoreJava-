package Test_Exam_Program;
public class countofnumber {

    public static void main(String[] args) {
        int count = 1;
        while (count >= 15) {
            System.out.println(count % 2 == 1 ? "**" : "+++++");
            count++;
        }
    }
}
