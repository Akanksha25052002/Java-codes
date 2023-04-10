import java.util.Scanner;

public class Strobo {
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // String a=sc.next();
        int n;
        n=121;
        String s= ""+n;
        // s="121";
        String.valueOf(n);
        if(s.contains("2")||s.contains("3")||s.contains("4")||s.contains("5")||s.contains("7")){
            System.out.println("Strobogrammatic number");
        }
        else{
            
            StringBuffer s1=new StringBuffer(s);
            s1.reverse();
            String s2=s1.toString();
            // String s1=new StringBuffer(s).reverse();
        // String s2="";
        for(int i=0;i<s.length();i++){
            s2=s2+rotate(s1.charAt(i));
            // s2="1691";
        }
        
        if(s==s2){
            System.out.println("non Strobogrammatic number");
        }
        else{
            System.out.println("Strobogrammatic number");
        }
          
        
    }
}

    private static String rotate(char charAt) {
        return null;
    }

}

class Main{
    char Rotate(char ch){
        switch(ch){
            case '6':
            return '9';
            case '9':
            return '6';
            default:
            return ch;
        }
        
    }
}