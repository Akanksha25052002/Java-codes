import java.util.*;

public class LargestPower {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        System.out.println("Enter the prime :");
        int p=sc.nextInt();
        int sum;
        sum=0;
        while(n>0){
            n=n/p;
            sum+=n;
        }
        System.out.println(sum);
    }
}
