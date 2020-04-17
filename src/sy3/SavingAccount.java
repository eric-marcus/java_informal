package sy3;

public class SavingAccount extends Account{
	
	SavingAccount(long id , String name, String passwd, String personid, String email)
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
		if((getBalance()-money) > 0)
			setBalance(getBalance()-money);
		else
			System.out.println("余额不足");
	}
	
}
