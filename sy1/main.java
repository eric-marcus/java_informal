package sy1;

public class main {
	public static void main(String[] args)
	{
		t1 a = new t1();
		a.setRecord("123", "eric", "99");
		a.setRecord("1234", "eri", "98");
		a.setRecord("12345", "mark", "100");
		System.out.println(a.getRecord("12345"));
	}
}
