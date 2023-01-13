package Arrayprog;

public class NoOfEvenOdd {
	int ec=0,oc=0;
	static int[] countEO(int []arr) {
		int ec=0,oc=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				ec++;
			else
				oc++;
		}
		int[] count= {ec,oc};
		return count;
	}
	public static void main(String[] args) {
		int[] x= {23,87,67,44,34,93,76};
		int[] ct=countEO(x);
		System.out.println("even count is :"+ct[0]);
		System.out.println("odd count is :"+ct[1]);
	}

}
