package com.team.bean;

import java.util.Scanner;

//֪ͨ��Ϣ��
public class Message {
	Scanner sc=new Scanner(System.in);
	//��Ϣ��
	private static String message=null;
	//֪ͨ����
	private static String text=null;
	//֪ͨʱ��
	private static Time t=new Time();
	//������֯
	private static String organization=null;
	//������Ϣ��
	private void setMessage() {
		String s=sc.next();
		message=s;
	}
	//����֪ͨ����
	private void setText() {
		String s=sc.next();
		text=s;
	}
	//����ʱ��
	private void setTime() {
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
	private void setOrganization() {
		String s=sc.next();
		organization=s;
	}
	
	//��ȡ��Ϣ��
	private String getMessage() {
		return message;
	}
	//��ȡ֪ͨ����
	private String getText() {
		return text;
	}
	//��ȡʱ��
	private String getT() {
		return t.getTime();
	}
	//��ȡ������֯
	private String getOrganization() {
		return organization;
	}
}
