import java.util.*;

public class Prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        boolean b[]=new boolean[n];
        for( i=2;i*i<n;i++){
            if(b[i]==true){
            for( j=i+i;j<n;j=j+i){
                b[j]=false;
                System.out.println(j);
            }
        }
        
    }
    
}
}
