package com.team.bean;
import java.util.Scanner;
// �˺���Ϣ��

public class User {					//User�����ڴ��桢���ݡ������û����������
	private static String userName = null,userPassword = null;
	private static String checkPassword = null,checkPassword_1 = null;	
	/*������ʱ����checkPassword�����һ����������룬checkPassword_1����ȷ������ 
           ������������ͬʱ �Ž�ֵ���ݸ�����userPassword */
	Scanner input=new Scanner(System.in);
	
	public User() {                   //���캯�������û��˺ź�����
		System.out.println("ע����Ϣ¼��");
		System.out.print("�������˺ţ�");
		this.userName = input.nextLine();
		setUserPassword();
	}
	
	public void setUserPassword() {	//��������
		System.out.print("�������û����룺");	
		checkPassword = input.nextLine();
		System.out.print("���ٴ������û������������ȷ�ϣ�");
		checkPassword_1 = input.nextLine();
		if (checkPassword.equals(checkPassword_1)) {
			this.userPassword = checkPassword;
			System.out.print("����˶Գɹ� ע����ɣ�");
		}
		else {
			System.out.println("�������벻ͬ ����������");
			setUserPassword();     
			}
	}
	
	public String getUserName() {	//��ȡ�û���
		return this.userName;
	}
	
	public String getUserPassword() {    //��ȡ�û�����
		return this.userPassword;
	}
	
}