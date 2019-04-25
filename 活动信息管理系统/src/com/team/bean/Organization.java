package com.team.bean;
import java.util.Scanner;
//作者：李健
//组织信息表

public class Organization {
	private Scanner input = new Scanner(System.in);
	private String organizationName = null; 				//组织名
	private String organizationProperty = null;				//组织性质
	private String teacherName = null;						//指导老师姓名
	private String principalName = null;					//负责人姓名
	
	public Organization() {
		setOrganizationName();
		setOrganizationProperty();
		setTeacherName();
		setPrincipalName();
	}
	
	public void setOrganizationName() {	    			//获取组织名及组织名
		System.out.print("请输入组织名：");
		this.organizationName = input.nextLine();
			}
	
	public void setOrganizationProperty() {	    		//获取组织性质及组织性质
		System.out.print("请输入组织性质：");
		this.organizationProperty = input.nextLine();
			}
	public void setTeacherName() {	    					//获取指导老师姓名及指导老师姓名
		System.out.print("请输入指导老师姓名：");
		this.teacherName = input.nextLine();
			}
	public void setPrincipalName() {	    				//获取负责人姓名及储存负责人姓名
		System.out.print("请输入负责人姓名：");
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


