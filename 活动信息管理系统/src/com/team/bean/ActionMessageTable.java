package com.team.bean;
//���ߣ�������
//���Ϣ��  
import java.util.Scanner;




public class ActionMessageTable {
	Scanner input=new Scanner(System.in);
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
		String s=input.next();
		actionName=s;
	}
	//���û����
	public void setActionTxt() {
		String s=input.next();
		actionTxt=s;
	}
	//���û����
	public void setActionClass() {
		String s=input.next();
		actionClass=s;
	}
	//���û����ʱ��
	public void setPushTime() {
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
	public void setActionStatus() {
		int choose = 0;				
		System.out.print("�����������ѡ��״̬ ��1.��δ��ʼ  2.������ 3.������� ��");
		choose = input.nextInt();
		if (choose == 1)
			actionStatus = status.not_push;
		else if (choose == 2)
			actionStatus = status.in;
		else if (choose == 3)
			actionStatus = status.out_of_date;
		else {
			System.out.println("��������밴��ʾ�ٴ����룺");
			setActionStatus();}
	}
	//���û������֯
	public void setActionOrganization() {
		String s=input.next();
		actionOrganization=s;
	}
	//���û��ֹʱ��
	public void setStopTime() {
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
	public void setBeginTime() {
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
