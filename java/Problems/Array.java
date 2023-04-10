// import java.util.*;

public class Array{
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int arr[] ={5, 2, 6, 4, 1} ;
        // System.out.println(arr);
        // for(int i=0;i<arr.length;i++){
        //     int n=sc.nextInt();
        //     arr[i]=n;
            // for(int i=0;i<arr.length;i++){
                //     int result=arr[i];
                //     System.out.println(result);
                // }
                int n=arr.length;

                int curr=arr[0];
                for(int i=1;i<arr.length;i++){
                    if(curr<arr[i]){
                        curr=arr[i];
                        System.out.println(curr);
                    }
                    
                }
                

            }


    }
