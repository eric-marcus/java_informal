package java_9_0;

interface A
{
	void printCapitalLetter();
}
interface B
{
	void prinLowercaseLetter();
}


public class print implements A , B
{
	public void printCapitalLetter()
	{
		for(int i=65; i<91; i++)
		{
			System.out.print((char)i);
		}
		System.out.println();
	}
	
	public void prinLowercaseLetter()
	{
		for(int i=97; i<123; i++)
		{
			System.out.print((char)i);
		}
		System.out.println();
	}
}
