package usePlay;

import java.util.Scanner;

//֪ͨ��Ϣ��
public class Message {
	Scanner sc=new Scanner(System.in);
	//��Ϣ��
	public static String message=null;
	//֪ͨ����
	public static String text=null;
	//֪ͨʱ��
	public static Time t=new Time();
	//������֯
	public static String organization=null;
	//������Ϣ��
	public void setMessage() {
		String s=sc.next();
		message=s;
	}
	//����֪ͨ����
	public void setText() {
		String s=sc.next();
		text=s;
	}
	//����ʱ��
	public void setTime() {
		String s1,s2,s3,s4,s5,s6;
		s1=sc.next();
		s2=sc.next();
		s3=sc.next();
		s4=sc.next();
		s5=sc.next();
		s6=sc.next();
		t.setTime(s1, s2, s3, s4, s5, s6);
	}
	//���÷�����֯
	public void setOrganization() {
		String s=sc.next();
		organization=s;
	}
	
	//��ȡ��Ϣ��
	public String getMessage() {
		return message;
	}
	//��ȡ֪ͨ����
	public String getText() {
		return text;
	}
	//��ȡʱ��
	public String getT() {
		return t.getTime();
	}
	//��ȡ������֯
	public String getOrganization() {
		return organization;
	}
}
