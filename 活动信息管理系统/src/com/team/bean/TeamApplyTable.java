package com.team.bean;

import java.util.Scanner;
//���ߣ�������
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
	
	Scanner input=new Scanner(System.in);
	
	//�������
	public void setTeamId() {
		int i=input.nextInt();
		teamId=i;
	}
	//���öӳ���ϵ��ʽ
	public void setTeamTel() {
		int i=input.nextInt();
		teamTel=i;
	}
	//���ö�������
	public void setTeamNum() {
		int i=input.nextInt();
		teamNum=i;
	}
	//���öӳ�ѧ��
	public void setTeamNo() {
		int i=input.nextInt();
		teamNo=i;
	}
	//���ö�������
	public void setTeamName() {
		String s=input.next();
		teamName=s;
	}
	//���öӳ�����
	public void setTeamerName() {
		String s=input.next();
		teamerName=s;
	}
	//���ö�Ա����
	public void setTeamText() {
		String s=input.next();
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
