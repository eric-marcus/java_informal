package sy3;

public abstract class Account{
	private long id;
	private String name;
	private String passwd;
	private String personid;
	private String email;
	private double balance=0;
	
	Account(){}
	Account(long id , String name, String passwd, String personid, String email)
	{
		this.setId(id);
		this.setName(name);
		this.setPasswd(passwd);
		this.setPersonid(personid);
		this.setEmail(email);
	}
	
	public abstract void deposit(double money);
	public abstract void withdraw(double money);
	
	
	public int setCeiling(double ceiling) {return 0;}
	
	
	public long getId() {return id;}
	protected void setId(long id) {this.id = id;}
	public String getName() {return name;}
	protected void setName(String name) {this.name = name;}
	public String getPasswd() {return passwd;}
	protected void setPasswd(String passwd) {this.passwd = passwd;}
	public String getPersonid() {return personid;}
	protected void setPersonid(String personid) {this.personid = personid;}
	public String getEmail() {return email;}
	protected void setEmail(String email) {this.email = email;}
	public double getBalance() {return balance;}
	protected void setBalance(double balance) {this.balance = balance;}
}

