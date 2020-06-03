package sy2_2;

public class WeekWorker extends Employee{
	public void earnings()
	{
		System.out.println("周薪"+getPay());
	}
	
	public int paid()
	{
		return getPay()*52;
	}

}
