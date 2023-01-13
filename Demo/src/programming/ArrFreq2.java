package programming;

public class ArrFreq2 {

	public static void main(String[] args) {
		int count=1,visited=-1;
		int [] arr={23,45,56,45,-56,45,28,58};
		int []arr1=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]!=visited && arr[i]==arr[j]) {
					count++;
					arr[j]=visited;
				}
			}
			arr1[i]=count;
			count=1;
		}
		for(int i=0;i<arr1.length;i++) {
			if(arr[i]!=visited) {
				System.out.println("frequency of "+arr[i]+" : "+arr1[i]);
			}
		}
	}

}
