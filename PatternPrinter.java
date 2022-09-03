package assignment1;

import java.util.Scanner;

public class PatternPrinter {

	public static void main(String[] args) {     
		Scanner in = new Scanner(System.in);     
		int n = in .nextInt();     patternPrinter(n);  
		}   
	static void patternPrinter(int n) {     
		int i,j;
		for(i=n;i>0;i--) {
			for(j=n;j>0;j--) {
				//String s=String.valueOf(j);
				int k=i;
				while(k>0) {
				System.out.print(j);
				k--;
				}
			}
			System.out.println();
		}
	}

}
