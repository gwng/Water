package com.team.bean;

import java.util.Scanner;

//��������Ϣ��

public class Manager {
	Scanner sc=new Scanner(System.in);
	
	//�Ա�
	private static enum sex{
		boy,girl,undefined
	};
	//�������Ա�
	private static sex managerSex=sex.undefined;
	
	private static int id=0;//���������
	private static	String	managerNo=null;//������ѧ��
	private static	String mobilePhone=null;  //�����ߵ绰����
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
	public Manager(){
		
	}
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
		int choose = 0;				
		System.out.print("�����������ȷ�������Ա� ��1.����  2.Ů�ԣ� ��");
		choose = sc.nextInt();
		if (choose == 1)
			managerSex = sex.boy;
		else if (choose == 2)
			managerSex = sex.girl;
		else {
			System.out.println("��������밴��ʾ�ٴ����룺");
			setManagerSex(); }
	}
	//����ѧ��
	public void setManasgerNo() {
		String a=sc.next();
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
		String a=sc.next();
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
	public String getManagerNo() {
		return managerNo;
	}
	//��ȡ�绰
	public String getMobilePhone() {
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
