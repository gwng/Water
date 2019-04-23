package com.team.bean;
//活动信息表
import java.util.Scanner;


public class ActionMessageTable {
	Scanner sc=new Scanner(System.in);
	//状态枚举
	private static enum status{
		not_push,in,out_of_date,undefined
	};
	//活动名
	private static String actionName=null;
	//活动内容
	private static String actionTxt=null;
	//活动类型
	private static String actionClass=null;
	//发布时间
	private static Time pushTime=new Time();
	//活动状态
	private static status actionStatus=status.undefined;
	//活动归属组织
	private static String actionOrganization=null;
	//活动截止时间
	private static Time stopTime=new Time();
	//活动报名时间
	private static Time beginTime=new Time();
	
	//获取活动名
	public String getActionName() {
		return actionName;
	}
	//获取活动内容
	public String getActionTxt() {
		return actionTxt;
	}
	//获取活动类型
	public String getActionClass() {
		return actionClass;
	}
	//获取活动发布时间
	public String getPushTime() {
		return pushTime.getTime();
	}
	//获取活动状态
	public status getActionStatus() {
		return actionStatus;
	}
	//获取活动归属组织
	public String getActionOrganization() {
		return actionOrganization;
	}
	//获取活动截止时间
	public String getStopTime() {
		return stopTime.getTime();
	}
	//获取活动报名时间
	public String getBeginTime() {
		return beginTime.getTime();
	}
	
	
	//设置活动名
	public void setActionName() {
		String s=sc.next();
		actionName=s;
	}
	//设置活动内容
	public void setActionTxt() {
		String s=sc.next();
		actionTxt=s;
	}
	//设置活动类型
	public void setActionClass() {
		String s=sc.next();
		actionClass=s;
	}
	//设置活动发布时间
	public void setPushTime() {
		String s1,s2,s3,s4,s5,s6;
		s1=sc.next();
		s2=sc.next();
		s3=sc.next();
		s4=sc.next();
		s5=sc.next();
		s6=sc.next();
		pushTime.setTime(s1, s2, s3, s4, s5, s6);
	}
	//设置活动状态
	public void setActionStatus() {
		String s=sc.next();
		actionStatus=(status)s;
	}
	//设置活动归属组织
	public void setActionOrganization() {
		String s=sc.next();
		actionOrganization=s;
	}
	//设置活动截止时间
	public void setStopTime() {
		String s1,s2,s3,s4,s5,s6;
		s1=sc.next();
		s2=sc.next();
		s3=sc.next();
		s4=sc.next();
		s5=sc.next();
		s6=sc.next();
		stopTime.setTime(s1, s2, s3, s4, s5, s6);
	}
	//设置活动报名时间
	public void setBeginTime() {
		String s1,s2,s3,s4,s5,s6;
		s1=sc.next();
		s2=sc.next();
		s3=sc.next();
		s4=sc.next();
		s5=sc.next();
		s6=sc.next();
		beginTime.setTime(s1, s2, s3, s4, s5, s6);
	}
	
}
