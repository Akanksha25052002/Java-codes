import java.util.*;

public class PrimePairs {
    public static void main(String a[]){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int x=sc.nextInt();
boolean prime(int n){
for(int i=n;n<=m;i++){
    if(prime[i] && prime[i+x]){
        System.out.println(i+" "+i+x);
        count++;
    }
    
}

    }
    
}
