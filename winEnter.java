package usePlay;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/*
 * δ������⣡
 * 		1.���ֲ��ȶ�:�洰��ı仯���仯
 * 		2.������������¼�û��ѧϰ ��ʹ��ͬһ���������ͻ
 */
class WEnter extends JFrame implements ActionListener{
	//��ʾ��ǩ---1
	JLabel lb1=new JLabel("�û���:");
	//�����û��˺��ı���
	JTextField uname=new JTextField(16);
	//��ʾ��ǩ--2
	JLabel lb2=new JLabel("*�������ֻ�����");
	//��ʾ��ǩ---3
	JLabel lb3=new JLabel("����:");
	//��������������
	JPasswordField pwd=new JPasswordField(16);
	//��½��ť
	JButton btn1=new JButton("��½");
	//ע�ᰴť
	JButton btn2=new JButton("ע��");
	//������� ����������� ʹ�����Թ���
	Panel p1=new Panel();
	Panel p2=new Panel();
	Panel p3=new Panel();
	Panel p4=new Panel();
	
	WEnter(){
		//���ô��ڴ�С
		setSize(303,292);
		//�����Ƿ���ʾ����
		setVisible(true);
		//���ڱ���
		setTitle("��½����");
		//�Ƿ�ɹر�
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//���ô����ڵ���� ���ָ�ʽ
		setLayout(new FlowLayout());
		//�򴰿�������
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		//ÿ�������������������
		p1.add(lb1);
		p1.add(uname);		//���� ��ǩ1���˻��ı���
		p2.add(lb2);		//���� ��ǩ2
		p3.add(lb3);
		p3.add(pwd);		//���� ��ǩ3�������
		p4.add(btn1);
		p4.add(btn2);		//���ɵ�½ ע�ᰴť
		//�Ƿ���ʾ�����ڵ����
		validate();
		//�����¼� ����ѧ������¼����
		btn1.addActionListener(new ActionListener() {
			
			@Override
			//���ڵ�½��ť�����¼�
			public void actionPerformed(ActionEvent e) {
				/*
				 * ����˼·:
				 * 		1.�Ȼ�ȡ�˺��ı�������
				 * 		2.�ύ�ı������ݸ����ݿ�
				 * 		3.���ݿ���Ҳ����ؽ��
				 * 		4.�˺����ݶԱ����ݿⷵ������ �����ж��Ƿ�Ƚ�����
				 * 		5.��ȡ��������� �Ƚ�����
				 * 		6.�ó��жϽ�� ִ�в�ͬ����---��������or��½ʧ��
				 */
				//��½������ʾ��
				if(uname.getText().equals("18320581288") && pwd.getText().equals("1006746222")){
					//�����´���
					JFrame newf=new JFrame("�½�����");
					newf.setSize(900,900);
					newf.setVisible(true);
					//��һ��ԭ���ǹرմ��� ---���ǲ��� ������
					lb2.setText("��½�ɹ�");
					//������ʧ
					dispose();
				}else {
					lb2.setText("�˺Ż�������󣡣���");
				}
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//����ע�ᴰ��---��
				new RUser();
			}
		});
	}
}
//�򵥲����Ƿ���bug �����޷�����
public class winEnter {
	public static void main(String[] args) {
		new WEnter();
	}
}
