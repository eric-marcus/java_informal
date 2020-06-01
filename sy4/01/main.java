package sy4_1;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class main {
	public static void main(String[] args)
	{
		JFrame jFrame = new JFrame("登录系统");
		jFrame.setSize(900, 600);
		jFrame.setVisible(true);
		
		JPanel jPanel = new JPanel();
		jFrame.add(jPanel);
		
		JLabel l1 = new JLabel("欢迎使用本系统",JLabel.CENTER);
		JLabel l2 = new JLabel("用户名");
		JLabel l3 = new JLabel("密码");
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JButton button1 = new JButton("登录");
		JButton button2 = new JButton("重置");
		
		jPanel.add(l1);
		jPanel.add(l2);
		jPanel.add(l3);
		jPanel.add(text1);
		jPanel.add(text2);
		jPanel.add(button1);
		jPanel.add(button2);
		
		l1.setBounds(300, 20, 300, 100);
		l2.setBounds(200, 80, 300, 100);
		text1.setBounds(280, 110, 300, 40);
		text2.setBounds(280, 160, 300, 40);
		l3.setBounds(200, 130, 300, 100);
		button1.setBounds(300, 300, 100, 50);
		button2.setBounds(450, 300, 100, 50);
		
				
				
				
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
	}
}
