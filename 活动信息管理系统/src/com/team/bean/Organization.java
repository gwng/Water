package com.team.bean;
import java.util.Scanner;
//��֯��Ϣ��

public class Organization {
	private Scanner input = new Scanner(System.in);
	private String organizationName = null; 				//��֯��
	private String organizationProperty = null;				//��֯����
	private String teacherName = null;						//ָ����ʦ����
	private String principalName = null;					//����������
	
	private Organization() {
		setOrganizationName();
		setOrganizationProperty();
		setTeacherName();
		setPrincipalName();
	}
	
	void setOrganizationName() {	    			//��ȡ��֯������֯��
		System.out.print("��������֯����");
		this.organizationName = input.nextLine();
			}
	
	void setOrganizationProperty() {	    		//��ȡ��֯���ʼ���֯����
		System.out.print("��������֯���ʣ�");
		this.organizationProperty = input.nextLine();
			}
	void setTeacherName() {	    					//��ȡָ����ʦ������ָ����ʦ����
		System.out.print("������ָ����ʦ������");
		this.teacherName = input.nextLine();
			}
	void setPrincipalName() {	    				//��ȡ���������������渺��������
		System.out.print("�����븺����������");
		this.principalName = input.nextLine();
			}
	
	String getOrganizationName() {
		return organizationName;
	}
	
	String getOrganizationProperty() {
		return organizationProperty;
	}
	
	String getTeacherName() {
		return teacherName;
	}
	
	String getPrincipalName() {
		return principalName;
	}
}


