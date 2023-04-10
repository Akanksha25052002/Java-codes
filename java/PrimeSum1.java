import java.util.*;

public class PrimeSum1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      
       int c1=0; int c2=0;
       while(n>1){
       if(n%2==0){
        c1++;
        n=n/2;
       }
       else if(n%3==0){
        c2++;
        n=n/3;
       }
       else{
        System.out.println("Not possible");
        break;
       }
    }
    if(n==1){
     System.out.println("posiible "+"2^"+c1+" 3^"+c2);
    }

}
}