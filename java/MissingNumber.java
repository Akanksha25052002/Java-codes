import java.util.*;
import java.util.Arrays;

public class MissingNumber{
static int FirstMissingPositive(int arr[], int n){
    int ptr=0;
    for(int i=0;i<n;i++){
        if(arr[i]==1){
            ptr=1;
            break;
        }
    }
    if(ptr==0)
    return(1);

    for(int i=0;i<n;i++)
    if(arr[i]<=0 || arr[i]>n)
    arr[i]=i;

    for(int i=0;i<n;i++)
    arr[(arr[i]-1)%n]+=n;

    for(int i=0;i<n;i++)
    if(arr[i]<=n)
    return(i+1);

    return(n+1);

}
    public static void main(String[] args) {
    
        int arr[]={0, 10, 2, -10, 20};

        int n=arr.length;
        int ans=FirstMissingPositive(arr, n);

        System.out.println(ans);
}
    
}