public class RemoveElement {
    public static void main(String[] args) {
        
        int a[]={5, 8, 10, 16, 45};
        int remove=8; int count=0;
        
        for(int i=0;i<a.length;i++){
            // System.out.println(a[i]);
            if(remove==a[i]){
                for(int j=i;j<a.length-1;j++){
                    a[j]=a[j+1];
                    // System.out.println(a[j]);
                }
                count++;
                break;
            }
            
            }
        
            if(count>0){
                System.out.println("element deleted successfully");
    
                for(int i=0;i<a.length-1;i++){
                    System.out.println(a[i]+"");
                }
            }
            else{
                System.out.println("Element not found");
                
            }
        }

    }

    

