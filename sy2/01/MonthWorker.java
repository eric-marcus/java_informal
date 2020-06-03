package sy2_2;

public class MonthWorker extends Employee{
	public void earnings()
	{
		System.out.println("月薪"+getPay());
	}
	
	public int paid()
	{
		return getPay()*12;
	}

}
