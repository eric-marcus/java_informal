package sy2_1;

public class main {
	public static void main(String[] args)
	{
		Genstudent gs = new Genstudent();
		Outstudent os = new Outstudent();
		Student st = new Genstudent();
		Student[] sts = new Student[3];
		sts[0] = gs;
		sts[1] = os;
		sts[2] = st;
		School sh = new School(sts);
		
		gs.setName("gens");
		os.setName("outs");
		st.setName("student");
		
		gs.learn();
		os.learn();
		st.learn();
		
		sh.showName();
	}
}
