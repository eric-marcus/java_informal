package sy2_2;

public abstract class Employee {
	private int pay;
	
	void setPay(int pay) {this.pay = pay;}
	int getPay() {return pay;}
	
	public abstract void earnings();
	public abstract int paid();
}
