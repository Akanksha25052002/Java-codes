import java.util.*;

public class Hello {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int i;
        int sum;
        sum=0;
        while(n>0){
            for(i=1;i<=n;i++){
              sum+=i; 
               
                
            }
            System.out.println("The series is : "+sum);
        }
    
    }
}
