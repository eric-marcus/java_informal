package sy1;


public class t1 {
	private String[][] members = new String[10][3];
	private static int count = 0;
	
	void setRecord(String id, String name, String score)
	{
		members[count][0] = new String(id);
		members[count][1] = new String(name);
		members[count][2] = new String(score);
		count++;
	}

	String getRecord(String id)
	{
		for(int i=0; i<count; i++)
		{
			if(members[i][0].equals(id))
				return members[i][2];
		}
		
		return "error"; 
	}
}
