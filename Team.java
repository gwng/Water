package usePlay;

import java.util.Scanner;
//���屨����

public class Team {
	//���
	public static int teamId=0;
	//�ӳ�����
	public static String teamerName=null;
	//�ӳ���ϵ��ʽ
	public static int teamTel=0;
	//��������
	public static String teamName=null;
	//��������
	public static int teamNum=0;
	//�ӳ�ѧ��
	public static int teamNo=0;
	//��Ա����
	public static String teamText=null;
	
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
