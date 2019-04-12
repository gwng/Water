package com.team.bean;

import java.util.Scanner;

//管理者信息表

public class Manager {
	Scanner sc=new Scanner(System.in);
	
	//性别
	private static enum sex{
		boy,girl,undefined
	};
	//管理者性别
	private static sex managerSex=sex.undefined;
	
	private static int id=0;//管理者序号
	private static	String	managerNo=null;//管理者学号
	private static	String mobilePhone=null;  //管理者电话号码
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
	public Manager(){
		
	}
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
		int choose = 0;				
		System.out.print("请输入序号以确定您的性别 （1.男性  2.女性） ：");
		choose = sc.nextInt();
		if (choose == 1)
			managerSex = sex.boy;
		else if (choose == 2)
			managerSex = sex.girl;
		else {
			System.out.println("输入错误！请按提示再次输入：");
			setManagerSex(); }
	}
	//设置学号
	public void setManasgerNo() {
		String a=sc.next();
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
		String a=sc.next();
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
	public String getManagerNo() {
		return managerNo;
	}
	//获取电话
	public String getMobilePhone() {
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
