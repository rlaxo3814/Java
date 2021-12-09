package mc.sn.day6;

public class Account {
	private int balance;
	public static final int MIN_VALUE = 0;
	public static final int MAX_VALUE = 1000000;
	private String ano;
	private String owner;
	
	 
	 
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
}
