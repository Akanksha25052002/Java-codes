import java.util.*;

public class Anagram {
    
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    if(is_Anagram(String str1, String str2)){

    }
}

public class Anagram_of_string{
    static boolean is_Anagram(String str1, String str2){
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                arr1[str1.charAt(i)-'a']++;
                arr2[str2.charAt(i)-'a']++;
            }
            for(int i=0;i<26;i++){
                if(arr1[i]!=arr2[i]){
                    return false;
                }
            }
            return true;
        }
        return false;

    }
}
}    
