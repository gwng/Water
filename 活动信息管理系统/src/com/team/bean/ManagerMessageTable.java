package com.team.bean;

import java.util.Scanner;

//��������Ϣ��

public class ManagerMessageTable {
	Scanner sc=new Scanner(System.in);
	
	//�Ա�
	private static enum sex{
		boy,girl,undefined
	};
	//�������Ա�
	private static sex managerSex=sex.undefined;
	//��������š�ѧ�š��绰����
	private static int id=0, managerNo=0 ,mobilePhone=0;
	//����������
	private static String managerName=null;
	//������Ժϵ
	private static String college=null;
	//�����߰༶רҵ
	private static String className=null;
	//��������֯��
	private static String organizationName=null;
	//������ְλ
	private static String position =null;
	//����Id����
	public void setId() {
		//���������id
		int a=sc.nextInt();
		id=a;
	}
	//������������
	public void setManagerName() {
		//�����ַ�������
		String name=sc.next();
		managerName=name;
	}
	//�����Ա𷽷�
	public void setManagerSex() {
		sex s=(sex)sc.next();
		managerSex=s;
	}
	//����ѧ��
	public void setManasgerNo() {
		int a=sc.nextInt();
		managerNo=a;
	}
	//����Ժϵ
	public void setCollege() {
		String s=sc.next();
		college=s;
	}
	//���ð༶רҵ
	public void setClassName() {
		String s=sc.next();
		className=s;
	}
	//���õ绰
	public void setMobilePhone() {
		int a=sc.nextInt();
		mobilePhone=a;
	}
	//������֯��
	public void setOrganizationName() {
		String s=sc.next();
		organizationName=s;
	}
	//����ְҵ
	public void setPosition() {
		String s=sc.next();
		position=s;
	}
	
	
	//��ȡid
	public int getId() {
		return id;
	}
	//��ȡѧ��
	public int getManagerNo() {
		return managerNo;
	}
	//��ȡ�绰
	public int getMobilePhone() {
		return mobilePhone;
	}
	//��ȡ����
	public String getManagerName() {
		return managerName;
	}
	//��ȡԺϵ
	public String getCollege() {
		return college;
	}
	//��ȡ�༶רҵ
	public String getClassName() {
		return className;
	}
	//��ȡ��֯��
	public String getOrganizationName() {
		return organizationName;
	}
	//��ȡְλ
	public String getPosition() {
		return position;
	}
	//��ȡ�Ա�
	public sex getSex() {
		return managerSex;
	}
}
