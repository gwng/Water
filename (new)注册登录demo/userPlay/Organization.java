package userPlay;
import java.util.Scanner;
//��֯��Ϣ��

public class Organization {
	Scanner input = new Scanner(System.in);
	String organizationName = null; 				//��֯��
	String organizationProperty = null;				//��֯����
	String teacherName = null;						//ָ����ʦ����
	String principalName = null;					//����������
	
	public Organization() {
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


