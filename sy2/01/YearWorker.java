package sy2_2;

public class YearWorker extends Employee{
	public void earnings()
	{
		System.out.println("年薪"+getPay());
	}
	
	public int paid()
	{
		return getPay();
	}
}
