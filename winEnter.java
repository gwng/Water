package usePlay;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/*
 * 未解决问题！
 * 		1.布局不稳定:随窗体的变化而变化
 * 		2.各个组件触发事件没有学习 若使用同一个会产生冲突
 */
class WEnter extends JFrame implements ActionListener{
	//提示标签---1
	JLabel lb1=new JLabel("用户名:");
	//输入用户账号文本框
	JTextField uname=new JTextField(16);
	//提示标签--2
	JLabel lb2=new JLabel("*请输入手机号码");
	//提示标签---3
	JLabel lb3=new JLabel("密码:");
	//输入密码的密码框
	JPasswordField pwd=new JPasswordField(16);
	//登陆按钮
	JButton btn1=new JButton("登陆");
	//注册按钮
	JButton btn2=new JButton("注册");
	//创建面板 用于收纳组件 使格局相对工整
	Panel p1=new Panel();
	Panel p2=new Panel();
	Panel p3=new Panel();
	Panel p4=new Panel();
	
	WEnter(){
		//设置窗口大小
		setSize(303,292);
		//设置是否显示窗口
		setVisible(true);
		//窗口标题
		setTitle("登陆界面");
		//是否可关闭
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//设置窗口内的组件 布局格式
		setLayout(new FlowLayout());
		//向窗口添加组件
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		//每项组件单独添加其他组件
		p1.add(lb1);
		p1.add(uname);		//收纳 标签1、账户文本框
		p2.add(lb2);		//收纳 标签2
		p3.add(lb3);
		p3.add(pwd);		//收纳 标签3、密码框
		p4.add(btn1);
		p4.add(btn2);		//收纳登陆 注册按钮
		//是否显示窗口内的组件
		validate();
		//触发事件 后期学到鼠标事件会改
		btn1.addActionListener(new ActionListener() {
			
			@Override
			//关于登陆按钮触发事件
			public void actionPerformed(ActionEvent e) {
				/*
				 * 基本思路:
				 * 		1.先获取账号文本框内容
				 * 		2.提交文本框内容给数据库
				 * 		3.数据库查找并返回结果
				 * 		4.账号内容对比数据库返回内容 进而判断是否比较密码
				 * 		5.获取密码框内容 比较密码
				 * 		6.得出判断结果 执行不同方法---打开主界面or登陆失败
				 */
				//登陆方法简单示范
				if(uname.getText().equals("18320581288") && pwd.getText().equals("1006746222")){
					//弹出新窗口
					JFrame newf=new JFrame("新建窗体");
					newf.setSize(900,900);
					newf.setVisible(true);
					//这一步原本是关闭窗口 ---但是不会 哈哈哈
					lb2.setText("登陆成功");
					//窗口消失
					dispose();
				}else {
					lb2.setText("账号或密码错误！！！");
				}
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//弹出注册窗口---改
				new RUser();
			}
		});
	}
}
//简单测试是否有bug 或者无法编译
public class winEnter {
	public static void main(String[] args) {
		new WEnter();
	}
}
