
/*   public static void main(String[]args){
        String str="Java";
        String lower_str= str.toLowerCase();
        System.out.println("Original String: "+str);
        System.out.println("String in lowercase: "+lower_str);
    }    */


import java.util.*;
public class SortedSubstring {
	//method for creating sustrings of the string
	public static void SubString(String str, int n)
	{int i,j;
	for ( i = 0; i < n; i++)
	{
		for ( j = i+1; j <= n; j++)
		{
			System.out.println(str.substring(i, j));
			String arrS=str.substring(i, j);
		}
	}
	ArrayList<String> aList=new ArrayList<String>();
	for( i=0;i<str.length();i++){
		for( j=1;j<=str.length()-i;j++){
			String subString=str.substring(i, i+j);
			aList.add(subString);

		}
	}
Collections.sort(aList);
	System.out.println(aList);
	}

	//method for sorting Substrings lexicographically
	public static void sortLexicographically(String strArr[])
	{
		for (int i = 0; i < strArr.length; i++) {
			for (int j = i + 1; j < strArr.length; j++) {
				if (strArr[i].compareToIgnoreCase(strArr[j])
						> 0) {
					String temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
				}
			}
		}
	}

	// this function prints the array passed as argument
	public static void printArray(String strArr[])
	{
		for (String string : strArr)
			System.out.print(string + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=sc.next(),sL;boolean CheckChar=false;
		char chars[]=s.toCharArray();

		for (char c : chars) {
			if(!Character.isLetter(c)) {
				CheckChar= false;
			}
		}
		CheckChar=true;

		if(CheckChar=true)
		{
			sL=s.toLowerCase();
			System.out.println("String converted to lowercase is "+sL);
			System.out.println("Substrings of lowercase lettered String is ");
			SubString(sL,s.length());

			//Sorting array lexicographically
			// sortLexicographically(arr);

			//printArray(arr);
		}
		else
			System.out.println("Invalid input");

	}
}