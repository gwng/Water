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
	
	JButton btn1=new JButton("�Ƽ�");
	JButton btn2=new JButton("�");
	JButton btn3=new JButton("֪ͨ");
	JButton btn4=new JButton("�ҵ�");
	JTextField txt=new JTextField(10);
	userWin(){
		setSize(800,800);
		setVisible(true);
		setTitle("�ҵĽ���");
		//����Ϊ�߽����
		setLayout(new BorderLayout());
		//�Ƚ����� ���������
		add("West",Apan);
		//�������������
		add("Center",Cpan);
		//����Ϊ4��1��
		Apan.setLayout(new GridLayout(5,1));
		//���ù̶���С 
		Apan.setPreferredSize(new Dimension(150, 800));
		Apan.add(head);
		Apan.add(btn1);
		
		Apan.add(btn2);
		
		Apan.add(btn3);
		
		Apan.add(btn4);
		
		Cpan.add(txt);
		
		//����¼� ���Ը���Ϊ��Ҫ�¼� ���������ķ���
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		validate();
		
	}
	//ʾ���¼� �Ժ�ͨ����ͬ��ť�ı��¼�
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
