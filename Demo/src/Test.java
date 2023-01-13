
public class Test {

	public static void main(String[] args) {
		Account ac1=new Account("sheela",8765432l,100000l);
		System.out.println(ac1.getAccno());
		System.out.println(ac1.getBalance());
		System.out.println(ac1.getName());
		ac1.setBalance(5000l);
		System.out.println(ac1.getBalance());
		

	}

}
