package com.team.bean;

import java.util.Scanner;


//���ߣ�������
//��������Ϣ��    

public class ManagerMessageTable {
	Scanner input=new Scanner(System.in);
	
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
		int a=input.nextInt();
		id=a;
	}
	//������������
	public void setManagerName() {
		//�����ַ�������
		String name=input.next();
		managerName=name;
	}
	//�����Ա𷽷�
	public void setManagerSex() {
		int choose = 0;				
		System.out.print("�����������ȷ�������Ա� ��1.����  2.Ů�ԣ� ��");
		choose = input.nextInt();
		if (choose == 1)
			managerSex = sex.boy;
		else if (choose == 2)
			managerSex = sex.girl;
		else {
			System.out.println("��������밴��ʾ�ٴ����룺");
			setManagerSex();}
	}
	//����ѧ��
	public void setManasgerNo() {
		int a=input.nextInt();
		managerNo=a;
	}
	//����Ժϵ
	public void setCollege() {
		String s=input.next();
		college=s;
	}
	//���ð༶רҵ
	public void setClassName() {
		String s=input.next();
		className=s;
	}
	//���õ绰
	public void setMobilePhone() {
		int a=input.nextInt();
		mobilePhone=a;
	}
	//������֯��
	public void setOrganizationName() {
		String s=input.next();
		organizationName=s;
	}
	//����ְҵ
	public void setPosition() {
		String s=input.next();
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
