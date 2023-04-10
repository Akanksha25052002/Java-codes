import java.util.*;

public class CoPrime {
    public static void main(String args[]){
        System.out.println("Enter the value of b :");
        Scanner sc=new Scanner(System.in);

        int b=sc.nextInt();
        int count=0; 
        if(b>0){
            System.out.println("The numbers which are coprime with given no. are :");
            for(int a=1;a<b;a++){
                if(GCD(a,b)==1){
                    count++;
                    System.out.println(a);
                }
            }
            System.out.println("The total count of no. are :"+count);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
        static int GCD(int a , int b){
            if(a==0)
                return b;
            else
            return GCD(b%a, a);
        }
   }


