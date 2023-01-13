
public class Account {
	private String name;
	private long accno;
	private long balance;
	public Account(String name,long accno,long balance)
	{
		this.name=name;
		this.accno=accno;
		this.balance=balance;
	}
	public String getName()
	{
		return name;
	}
	public long getAccno()
	{
		return accno;
	}
	public long getBalance()
	{
		return balance;
	}
	public void setBalance(long balance)
	{
		this.balance=balance;
	}

}
	
		

	


