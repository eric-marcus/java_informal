package sy3;

public class main {
	public static void main(String[] args)
	{
		Bank ac = new Bank();
		ac.openAccount(1, "111", "111", "001", "001", "001@qq.com", 0);	//	save
		ac.openAccount(2, "222", "222", "002", "002", "002@163.com", 1);//	credit
		ac.openAccount(3, "333", "333", "003", "003", "003@gmail.com", 1);//	 credit - overdraft
		
		ac.login(1, "111");		//登录 id:1
		ac.deposit(1, 100.0);	//存钱  id:1   +100
		ac.setOverdraft(3, 200.0);	//设置id:3 的透支额度为200
		ac.withdraw(3, 200.0); 	//id:3  取200即透支200
		System.out.println("总余额："+ac.sum());
		System.out.println("总透支额度："+ac.overdraft());
	}
}
