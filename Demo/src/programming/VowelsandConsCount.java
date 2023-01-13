package programming;

import java.util.Scanner;

public class VowelsandConsCount {
	static void isCountVC(String x) {
		int vowel=0,consonent=0;
		x.toLowerCase();
		for(int i=0;i<x.length();i++) {
		char ch=x.charAt(i);
		if(Character.isLetter(ch))
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			vowel++;
		else
			consonent++;
		}
		System.out.println("no of vowels"+"->"+vowel);
		 System.out.println("no of consonent"+"->"+consonent);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		 isCountVC(a);
		
		
	}
		
	
	}


