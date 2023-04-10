import java.util.*;

public class Trial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        System.out.println("Enter the divisor :");
        int m=sc.nextInt();
        int quotient;
        if(n!=0 && m!=0){
            quotient=n/m;
            System.out.println(quotient);
        
        }
        

    }
}
