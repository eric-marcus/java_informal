package sy3;

public class Bank {
	private Account ac[] = new Account[10];
	private int num = 0 ;
	
	//type: 0 savingAc ; 1 creditAc
	public void openAccount(long id, String passwd, String ensure, String name, String personid, String email, int type)
	{
		if(passwd.equals(ensure))
		{
			if(type == 0)
				ac[num] = new SavingAccount(id, name, passwd, personid, email);
			if(type == 1)
				ac[num] = new CreditAccount(id, name, passwd, personid, email);
			num++;
		}
	}
	
		public void login(long id, String passwd)
		{
			for(int i=0; i<num; i++)
			{
				if(ac[i].getId() == id)
				{
					if(ac[i].getPasswd().equals(passwd))
					{
						System.out.println("welcome");
						return;
					}
					else
						System.out.println("incorrect passwd");
				}
				if(i == 3)
					System.out.println("该帐号不存在");
			}
		}
		
		public void deposit(long id, double money)
		{
			for(int i=0; i<num; i++)
			{
				if(ac[i].getId() == id)
				{
					ac[i].deposit(money);
					return;
				}
				if(i == 3)
					System.out.println("该帐号不存在");
			}
		}
		
		public void withdraw(long id, double money)
		{
			for(int i=0; i<num; i++)
			{
				if(ac[i].getId() == id)
				{
					ac[i].withdraw(money);
					return;
				}
				if(i == 3)
					System.out.println("该帐号不存在");
			}
		}
		
		public Account setOverdraft(long id, double ceiling)
		{
			for(int i=0; i<num; i++)
			{
				if(ac[i].getId() == id)
				{
					if(ac[i].setCeiling(ceiling) == 1)
						return ac[i];
				}
				if(i == 3)
					System.out.println("该帐号不存在");
			}
			return null;
		}
		
		public double sum()
		{
			double sum=0;
			for(int i=0; i<num; i++)
			{
				sum = sum + ac[i].getBalance();
			}
			return sum;
		}
		
		public double overdraft()
		{
			double sum=0;
			for(int i=0; i<num; i++)
			{
				if(ac[i].getBalance() < 0)
					sum = sum + ac[i].getBalance();
			}
			return -sum;
		}
	
}
