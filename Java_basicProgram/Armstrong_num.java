package Java_basicProgram;
import java.util.Scanner;
public class Armstrong_num {
   
    
    static boolean Armstrong(int n)
    {
        int temp,digits=0,last=0,sum=0;
         temp=n;
         while(temp>0)
         {
            temp=temp/10;
            digits++;

         }
         temp=n;
         while(temp>0)
         {
            last=temp%10;
            sum+=(Math.pow(last,digits));
            temp=temp/10;
         }
         if(n==sum)
         return true;
         else return false;
        
    }
    public static void main(String[] args) {
        int num;
        Scanner s =new Scanner(System.in);
        num =s.nextInt();
        System.out.println("Enter the number");
        System.out.println("Armstrong Num Up to"+num+"are");
        for(int i=0;i<=num;i++)
        if(Armstrong(i))
        System.out.println(i+",");
    }
}
