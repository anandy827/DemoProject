package Arrayprog;

public class FindSmallest {
	static int getSum(int []arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] n= {25,50,75,75,75};
		int sm= getSum(n);
		System.out.println(sm);
	}
}