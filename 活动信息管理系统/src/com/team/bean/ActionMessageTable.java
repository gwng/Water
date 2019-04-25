package com.team.bean;
//作者：钟泽南
//活动信息表  
import java.util.Scanner;




public class ActionMessageTable {
	Scanner input=new Scanner(System.in);
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
		String s=input.next();
		actionName=s;
	}
	//设置活动内容
	public void setActionTxt() {
		String s=input.next();
		actionTxt=s;
	}
	//设置活动类型
	public void setActionClass() {
		String s=input.next();
		actionClass=s;
	}
	//设置活动发布时间
	public void setPushTime() {
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
	public void setActionStatus() {
		int choose = 0;				
		System.out.print("请输入序号来选择活动状态 （1.尚未开始  2.进行中 3.活动结束） ：");
		choose = input.nextInt();
		if (choose == 1)
			actionStatus = status.not_push;
		else if (choose == 2)
			actionStatus = status.in;
		else if (choose == 3)
			actionStatus = status.out_of_date;
		else {
			System.out.println("输入错误！请按提示再次输入：");
			setActionStatus();}
	}
	//设置活动归属组织
	public void setActionOrganization() {
		String s=input.next();
		actionOrganization=s;
	}
	//设置活动截止时间
	public void setStopTime() {
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
	public void setBeginTime() {
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
