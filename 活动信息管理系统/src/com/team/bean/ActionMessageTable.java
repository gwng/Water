package com.team.bean;
//���Ϣ��
import java.util.Scanner;


public class ActionMessageTable {
	Scanner sc=new Scanner(System.in);
	//״̬ö��
	private static enum status{
		not_push,in,out_of_date,undefined
	};
	//���
	private static String actionName=null;
	//�����
	private static String actionTxt=null;
	//�����
	private static String actionClass=null;
	//����ʱ��
	private static Time pushTime=new Time();
	//�״̬
	private static status actionStatus=status.undefined;
	//�������֯
	private static String actionOrganization=null;
	//���ֹʱ��
	private static Time stopTime=new Time();
	//�����ʱ��
	private static Time beginTime=new Time();
	
	//��ȡ���
	public String getActionName() {
		return actionName;
	}
	//��ȡ�����
	public String getActionTxt() {
		return actionTxt;
	}
	//��ȡ�����
	public String getActionClass() {
		return actionClass;
	}
	//��ȡ�����ʱ��
	public String getPushTime() {
		return pushTime.getTime();
	}
	//��ȡ�״̬
	public status getActionStatus() {
		return actionStatus;
	}
	//��ȡ�������֯
	public String getActionOrganization() {
		return actionOrganization;
	}
	//��ȡ���ֹʱ��
	public String getStopTime() {
		return stopTime.getTime();
	}
	//��ȡ�����ʱ��
	public String getBeginTime() {
		return beginTime.getTime();
	}
	
	
	//���û��
	public void setActionName() {
		String s=sc.next();
		actionName=s;
	}
	//���û����
	public void setActionTxt() {
		String s=sc.next();
		actionTxt=s;
	}
	//���û����
	public void setActionClass() {
		String s=sc.next();
		actionClass=s;
	}
	//���û����ʱ��
	public void setPushTime() {
		String s1,s2,s3,s4,s5,s6;
		s1=sc.next();
		s2=sc.next();
		s3=sc.next();
		s4=sc.next();
		s5=sc.next();
		s6=sc.next();
		pushTime.setTime(s1, s2, s3, s4, s5, s6);
	}
	//���û״̬
	public void setActionStatus() {
		String s=sc.next();
		actionStatus=(status)s;
	}
	//���û������֯
	public void setActionOrganization() {
		String s=sc.next();
		actionOrganization=s;
	}
	//���û��ֹʱ��
	public void setStopTime() {
		String s1,s2,s3,s4,s5,s6;
		s1=sc.next();
		s2=sc.next();
		s3=sc.next();
		s4=sc.next();
		s5=sc.next();
		s6=sc.next();
		stopTime.setTime(s1, s2, s3, s4, s5, s6);
	}
	//���û����ʱ��
	public void setBeginTime() {
		String s1,s2,s3,s4,s5,s6;
		s1=sc.next();
		s2=sc.next();
		s3=sc.next();
		s4=sc.next();
		s5=sc.next();
		s6=sc.next();
		beginTime.setTime(s1, s2, s3, s4, s5, s6);
	}
	
}
