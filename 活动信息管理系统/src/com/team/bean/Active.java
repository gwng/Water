package com.team.bean;
//活动信息表
import java.util.Scanner;
//创建时间类
class Time{
	//设置年月日时分秒
	private String year;
	private String month;
	private String day;
	private String dhour;
	private String dminter;
	private String second;
	//初始化
	Time(){
		year="0000";
		month="00";
		day="00";
		dhour="00";
		dminter="00";
		second="00";
	}
	//设置时间方法
	public void setTime(String year,String month,String day,String dhour,String dminter,String dsecond) {
		this.year=year;
		this.month=month;
		this.day=day;
		this.dhour=dhour;
		this.dminter=dminter;
		this.second=dsecond;
		
	}
	//获取时间方法
	public String getTime() {
		String str;
		str=year+"-"+month+"-"+day+"-"+dhour+"-"+dminter+"-"+second;
		return str;
	}
}


public class Active {
	Scanner input=new Scanner(System.in);
	//状态枚举
	private static enum status{
		Going,Stop,Cancel,undefined
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
	private String getActionName() {
		return actionName;
	}
	//获取活动内容
	private String getActionTxt() {
		return actionTxt;
	}
	//获取活动类型
	private String getActionClass() {
		return actionClass;
	}
	//获取活动发布时间
	private String getPushTime() {
		return pushTime.getTime();
	}
	//获取活动状态
	private status getActionStatus() {
		return actionStatus;
	}
	//获取活动归属组织
	private String getActionOrganization() {
		return actionOrganization;
	}
	//获取活动截止时间
	private String getStopTime() {
		return stopTime.getTime();
	}
	//获取活动报名时间
	private String getBeginTime() {
		return beginTime.getTime();
	}
	
	
	//设置活动名
	private void setActionName() {
		String s=input.next();
		actionName=s;
	}
	//设置活动内容
	private void setActionTxt() {
		String s=input.next();
		actionTxt=s;
	}
	//设置活动类型
	private void setActionClass() {
		String s=input.next();
		actionClass=s;
	}
	//设置活动发布时间
	private void setPushTime() {
		String s1,s2,s3,s4,s5,s6;
		s1=input.next();
		s2=input.next();
		s3=input.next();
		s4=input.next();
		s5=input.next();
		s6=input.next();
		pushTime.setTime(s1, s2, s3, s4, s5, s6);
	}
	//设置活动状态

	//设置活动归属组织
	private void setActionOrganization() {
		String s=input.next();
		actionOrganization=s;
	}
	//设置活动截止时间
	private void setStopTime() {
		String s1,s2,s3,s4,s5,s6;
		s1=input.next();
		s2=input.next();
		s3=input.next();
		s4=input.next();
		s5=input.next();
		s6=input.next();
		stopTime.setTime(s1, s2, s3, s4, s5, s6);
	}
	//设置活动报名时间
	private void setBeginTime() {
		String s1,s2,s3,s4,s5,s6;
		s1=input.next();
		s2=input.next();
		s3=input.next();
		s4=input.next();
		s5=input.next();
		s6=input.next();
		beginTime.setTime(s1, s2, s3, s4, s5, s6);
	}
	
}
