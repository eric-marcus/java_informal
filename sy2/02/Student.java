package sy2_1;

public abstract class Student {
	private String 
			id,
			name;
	private int 
			age;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void eat()
	{
		System.out.println("吃:---");
	}
	
	public abstract void learn();
	
}
