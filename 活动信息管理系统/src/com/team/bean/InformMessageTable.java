package com.team.bean;

import java.util.Scanner;
//���ߣ�������
//֪ͨ��Ϣ��
public class InformMessageTable {
	Scanner input=new Scanner(System.in);
	//��Ϣ��
	private static String message=null;
	//֪ͨ����
	private static String text=null;
	//֪ͨʱ��
	private static Time t=new Time();
	//������֯
	private static String organization=null;
	//������Ϣ��
	public void setMessage() {
		String s=input.next();
		message=s;
	}
	//����֪ͨ����
	public void setText() {
		String s=input.next();
		text=s;
	}
	//����ʱ��
	public void setTime() {
		String s1,s2,s3,s4,s5,s6;
		s1=input.next();
		s2=input.next();
		s3=input.next();
		s4=input.next();
		s5=input.next();
		s6=input.next();
		t.setTime(s1, s2, s3, s4, s5, s6);
	}
	//���÷�����֯
	public void setOrganization() {
		String s=input.next();
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
