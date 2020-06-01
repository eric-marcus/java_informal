package sy5_1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class window extends JFrame
{
	JTextField
		text1 = new JTextField("上底"),
		text2 = new JTextField("下底"),
		text3 = new JTextField("高");
	JTextArea
		area = new JTextArea("面积");
	JButton
		button = new JButton("button");
	BL
		blistener = new BL();
	
	public window()
	{
		super("梯形");
		setSize(900, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		button.addActionListener(blistener);
		add(text1);
		add(text2);
		add(text3);
		add(area);
		add(button);
	}
	
	class BL implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			trapezoid object = new trapezoid();
			String num;
			num = ""+object.getTop();
			text1.setText(num);
			num = ""+object.getBottom();
			text2.setText(num);
			num = ""+object.getHigh();
			text3.setText(num);
			num = ""+object.getArea();
			area.setText(num);
		}
	}
	
}
