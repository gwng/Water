package com.team.bean;

import java.util.Scanner;
//���屨����

public class TeamApplyTable {
	//���
	private static int teamId=0;
	//�ӳ�����
	private static String teamerName=null;
	//�ӳ���ϵ��ʽ
	private static int teamTel=0;
	//��������
	private static String teamName=null;
	//��������
	private static int teamNum=0;
	//�ӳ�ѧ��
	private static int teamNo=0;
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
		int i=sc.nextInt();
		teamTel=i;
	}
	//���ö�������
	public void setTeamNum() {
		int i=sc.nextInt();
		teamNum=i;
	}
	//���öӳ�ѧ��
	public void setTeamNo() {
		int i=sc.nextInt();
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
	public int getTeamTel() {
		return teamTel;
	}
	//��ȡ�ӳ�ѧ��
	public int getTeamNo() {
		return teamNo;
	}
	public int getTeamNum() {
		return teamNum;
	}
	
}
