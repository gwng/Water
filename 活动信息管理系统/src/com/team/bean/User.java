package com.team.bean;
import java.util.Scanner;
//作者：李健
// 账号信息表

public class User {					//User类用于储存、传递、检验用户输入的数据
	private static String userName = null,userPassword = null;
	private static String checkPassword = null,checkPassword_1 = null;	
	/*创建临时变量checkPassword储存第一次输入的密码，checkPassword_1储存确认密码 
           当两次输入相同时 才将值传递给变量userPassword */
	Scanner input=new Scanner(System.in);
	
	public User() {                   //构造函数接收用户账号和密码
		System.out.println("注册信息录入");
		System.out.print("请输入账号：");
		this.userName = input.nextLine();
		setUserPassword();
	}
	
	public void setUserPassword() {	//设置密码
		System.out.print("请输入用户密码：");	
		checkPassword = input.nextLine();
		System.out.print("请再次输入用户密码完成密码确认：");
		checkPassword_1 = input.nextLine();
		if (checkPassword.equals(checkPassword_1)) {
			this.userPassword = checkPassword;
			System.out.print("密码核对成功 注册完成！");
		}
		else {
			System.out.println("两次密码不同 请重新输入");
			setUserPassword();     
			}
	}
	
	public String getUserName() {	//获取用户名
		return this.userName;
	}
	
	public String getUserPassword() {    //获取用户密码
		return this.userPassword;
	}
	
}