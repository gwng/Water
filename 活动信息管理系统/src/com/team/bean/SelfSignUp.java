package com.team.bean;
import java.util.Scanner;
//���˱�����

public class SelfSignUp {
	Scanner input = new Scanner(System.in);
	private static String SignUp_name = null;   		//�û�����
	private static enum sex {					//�û��Ա�
		boy,girl, undefined };					//undefined��ʾδ�����Ա� 
	
	private static sex  SignUp_userSex = sex.undefined ;
	private static String SignUp_studentNo = null;  			//�û�ѧ��
	private static String SignUp_college = null;		//�û�����ѧԺ
	private static String SignUp_className = null;		//�û�����רҵ�༶	
	private static String SignUp_mobilePhone = null;	//�û��ֻ�����	
	private static String SignUp_weChat = null;		
	
	private SelfSignUp() {                   	//���캯����������
		SignUp_setName();
		SignUp_setSex();
		SignUp_setStudentNo();
		SignUp_setCollege();
		SignUp_setClassName();
		SignUp_setMobilePhone();
		SignUp_setWeChat();
	}
	
	void SignUp_setName() {	    					//��ȡ�û������������û�����
		System.out.print("�������������֣�");
		this.SignUp_name = input.nextLine();
			}
	void SignUp_setSex() {	    						//��ȡ�û��Ա𼰴����û��Ա�
		int choose = 0;				
		System.out.print("�����������ȷ�������Ա� ��1.����  2.Ů�ԣ� ��");
		choose = input.nextInt();
		if (choose == 1)
			SignUp_userSex = sex.boy;
		else if (choose == 2)
			SignUp_userSex = sex.girl;
		else {
			System.out.println("��������밴��ʾ�ٴ����룺");
			SignUp_setSex();
		}
	}
	
	void SignUp_setStudentNo() {						//��ȡ�û�ѧ�ż������û�ѧ��
		System.out.print("����������ѧ�ţ�");
		this.SignUp_studentNo = input.next();	
	}
	
	void SignUp_setCollege() {							//��ȡ�û�����ѧԺ�������û�����ѧԺ
		System.out.print("������������ѧԺ��");
		this.SignUp_college = input.nextLine();	
	}
	
	void SignUp_setClassName() {
		System.out.print("����������רҵ�༶��");	//��ȡ�û�����רҵ�༶�������û�����רҵ�༶
		this.SignUp_className = input.nextLine();	
	}
	
	
	void SignUp_setMobilePhone() {
		System.out.print("�����������ֻ����룺");	//��ȡ�û��ֻ����뼰�����û��ֻ�����
		this.SignUp_mobilePhone = input.nextLine();	
	}
	
	void SignUp_setWeChat() {
		System.out.print("����������΢�źţ�");	//��ȡ�û�΢�źż������û�΢�ź�
		this.SignUp_weChat = input.nextLine();	
	}
   
	String SignUp_getName() {	    					
		return SignUp_name;
	}
	
	sex SignUp_getSex() {	  
		
		return SignUp_userSex;
	}
	
	String SignUp_getStudentNo() {
		return SignUp_studentNo;
	}
	
	String SignUp_getCollege() {
		return SignUp_college;
	}
	
	String SignUp_getClassName() {
		return SignUp_className;
	}
	

	
	String SignUp_getMobilePhone() {
		return SignUp_mobilePhone;
	}
	
	String SignUp_getWeChat() {
		return SignUp_weChat;
	}
	
}
