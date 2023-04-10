import java.util.*;

public class Toggle {
    public static void main(String[]args){
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        boolean b[]=new boolean[n+1];
        for(int i=1;i<=n;i++){
            b[i]=true;
        }
        for(int i=2;i<=n;i=i+2){
            b[i]=false;
        }
        for(int i=3;i<=n;i++){
            for(int j=i;j<=n;j=j+i){
                b[j]=b[j]?false:true;
            }
        }
        for(int i=1;i<=n;i++){

            if(b[i]){

                count++;
            }
            System.out.println(count);

        }
    }
}
