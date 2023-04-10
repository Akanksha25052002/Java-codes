public class Leader{
    public static void main(String[] args) {
        
        // int []arr={11,12,9,7,10};
        int []arr={20, 0, 15, 17, 9};
        int n=arr.length;
        int curr=arr[n-1];
        System.out.println(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(curr<arr[i]){
                curr=arr[i];
                System.out.println(curr);
            }
        }

    }
}