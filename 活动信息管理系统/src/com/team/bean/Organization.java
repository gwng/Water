package com.team.bean;
import java.util.Scanner;
//���ߣ��
//��֯��Ϣ��

public class Organization {
	private Scanner input = new Scanner(System.in);
	private String organizationName = null; 				//��֯��
	private String organizationProperty = null;				//��֯����
	private String teacherName = null;						//ָ����ʦ����
	private String principalName = null;					//����������
	
	public Organization() {
		setOrganizationName();
		setOrganizationProperty();
		setTeacherName();
		setPrincipalName();
	}
	
	public void setOrganizationName() {	    			//��ȡ��֯������֯��
		System.out.print("��������֯����");
		this.organizationName = input.nextLine();
			}
	
	public void setOrganizationProperty() {	    		//��ȡ��֯���ʼ���֯����
		System.out.print("��������֯���ʣ�");
		this.organizationProperty = input.nextLine();
			}
	public void setTeacherName() {	    					//��ȡָ����ʦ������ָ����ʦ����
		System.out.print("������ָ����ʦ������");
		this.teacherName = input.nextLine();
			}
	public void setPrincipalName() {	    				//��ȡ���������������渺��������
		System.out.print("�����븺����������");
		this.principalName = input.nextLine();
			}
	
	public String getOrganizationName() {
		return organizationName;
	}
	
	public String getOrganizationProperty() {
		return organizationProperty;
	}
	
	public String getTeacherName() {
		return teacherName;
	}
	
	public String getPrincipalName() {
		return principalName;
	}
}


