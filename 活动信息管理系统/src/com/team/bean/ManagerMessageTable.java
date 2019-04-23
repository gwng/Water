package com.team.bean;

import java.util.Scanner;

//管理者信息表

public class ManagerMessageTable {
	Scanner sc=new Scanner(System.in);
	
	//性别
	private static enum sex{
		boy,girl,undefined
	};
	//管理者性别
	private static sex managerSex=sex.undefined;
	//管理者序号、学号、电话号码
	private static int id=0, managerNo=0 ,mobilePhone=0;
	//管理者名字
	private static String managerName=null;
	//管理者院系
	private static String college=null;
	//管理者班级专业
	private static String className=null;
	//管理者组织名
	private static String organizationName=null;
	//管理者职位
	private static String position =null;
	//设置Id方法
	public void setId() {
		//输入管理者id
		int a=sc.nextInt();
		id=a;
	}
	//设置姓名方法
	public void setManagerName() {
		//输入字符串内容
		String name=sc.next();
		managerName=name;
	}
	//设置性别方法
	public void setManagerSex() {
		sex s=(sex)sc.next();
		managerSex=s;
	}
	//设置学号
	public void setManasgerNo() {
		int a=sc.nextInt();
		managerNo=a;
	}
	//设置院系
	public void setCollege() {
		String s=sc.next();
		college=s;
	}
	//设置班级专业
	public void setClassName() {
		String s=sc.next();
		className=s;
	}
	//设置电话
	public void setMobilePhone() {
		int a=sc.nextInt();
		mobilePhone=a;
	}
	//设置组织名
	public void setOrganizationName() {
		String s=sc.next();
		organizationName=s;
	}
	//设置职业
	public void setPosition() {
		String s=sc.next();
		position=s;
	}
	
	
	//获取id
	public int getId() {
		return id;
	}
	//获取学号
	public int getManagerNo() {
		return managerNo;
	}
	//获取电话
	public int getMobilePhone() {
		return mobilePhone;
	}
	//获取姓名
	public String getManagerName() {
		return managerName;
	}
	//获取院系
	public String getCollege() {
		return college;
	}
	//获取班级专业
	public String getClassName() {
		return className;
	}
	//获取组织名
	public String getOrganizationName() {
		return organizationName;
	}
	//获取职位
	public String getPosition() {
		return position;
	}
	//获取性别
	public sex getSex() {
		return managerSex;
	}
}
