package usePlay;

import java.util.Scanner;

//通知信息表
public class Message {
	Scanner sc=new Scanner(System.in);
	//信息名
	public static String message=null;
	//通知内容
	public static String text=null;
	//通知时间
	public static Time t=new Time();
	//发布组织
	public static String organization=null;
	//设置信息名
	public void setMessage() {
		String s=sc.next();
		message=s;
	}
	//设置通知内容
	public void setText() {
		String s=sc.next();
		text=s;
	}
	//设置时间
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
	//设置发布组织
	public void setOrganization() {
		String s=sc.next();
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
