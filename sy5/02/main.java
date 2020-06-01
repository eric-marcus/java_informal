package sy5_2;


public class main {
	public static void main(String[] args)
	{
		Course course = new Course();
		Thread 
			student1 = new Thread(course),
			student2 = new Thread(course),
			teacher  = new Thread(course);
		student1.setName("student1");
		student2.setName("student2");
		teacher.setName("teacher");
		
		
		teacher.start();
		student1.start();
		student2.start();
		course.setAttched(student1);
		course.setAttched2(student2);
	}
	
	
}
class Course implements Runnable
{
	Thread attachThread1, attachThread2;
	
	public void  setAttched(Thread t)
	{
		attachThread1 = t;
	}
	
	public void  setAttched2(Thread t)
	{
		attachThread2 = t;
	}
	
	public void run()
	{
		String name = Thread.currentThread().getName();
		
		if(name.equals("teacher"))
		{
			for(int i=0; i<3; i++)
				System.out.println("我是"+name+"  我要开始上课");
			attachThread1.interrupt();
		}
		
		if(name.equals("student1"))
		{
			try 
			{
				System.out.println("我是"+name+"  我要睡10分钟再听课");
	            Thread.sleep(10*60*1000);
			} 
			catch(InterruptedException e)
			{
				System.out.println("student1 被老师上课叫醒");
				
				attachThread2.interrupt();
			}
		}
		
		if(name.equals("student2"))
		{
			try 
			{
				System.out.println("我是"+name+"  我要睡60分钟再听课");
	            Thread.sleep(60*60*1000);
			} 
			catch(InterruptedException e)
			{
				System.out.println("student2 被student1叫醒");
			}
		}
	}
}
