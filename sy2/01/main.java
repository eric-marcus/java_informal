package sy2_2;

public class main {
	public static void main(String[] args)
	{
		Employee ww = new WeekWorker();
		Employee mw = new MonthWorker();
		Employee yw = new YearWorker();
		Employee[] ep = new Employee[3];
		ep[0] = ww;
		ep[1] = mw;
		ep[2] = yw;
		
		ww.setPay(100);
		ww.earnings();
		mw.setPay(200);
		mw.earnings();
		yw.setPay(300);
		yw.earnings();
	}
}
