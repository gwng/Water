package usePlay;
//���Ϣ��
import java.util.Scanner;
//����ʱ����
class Time{
	//����������ʱ����
	private String year;
	private String month;
	private String day;
	private String dhour;
	private String dminter;
	private String second;
	//��ʼ��
	Time(){
		year="0000";
		month="00";
		day="00";
		dhour="00";
		dminter="00";
		second="00";
	}
	//����ʱ�䷽��
	public void setTime(String year,String month,String day,String dhour,String dminter,String dsecond) {
		this.year=year;
		this.month=month;
		this.day=day;
		this.dhour=dhour;
		this.dminter=dminter;
		this.second=dsecond;
		
	}
	//��ȡʱ�䷽��
	public String getTime() {
		String str;
		str=year+"-"+month+"-"+day+"-"+dhour+"-"+dminter+"-"+second;
		return str;
	}
}


public class Active {
	Scanner sc=new Scanner(System.in);
	//״̬ö��
	public static enum status{
		Going,Stop,Cancel,undefined
	};
	//���
	public static String actionName=null;
	//�����
	public static String actionTxt=null;
	//�����
	public static String actionClass=null;
	//����ʱ��
	public static Time pushTime=new Time();
	//�״̬
	public static status actionStatus=status.undefined;
	//�������֯
	public static String actionOrganization=null;
	//���ֹʱ��
	public static Time stopTime=new Time();
	//�����ʱ��
	public static Time beginTime=new Time();
	
	//��ȡ���
	public String getActionName() {
		return actionName;
	}
	//��ȡ�����
	public String getActionTxt() {
		return actionTxt;
	}
	//��ȡ�����
	public String getActionClass() {
		return actionClass;
	}
	//��ȡ�����ʱ��
	public String getPushTime() {
		return pushTime.getTime();
	}
	//��ȡ�״̬
	public status getActionStatus() {
		return actionStatus;
	}
	//��ȡ�������֯
	public String getActionOrganization() {
		return actionOrganization;
	}
	//��ȡ���ֹʱ��
	public String getStopTime() {
		return stopTime.getTime();
	}
	//��ȡ�����ʱ��
	public String getBeginTime() {
		return beginTime.getTime();
	}
	
	
	//���û��
	public void setActionName() {
		String s=sc.next();
		actionName=s;
	}
	//���û����
	public void setActionTxt() {
		String s=sc.next();
		actionTxt=s;
	}
	//���û����
	public void setActionClass() {
		String s=sc.next();
		actionClass=s;
	}
	//���û����ʱ��
	public void setPushTime() {
		String s1,s2,s3,s4,s5,s6;
		s1=sc.next();
		s2=sc.next();
		s3=sc.next();
		s4=sc.next();
		s5=sc.next();
		s6=sc.next();
		pushTime.setTime(s1, s2, s3, s4, s5, s6);
	}
	//���û״̬
	public void setActionClass() {
		String s=sc.next();
		actionClass=s;
	}
	//���û������֯
	public void setActionOrganization() {
		String s=sc.next();
		actionOrganization=s;
	}
	//���û��ֹʱ��
	public void setStopTime() {
		String s1,s2,s3,s4,s5,s6;
		s1=sc.next();
		s2=sc.next();
		s3=sc.next();
		s4=sc.next();
		s5=sc.next();
		s6=sc.next();
		stopTime.setTime(s1, s2, s3, s4, s5, s6);
	}
	//���û����ʱ��
	public void setBeginTime() {
		String s1,s2,s3,s4,s5,s6;
		s1=sc.next();
		s2=sc.next();
		s3=sc.next();
		s4=sc.next();
		s5=sc.next();
		s6=sc.next();
		beginTime.setTime(s1, s2, s3, s4, s5, s6);
	}
	
}
