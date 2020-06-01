package sy4;

import java.awt.*;

import javax.swing.*;


public class main 
{
	public static void main(String[] args)
	{
		
		JFrame jFrame = new JFrame("demo");	//window	-0
		jFrame.setSize(900, 600);
		jFrame.setVisible(true);
		
		
		JPanel pCenter = new JPanel(new GridLayout(7,7));	//panel		-1
		jFrame.add(pCenter,BorderLayout.CENTER);
		
		String str[] = {"日","一","二","三","四","五","六"};
		for(int i=0; i<7; i++)
		{
			pCenter.add(new JLabel("周"+str[i]));
		}
		for(int i=26; i<=30; i++)
		{
			pCenter.add(new JLabel(" "+i));
		}
		for(int i=1; i<=31; i++)
		{
			pCenter.add(new JLabel(""+i));
		}
		for(int i=1; i<=6; i++)
		{
			pCenter.add(new JLabel(""+i));
		}

		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		
    }

	
	
}
