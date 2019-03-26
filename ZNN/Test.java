package usePlay;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

class userWin extends JFrame implements ActionListener{
	JPanel head=new JPanel();
	JPanel pan1=new JPanel();
	JPanel pan2=new JPanel();
	JPanel pan3=new JPanel();
	JPanel pan4=new JPanel();
	
	
	JPanel Apan=new JPanel();
	JPanel Cpan=new JPanel();
	
	JButton btn1=new JButton("推荐");
	JButton btn2=new JButton("活动");
	JButton btn3=new JButton("通知");
	JButton btn4=new JButton("我的");
	JTextField txt=new JTextField(10);
	userWin(){
		setSize(800,800);
		setVisible(true);
		setTitle("我的界面");
		//设置为边界界面
		setLayout(new BorderLayout());
		//先将西边 用面板填满
		add("West",Apan);
		//中心用面板填满
		add("Center",Cpan);
		//设置为4行1列
		Apan.setLayout(new GridLayout(5,1));
		//设置固定大小 
		Apan.setPreferredSize(new Dimension(150, 800));
		Apan.add(head);
		Apan.add(btn1);
		
		Apan.add(btn2);
		
		Apan.add(btn3);
		
		Apan.add(btn4);
		
		Cpan.add(txt);
		
		//添加事件 可以更改为想要事件 采用匿名的方法
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		validate();
		
	}
	//示范事件 以后通过不同按钮改变事件
	public void actionPerformed(ActionEvent e) {
		String str=((JButton)e.getSource()).getText();
		txt.setText(str);
	}
}
public class Test {
	public static void main(String[] args){
		new userWin();
	}

	
}
