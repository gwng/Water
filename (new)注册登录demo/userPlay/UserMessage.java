package userPlay;
import java.util.Scanner;
//�û���Ϣ��
//��ȡ�û��������û�
public class UserMessage {
	Scanner input = new Scanner(System.in);
	public static String name = null;   		//�û�����
	public static enum sex {					//�û��Ա�
		boy,girl, undefined };					//undefined��ʾδ�����Ա� 
	
	public static sex  userSex = sex.undefined ;
	public static int studentNo = 0;  			//�û�ѧ��
	public static String college = null;		//�û�����ѧԺ
	public static String className = null;		//�û�����רҵ�༶
	//public static int mobilePhone = 0;			//�û��ֻ�����	
	public static String mobilePhone = null;	//�û��ֻ�����	
	public static String weChat = null;			//�û�΢�ź�
	
	public UserMessage() {                   	//���캯����������
		setName();
		setSex();
		setStudentNo();
		setCollege();
		setClassName();
		setMobilePhone();
		setWeChat();
	}
	
	void setName() {	    					//��ȡ�û������������û�����
		System.out.print("�������������֣�");
		this.name = input.nextLine();
			}
	void setSex() {	    						//��ȡ�û��Ա𼰴����û��Ա�
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
	
	void setStudentNo() {						//��ȡ�û�ѧ�ż������û�ѧ��
		System.out.print("����������ѧ�ţ�");
		this.studentNo = input.nextInt();	
	}
	
	void setCollege() {							//��ȡ�û�����ѧԺ�������û�����ѧԺ
		System.out.print("������������ѧԺ��");
		this.college = input.nextLine();	
	}
	
	void setClassName() {
		System.out.print("����������רҵ�༶��");	//��ȡ�û�����רҵ�༶�������û�����רҵ�༶
		this.className = input.nextLine();	
	}
	
	/*void setMobilePhone() {
		System.out.print("�����������ֻ����룺");	//��ȡ�û��ֻ����뼰�����û��ֻ�����
		this.mobilePhone = input.nextInt();	
	}*/
	
	void setMobilePhone() {
		System.out.print("�����������ֻ����룺");	//��ȡ�û��ֻ����뼰�����û��ֻ�����
		this.mobilePhone = input.nextLine();	
	}
	
	void setWeChat() {
		System.out.print("����������΢�źţ�");	//��ȡ�û�΢�źż������û�΢�ź�
		this.weChat = input.nextLine();	
	}
   
	String getName() {	    					
		return name;
	}
	
	sex getSex() {	  
		
		return userSex;
	}
	
	int getStudentNo() {
		return studentNo;
	}
	
	String getCollege() {
		return college;
	}
	
	String getClassName() {
		return className;
	}
	
	/*int getMobilePhone() {
		return mobilePhone;
	}*/
	
	String getMobilePhone() {
		return mobilePhone;
	}
	
	String getWeChat() {
		return weChat;
	}
	
}
