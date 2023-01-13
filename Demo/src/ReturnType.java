import java.util.Scanner;

public class ReturnType {
	public static String concate() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name");
		String s1 = sc.nextLine();
		String a2 = sc.nextLine();
		System.out.println("enter second name");
		String res = s1+a2;
		return res;
	}
	public static void main(String[]args) {
  String res = concate();
  System.out.println(res);
		









	}



}


