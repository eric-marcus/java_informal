package sy3;

public class CreditAccount extends Account{
	
	private double ceiling;
	
	public double getCeiling() {return ceiling;}
	public int setCeiling(double ceiling) {this.ceiling = ceiling;return 1;}
	
	CreditAccount(){};
	CreditAccount(long id , String name, String passwd, String personid, String email)
	{
		this.setId(id);
		this.setName(name);
		this.setPasswd(passwd);
		this.setPersonid(personid);
		this.setEmail(email);
	}
	
	public void deposit(double money) 
	{
		setBalance(getBalance()+money);
	}

	public void withdraw(double money)
	{
		if((getBalance()-money) > 0 || (getBalance()-money) >= -getCeiling())
			setBalance(getBalance()-money);
		else
			System.out.println("信用额度不足");
	}

}
