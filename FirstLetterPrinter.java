package assignment1;

import java.util.Scanner; 
public class FirstLetterPrinter {   
	public static void main(String[] args) {    
		Scanner in = new Scanner(System.in);     
		String input = in .nextLine();     
		System.out.println(firstLetterPrinter(input));   }   
	static String firstLetterPrinter(String str) {     
		String words[]=str.split(" ");
		//System.out.println(words.length);
		char output[]=new char[words.length];
		for(int i=0;i<words.length;i++) {
			char letterarr[]=words[i].toCharArray();
			output[i]=letterarr[0];
		}
		String opt=new String(output);
		return opt;
	}
	
}

