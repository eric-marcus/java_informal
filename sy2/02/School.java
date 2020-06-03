package sy2_1;

public class School {
	Student sts[];
	
	School(Student sts[])
	{
		this.sts =  new Student[3];
		this.sts[0] = sts[0];
		this.sts[1] = sts[1];
		this.sts[2] = sts[2];
	}
	
	void showName()
	{
		for(int i=0; i<sts.length; i++)
		{
			System.out.println(sts[i].getName());
		}
	}
}
