package com.team.bean;
//���Ϣ��
import java.util.Scanner;
//����ʱ����
class Time{
	//����������ʱ����
	private String year;
	private String month;
	private String day;
	private String dhour;
	private String dminter;
	private String second;
	//��ʼ��
	Time(){
		year="0000";
		month="00";
		day="00";
		dhour="00";
		dminter="00";
		second="00";
	}
	//����ʱ�䷽��
	public void setTime(String year,String month,String day,String dhour,String dminter,String dsecond) {
		this.year=year;
		this.month=month;
		this.day=day;
		this.dhour=dhour;
		this.dminter=dminter;
		this.second=dsecond;
		
	}
	//��ȡʱ�䷽��
	public String getTime() {
		String str;
		str=year+"-"+month+"-"+day+"-"+dhour+"-"+dminter+"-"+second;
		return str;
	}
}


public class Active {
	Scanner input=new Scanner(System.in);
	//״̬ö��
	private static enum status{
		Going,Stop,Cancel,undefined
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
	private String getActionName() {
		return actionName;
	}
	//��ȡ�����
	private String getActionTxt() {
		return actionTxt;
	}
	//��ȡ�����
	private String getActionClass() {
		return actionClass;
	}
	//��ȡ�����ʱ��
	private String getPushTime() {
		return pushTime.getTime();
	}
	//��ȡ�״̬
	private status getActionStatus() {
		return actionStatus;
	}
	//��ȡ�������֯
	private String getActionOrganization() {
		return actionOrganization;
	}
	//��ȡ���ֹʱ��
	private String getStopTime() {
		return stopTime.getTime();
	}
	//��ȡ�����ʱ��
	private String getBeginTime() {
		return beginTime.getTime();
	}
	
	
	//���û��
	private void setActionName() {
		String s=input.next();
		actionName=s;
	}
	//���û����
	private void setActionTxt() {
		String s=input.next();
		actionTxt=s;
	}
	//���û����
	private void setActionClass() {
		String s=input.next();
		actionClass=s;
	}
	//���û����ʱ��
	private void setPushTime() {
		String s1,s2,s3,s4,s5,s6;
		s1=input.next();
		s2=input.next();
		s3=input.next();
		s4=input.next();
		s5=input.next();
		s6=input.next();
		pushTime.setTime(s1, s2, s3, s4, s5, s6);
	}
	//���û״̬

	//���û������֯
	private void setActionOrganization() {
		String s=input.next();
		actionOrganization=s;
	}
	//���û��ֹʱ��
	private void setStopTime() {
		String s1,s2,s3,s4,s5,s6;
		s1=input.next();
		s2=input.next();
		s3=input.next();
		s4=input.next();
		s5=input.next();
		s6=input.next();
		stopTime.setTime(s1, s2, s3, s4, s5, s6);
	}
	//���û����ʱ��
	private void setBeginTime() {
		String s1,s2,s3,s4,s5,s6;
		s1=input.next();
		s2=input.next();
		s3=input.next();
		s4=input.next();
		s5=input.next();
		s6=input.next();
		beginTime.setTime(s1, s2, s3, s4, s5, s6);
	}
	
}
