package com.team.bean;

import java.util.Scanner;
//作者：钟泽南
//通知信息表
public class InformMessageTable {
	Scanner input=new Scanner(System.in);
	//信息名
	private static String message=null;
	//通知内容
	private static String text=null;
	//通知时间
	private static Time t=new Time();
	//发布组织
	private static String organization=null;
	//设置信息名
	public void setMessage() {
		String s=input.next();
		message=s;
	}
	//设置通知内容
	public void setText() {
		String s=input.next();
		text=s;
	}
	//设置时间
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
	//设置发布组织
	public void setOrganization() {
		String s=input.next();
		organization=s;
	}
	
	//获取信息名
	public String getMessage() {
		return message;
	}
	//获取通知内容
	public String getText() {
		return text;
	}
	//获取时间
	public String getT() {
		return t.getTime();
	}
	//获取发布组织
	public String getOrganization() {
		return organization;
	}
}
