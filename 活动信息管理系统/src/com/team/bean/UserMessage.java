package com.team.bean;
import java.util.Scanner;
//�û���Ϣ��
//��ȡ�û��������û�
public class UserMessage {
	Scanner input = new Scanner(System.in);
	private static String name = null;   		//�û�����
	private static enum sex {					//�û��Ա�
		boy,girl, undefined };					//undefined��ʾδ�����Ա� 
	
	private static sex  userSex = sex.undefined ;
	private static String studentNo = null;  			//�û�ѧ��
	private static String college = null;		//�û�����ѧԺ
	private static String className = null;		//�û�����רҵ�༶
	private static String mobilePhone = null;	//�û��ֻ�����	
	private static String weChat = null;			//�û�΢�ź�
	
	public UserMessage() {                   	//���캯����������
		setName();
		setSex();
		setStudentNo();
		setCollege();
		setClassName();
		setMobilePhone();
		setWeChat();
	}
	
	public void setName() {	    					//��ȡ�û������������û�����
		System.out.print("�������������֣�");
		this.name = input.nextLine();
			}
	public void setSex() {	    						//��ȡ�û��Ա𼰴����û��Ա�
		int choose = 0;				
		System.out.print("�����������ȷ�������Ա� ��1.����  2.Ů�ԣ� ��");
		choose = input.nextInt();
		if (choose == 1)
			userSex = sex.boy;
		else if (choose == 2)
			userSex = sex.girl;
		else {
			System.out.println("��������밴��ʾ�ٴ����룺");
			setSex();
		}
	}
	
	public void setStudentNo() {						//��ȡ�û�ѧ�ż������û�ѧ��
		System.out.print("����������ѧ�ţ�");
		this.studentNo = input.nextLine();	
	}
	
	public void setCollege() {							//��ȡ�û�����ѧԺ�������û�����ѧԺ
		System.out.print("������������ѧԺ��");
		this.college = input.nextLine();	
	}
	
	public void setClassName() {
		System.out.print("����������רҵ�༶��");	//��ȡ�û�����רҵ�༶�������û�����רҵ�༶
		this.className = input.nextLine();	
	}
	
	
	public void setMobilePhone() {
		System.out.print("�����������ֻ����룺");	//��ȡ�û��ֻ����뼰�����û��ֻ�����
		this.mobilePhone = input.nextLine();	
	}
	
	public void setWeChat() {
		System.out.print("����������΢�źţ�");	//��ȡ�û�΢�źż������û�΢�ź�
		this.weChat = input.nextLine();	
	}
   
	public String getName() {	    					
		return name;
	}
	
	public sex getSex() {	  
		
		return userSex;
	}
	
	public String getStudentNo() {
		return studentNo;
	}
	
	public String getCollege() {
		return college;
	}
	
	public String getClassName() {
		return className;
	}
	
	
	public String getMobilePhone() {
		return mobilePhone;
	}
	
	public String getWeChat() {
		return weChat;
	}
	
}
