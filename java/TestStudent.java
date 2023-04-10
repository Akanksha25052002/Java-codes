 class Student {
    int checkNum(int num) {

             
        if(num%2==0){
            System.out.println(num+" is even .");
        }
        else{
            System.out.println(num+" is odd .");
        }
        return num;
    }
    
}
public class TestStudent{
    public static void main(String args[]){
        Student s=new Student();
        s.checkNum(256);
        
        
    }
} 
