package com.team.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import com.team.bean.Organization;
//对应组织信息表即对应Organization
public class SqlOrganization {
		Scanner n = new Scanner(System.in);
		static String sql = null;//定义数据库语句
		static PreparedStatement pSta;//定义预编译语句
		static ResultSet res;  //返回结果集
		//创建组织信息表
		public void createOrganization(Organization organization) throws SQLException { 
			System.out.println("1.请输入组织名");
			organization.setOrganizationName();
			System.out.println("2.请输入组织性质");
			organization.setOrganizationProperty();
			System.out.println("3.请输入指导老师姓名");
			organization.setTeacherName();
			System.out.println("4.请输入负责人姓名");
			organization.setPrincipalName();
			sql = "insert into team_detail(organization,organi_character,tea_name,principal)values(?,?,?,?)";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1,organization.getOrganizationName());
			res.setObject(2,organization.getOrganizationProperty());
			res.setObject(3,organization.getTeacherName());
			res.setObject(4,organization.getPrincipalName());
			res.execute();
			System.out.println("提交表成功");
		}
		//修改组织名
			public void changeOrganizationName(Organization organization) throws SQLException {
				System.out.println("请输入想更改的组织名");
				organization.setOrganizationName();
				System.out.println("请输入想更改的id序号");
				String Id = n.next();
				sql = "update team_detail set organization = ?where id = ?";
				PreparedStatement res = connection.getconnection().prepareStatement(sql);
				res.setObject(1, organization.getOrganizationName());
				res.setObject(2,Id);//2 是修改id为2 的表字段
				res.execute();
				System.out.println("修改组织名成功");
			}
			//修改组织性质
			public void changeOrganizationProperty(Organization organization) throws SQLException {
				System.out.println("请输入想更改的组织性质");
				organization.setOrganizationProperty();
				System.out.println("请输入想更改的id序号");
				String Id = n.next();
				sql = "update team_detail set organi_character = ?where id = ?";
				PreparedStatement res = connection.getconnection().prepareStatement(sql);
				res.setObject(1,organization.getOrganizationProperty());
				//System.out.println(Id);
				res.setObject(2,Id);//2 是修改id为2 的表字段
				res.execute();
				System.out.println("修改组织性质成功");
			}
			//修改指导老师姓名
			public void changeTeacherName(Organization organization) throws SQLException {
				System.out.println("请输入想更改的通知活动时间");
				organization.setTeacherName();
				System.out.println("请输入想更改的id序号");
				String Id = n.next();
				sql = "update team_detail set tea_name = ?where id = ?";
				PreparedStatement res = connection.getconnection().prepareStatement(sql);
				res.setObject(1, organization.getTeacherName());
				//System.out.println(Id);
				res.setObject(2,Id);//2 是修改id为2 的表字段
				res.execute();
				System.out.println("修改指导老师姓名成功");
			}
			//修改负责人姓名
			public void changePrincipalName(Organization organization) throws SQLException {
				System.out.println("请输入想更改的负责人姓名");
				organization.setPrincipalName();
				System.out.println("请输入想更改的id序号");
				String Id = n.next();
				sql = "update team_detail set principal = ?where id = ?";
				PreparedStatement res = connection.getconnection().prepareStatement(sql);
				res.setObject(1,organization.getPrincipalName());
				//System.out.println(Id);
				res.setObject(2,Id);//2 是修改id为2 的表字段
				res.execute();
				System.out.println("修改负责人姓名成功");
			}
			//删除通知
			public void deleteOrganization() throws SQLException {
				System.out.println("请输入你要删除的账号信息的id");
				String Id = n.next();
				sql = "delete from team_detail where id = ?";
				pSta = connection.getconnection().prepareStatement(sql);
				pSta.setObject(1, Id);							//设置数据库操作语句对象顺序
				pSta.execute();
				System.out.println("账号信息已删除");
			}
		public static void main(String[] args) throws SQLException {
			SqlOrganization test = new SqlOrganization();
			Organization organization = new Organization();
		//	test.Organization(organization);
		//	test.changeOrganizationName(organization);
		//	test.changeOrganizationProperty(organization);
		//	test.changeTeacherName(organization);
		//	test.changePrincipalName(organization);	
		//	test.deleteOrganization();
		}

	}


