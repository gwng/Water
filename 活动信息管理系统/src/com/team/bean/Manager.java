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
	private Manager(){
		
	}
	//����Id����
	private void setId() {
		//���������id
		int a=sc.nextInt();
		id=a;
	}
	//������������
	private void setManagerName() {
		//�����ַ�������
		String name=sc.next();
		managerName=name;
	}
	//�����Ա𷽷�
	private void setManagerSex() {
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
	private void setManasgerNo() {
		String a=sc.next();
		managerNo=a;
	}
	//����Ժϵ
	private void setCollege() {
		String s=sc.next();
		college=s;
	}
	//���ð༶רҵ
	private void setClassName() {
		String s=sc.next();
		className=s;
	}
	//���õ绰
	private void setMobilePhone() {
		String a=sc.next();
		mobilePhone=a;
	}
	//������֯��
	private void setOrganizationName() {
		String s=sc.next();
		organizationName=s;
	}
	//����ְҵ
	private void setPosition() {
		String s=sc.next();
		position=s;
	}
	
	
	//��ȡid
	private int getId() {
		return id;
	}
	//��ȡѧ��
	private String getManagerNo() {
		return managerNo;
	}
	//��ȡ�绰
	private String getMobilePhone() {
		return mobilePhone;
	}
	//��ȡ����
	private String getManagerName() {
		return managerName;
	}
	//��ȡԺϵ
	private String getCollege() {
		return college;
	}
	//��ȡ�༶רҵ
	private String getClassName() {
		return className;
	}
	//��ȡ��֯��
	private String getOrganizationName() {
		return organizationName;
	}
	//��ȡְλ
	private String getPosition() {
		return position;
	}
	//��ȡ�Ա�
	private sex getSex() {
		return managerSex;
	}
}
