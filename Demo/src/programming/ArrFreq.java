package programming;

public class ArrFreq {
	public static void main(String[] args) {
		int count=0;
		int [] arr={23,45,56,45,28,45,28,53};
		boolean [] rs=new boolean[arr.length];
		for(int i=0;i<arr.length;i++){
			if(rs[i]==false){
				count++;
				for(int j=i+1;j<arr.length;j++){
					if( arr[i]==arr[j]){
						count++;
						rs[j]=true;
					}
					System.out.println(arr[i]+" "+count);
				}
			}
		}
	}
}


