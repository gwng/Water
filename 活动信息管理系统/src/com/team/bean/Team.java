package com.team.bean;

import java.util.Scanner;
//���屨����

public class Team {
	//���
	private static int teamId=0;
	//�ӳ�����
	private static String teamerName=null;
	//�ӳ���ϵ��ʽ
	private static String teamTel=null;
	//��������
	private static String teamName=null;
	//��������
	private static int teamNum;
	//�ӳ�ѧ��
	private static String teamNo=null;
	//��Ա����
	private static String teamText=null;
	
	Scanner sc=new Scanner(System.in);
	
	//�������
	public void setTeamId() {
		int i=sc.nextInt();
		teamId=i;
	}
	//���öӳ���ϵ��ʽ
	public void setTeamTel() {
		String i=sc.nextLine();
		teamTel=i;
	}
	//���ö�������
	public void setTeamNum() {
		int i=sc.nextInt();
		teamNum=i;
	}
	//���öӳ�ѧ��
	public void setTeamNo() {
		String i=sc.nextLine();
		teamNo=i;
	}
	//���ö�������
	public void setTeamName() {
		String s=sc.next();
		teamName=s;
	}
	//���öӳ�����
	public void setTeamerName() {
		String s=sc.next();
		teamerName=s;
	}
	//���ö�Ա����
	public void setTeamText() {
		String s=sc.next();
		teamText=s;
	}
	
	//��ȡ��������
	public String getTeamName() {
		return teamName;
	}
	//��ȡ�ӳ�����
	public String getTeamerName() {
		return teamerName;
	}
	//��ȡ��Ա����
	public String getTeamText() {
		return teamText;
	}
	//��ȡ���
	public int getTeamId() {
		return teamId;
	}
	//��ȡ�ӳ���ϵ��ʽ
	public String getTeamTel() {
		return teamTel;
	}
	//��ȡ�ӳ�ѧ��
	public String getTeamNo() {
		return teamNo;
	}
	public int getTeamNum() {
		return teamNum;
	}
	
}
