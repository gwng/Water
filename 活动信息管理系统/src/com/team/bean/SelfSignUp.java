package com.team.bean;
import java.util.Scanner;
//作者：李健
//个人报名表

public class SelfSignUp {
	Scanner input = new Scanner(System.in);
	private static String SignUp_name = null;   		//用户姓名
	private static enum sex {					//用户性别
		boy,girl, undefined };					//undefined表示未输入性别 
	
	private static sex  SignUp_userSex = sex.undefined ;
	private static String SignUp_studentNo = null;  			//用户学号
	private static String SignUp_college = null;		//用户所在学院
	private static String SignUp_className = null;		//用户所在专业班级	
	private static String SignUp_mobilePhone = null;	//用户手机号码	
	private static String SignUp_weChat = null;		
	
	public SelfSignUp() {                   	//构造函数接收数据
		SignUp_setName();
		SignUp_setSex();
		SignUp_setStudentNo();
		SignUp_setCollege();
		SignUp_setClassName();
		SignUp_setMobilePhone();
		SignUp_setWeChat();
	}
	
	public void SignUp_setName() {	    					//获取用户姓名及储存用户姓名
		System.out.print("请输入您的名字：");
		this.SignUp_name = input.nextLine();
			}
	public void SignUp_setSex() {	    						//获取用户性别及储存用户性别
		int choose = 0;				
		System.out.print("请输入序号以确定您的性别 （1.男性  2.女性） ：");
		choose = input.nextInt();
		if (choose == 1)
			SignUp_userSex = sex.boy;
		else if (choose == 2)
			SignUp_userSex = sex.girl;
		else {
			System.out.println("输入错误！请按提示再次输入：");
			SignUp_setSex();
		}
	}
	
	public void SignUp_setStudentNo() {						//获取用户学号及储存用户学号
		System.out.print("请输入您的学号：");
		this.SignUp_studentNo = input.next();	
	}
	
	public void SignUp_setCollege() {							//获取用户所在学院及储存用户所在学院
		System.out.print("请输入您所处学院：");
		this.SignUp_college = input.nextLine();	
	}
	
	public void SignUp_setClassName() {
		System.out.print("请输入您的专业班级：");	//获取用户所在专业班级及储存用户所在专业班级
		this.SignUp_className = input.nextLine();	
	}
	
	
	public void SignUp_setMobilePhone() {
		System.out.print("请输入您的手机号码：");	//获取用户手机号码及储存用户手机号码
		this.SignUp_mobilePhone = input.nextLine();	
	}
	
	public void SignUp_setWeChat() {
		System.out.print("请输入您的微信号：");	//获取用户微信号及储存用户微信号
		this.SignUp_weChat = input.nextLine();	
	}
   
	public String SignUp_getName() {	    					
		return SignUp_name;
	}
	
	public sex SignUp_getSex() {	  
		
		return SignUp_userSex;
	}
	
	public String SignUp_getStudentNo() {
		return SignUp_studentNo;
	}
	
	public String SignUp_getCollege() {
		return SignUp_college;
	}
	
	public String SignUp_getClassName() {
		return SignUp_className;
	}
		
	public String SignUp_getMobilePhone() {
		return SignUp_mobilePhone;
	}
	
	public String SignUp_getWeChat() {
		return SignUp_weChat;
	}
	
}
