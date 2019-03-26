package usePlay;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/*
 * 注册页面
 * 		1.账号名称
 * 		2.密码
 * 		3.手机号+按钮
 * 		4.验证码
 * 		5.注册按钮
 */
class RUser extends JFrame implements ActionListener{
	Panel p1=new Panel();
	Panel p2=new Panel();
	Panel p3=new Panel();
	Panel p4=new Panel();
	Panel p5=new Panel();
	JLabel lb1=new JLabel("昵称:");
	JLabel lb2=new JLabel("密码:");
	JLabel lb3=new JLabel("手机:");
	JLabel lb4=new JLabel("验证:");
	JTextField jf1=new JTextField(20);
	JPasswordField jpf=new JPasswordField(20);
	JTextField jf2=new JTextField(12);
	JTextField jf3=new JTextField(5);
	JButton btn1=new JButton("发送验证码");
	JCheckBox jcb=new JCheckBox("同意条款");
	JButton btn2=new JButton("注册");
	RUser(){
		setSize(400,300);
		setVisible(true);
		setTitle("注册页面");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(p1);
		p1.add(lb1);
		p1.add(jf1);
		add(p2);
		p2.add(lb2);
		p2.add(jpf);
		add(p3);
		p3.add(lb3);
		p3.add(jf2);
		p3.add(btn1);
		add(p4);
		p4.add(lb4);
		p4.add(jf3);
		add(jcb);
		add(p5);
		p5.add(btn2);
		
		validate();
	}
}


public class regUser {
	public static void main(String[] args) {
		new RUser();
	}
}
