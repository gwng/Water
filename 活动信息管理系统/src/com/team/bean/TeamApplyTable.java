package com.team.bean;

import java.util.Scanner;
//团体报名表

public class TeamApplyTable {
	//序号
	private static int teamId=0;
	//队长姓名
	private static String teamerName=null;
	//队长联系方式
	private static int teamTel=0;
	//队伍名称
	private static String teamName=null;
	//队伍人数
	private static int teamNum=0;
	//队长学号
	private static int teamNo=0;
	//队员名字
	private static String teamText=null;
	
	Scanner sc=new Scanner(System.in);
	
	//设置序号
	public void setTeamId() {
		int i=sc.nextInt();
		teamId=i;
	}
	//设置队长联系方式
	public void setTeamTel() {
		int i=sc.nextInt();
		teamTel=i;
	}
	//设置队伍人数
	public void setTeamNum() {
		int i=sc.nextInt();
		teamNum=i;
	}
	//设置队长学号
	public void setTeamNo() {
		int i=sc.nextInt();
		teamNo=i;
	}
	//设置队伍名称
	public void setTeamName() {
		String s=sc.next();
		teamName=s;
	}
	//设置队长名字
	public void setTeamerName() {
		String s=sc.next();
		teamerName=s;
	}
	//设置队员姓名
	public void setTeamText() {
		String s=sc.next();
		teamText=s;
	}
	
	//获取队伍名称
	public String getTeamName() {
		return teamName;
	}
	//获取队长姓名
	public String getTeamerName() {
		return teamerName;
	}
	//获取队员姓名
	public String getTeamText() {
		return teamText;
	}
	//获取序号
	public int getTeamId() {
		return teamId;
	}
	//获取队长联系方式
	public int getTeamTel() {
		return teamTel;
	}
	//获取队长学号
	public int getTeamNo() {
		return teamNo;
	}
	public int getTeamNum() {
		return teamNum;
	}
	
}
