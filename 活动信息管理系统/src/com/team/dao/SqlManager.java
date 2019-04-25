package com.team.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.team.bean.*;

public class SqlManager {
	Scanner n = new Scanner(System.in);
	static String sql = null;//定义数据库语句
	static PreparedStatement pSta;//定义预编译语句
	static ResultSet res;  //返回结果集
	//创建填写管理者信息表
	public void createManager(ManagerMessageTable ManagerMessageTable) throws SQLException { 
		System.out.println("请输入管理者性名");
		ManagerMessageTable.setManagerName();
		ManagerMessageTable.setSex();  //管理者性别
		System.out.println("请输入管理者学号");
		ManagerMessageTable.setManasgerNo();
		System.out.println("请输入管理者院系");
		ManagerMessageTable.setCollege();
		System.out.println("请输入管理者专业");
		ManagerMessageTable.setClassName();
		System.out.println("请选择管理者电话");
		ManagerMessageTable.setMobilePhone();
		System.out.println("请输入组织名");
		ManagerMessageTable.setOrganizationName();
		System.out.println("请输入管理者职位");
		ManagerMessageTable.setPosition();
		sql = "insert into manage_detail(managerName,sex,managerNo,college,"
				+ "className,mobliePhone,organizationName,position)values(?,?,?,?,?,?,?,?)";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1,ManagerMessageTable.getManagerName());
		res.setObject(2,ManagerMessageTable.getSex());
		res.setObject(3,ManagerMessageTable.getManagerNo());
		res.setObject(4,ManagerMessageTable.getCollege());
		res.setObject(5,ManagerMessageTable.getClassName());
		res.setObject(6,ManagerMessageTable.getMobilePhone());
		res.setObject(7,ManagerMessageTable.getOrganizationName());
		res.setObject(8,ManagerMessageTable.getPosition());
		res.execute();
		System.out.println("提交管理者表成功");
	}
	//更改管理者姓名
	public void changeManagerName(ManagerMessageTable ManagerMessageTable) throws SQLException {
		System.out.println("请输入想更改的管理者姓名");
		ManagerMessageTable.setManagerName();
		System.out.println("请输入想更改的id序号");
		String Id = n.next();
		sql = "update manage_detail set managerName = ?where id = ?";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1,ManagerMessageTable.getManagerName());
		//System.out.println(Id);
		res.setObject(2,Id);//2 是修改id为2 的表字段
		res.execute();
		System.out.println("修改管理者姓名成功");
	}
	//更改管理者性别
	public void changeManagerSex(ManagerMessageTable ManagerMessageTable) throws SQLException {
		System.out.println("请输入想更改的管理者姓别");
		ManagerMessageTable.setSex();
		System.out.println("请输入想更改的id序号");
		String Id = n.next();
		sql = "update manage_detail set sex = ?where id = ?";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1,ManagerMessageTable.getSex());
		//System.out.println(Id);
		res.setObject(2,Id);//2 是修改id为2 的表字段
		res.execute();
		System.out.println("修改管理者姓别成功");
	}
	//更改管理者姓名
		public void changeManagerNo(ManagerMessageTable ManagerMessageTable) throws SQLException {
			System.out.println("请输入想更改的管理者学号");
			ManagerMessageTable.setManasgerNo();
			System.out.println("请输入想更改的id序号");
			String Id = n.next();
			sql = "update manage_detail set managerNo = ?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1,ManagerMessageTable.getManagerNo());
			//System.out.println(Id);
			res.setObject(2,Id);//2 是修改id为2 的表字段
			res.execute();
			System.out.println("修改管理者学号成功");
		}	
	//更改管理者院系
		public void changecollege(ManagerMessageTable ManagerMessageTable) throws SQLException {
			System.out.println("请输入想更改的管理者院系");
				ManagerMessageTable.setClassName();
				System.out.println("请输入想更改的id序号");
				String Id = n.next();
				sql = "update manage_detail set className = ?where id = ?";
				PreparedStatement res = connection.getconnection().prepareStatement(sql);
				res.setObject(1,ManagerMessageTable.getClassName());
				//System.out.println(Id);
				res.setObject(2,Id);//2 是修改id为2 的表字段
				res.execute();
				System.out.println("修改管理者院系成功");
				}		
	//更改管理者专业
	public void changeclassName(ManagerMessageTable ManagerMessageTable) throws SQLException {
		System.out.println("请输入想更改的管理者专业");
			ManagerMessageTable.setCollege();
			System.out.println("请输入想更改的id序号");
			String Id = n.next();
			sql = "update manage_detail set college = ?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1,ManagerMessageTable.getCollege());
	 			//System.out.println(Id);
				res.setObject(2,Id);//2 是修改id为2 的表字段
				res.execute();
				System.out.println("修改管理者专业成功");
				}		
	//更改管理者电话
	public void changeMobliePhone(ManagerMessageTable ManagerMessageTable) throws SQLException {
		System.out.println("请输入想更改的管理者电话 ");
			ManagerMessageTable.setMobilePhone();
			System.out.println("请输入想更改的id序号");
			String Id = n.next();
			sql = "update manage_detail set mobliePhone = ?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1,ManagerMessageTable.getMobilePhone());
	 			//System.out.println(Id);
				res.setObject(2,Id);//2 是修改id为2 的表字段
				res.execute();
				System.out.println("修改管理者手机号成功");
				}		
	//更改管理组织名
			public void changeOrganizationName(ManagerMessageTable ManagerMessageTable) throws SQLException {
				System.out.println("请输入想更改的管理者组织名 ");
					ManagerMessageTable.setOrganizationName();
					System.out.println("请输入想更改的id序号");
					String Id = n.next();
					sql = "update manage_detail set organizationName = ?where id = ?";
					PreparedStatement res = connection.getconnection().prepareStatement(sql);
					res.setObject(1,ManagerMessageTable.getOrganizationName());
			 		//System.out.println(Id);
					res.setObject(2,Id);//2 是修改id为2 的表字段
					res.execute();
					System.out.println("修改管理组织成功");
					}		
			//更改管理组织名
			public void changePosition(ManagerMessageTable ManagerMessageTable) throws SQLException {
				System.out.println("请输入想更改的管理者职位 ");
					ManagerMessageTable.setPosition();
					System.out.println("请输入想更改的id序号");
					String Id = n.next();
					sql = "update manage_detail set position = ?where id = ?";
					PreparedStatement res = connection.getconnection().prepareStatement(sql);
					res.setObject(1,ManagerMessageTable.getPosition());
			 		//System.out.println(Id);
					res.setObject(2,Id);//2 是修改id为2 的表字段
					res.execute();
					System.out.println("修改管理者职位成功");
					}
			
		public void selectManager() throws SQLException {
			System.out.println("请输入你要查询的活动的id");
			String Id = n.next();
			sql = "select * from manage_detail where id = ?";
			pSta = connection.getconnection().prepareStatement(sql);
			pSta.setObject(1, Id);							
			res = pSta.executeQuery();		
	        System.out.println("-----------------");
	        System.out.println("执行结果如下所示:");  
	        System.out.println("-----------------");  
	        System.out.println("Id" + "\t" + "管理者姓名"+ "\t" +"管理者性别"+ "\t" +"管理者学号"
	        + "\t" +"管理者院系"+ "\t" +"管理者专业"+ "\t" +"管理者电话"+ "\t" +"管理者组织"+ "\t" +"管理者职位");  
	        System.out.println("-----------------");  
	         
	        String id = null;
	        String managerName = null;
	        String  sex = null;
	        String managerNo = null;
	        String college = null;
	        String  className = null;
	        String  mobliePhone = null;
	        String organizationName = null;
	        String position = null;
	        while(res.next()){
	            //获取stuid这列数据
	            id = res.getString("id");
	            managerName = res.getString("managerName");
	            sex = res.getString("sex");
	            managerNo = res.getString("managerNo");
	            college = res.getString("college");
	            className= res.getString("className");
	            mobliePhone = res.getString("mobliePhone");
	            organizationName = res.getString("organizationName");
	            position = res.getString("position");
	            
	            //输出结果
	            System.out.println(id + "\t" + managerName+ "\t" +sex+ "\t" +managerNo+ "\t" +college
	            		+ "\t" +className+ "\t" + mobliePhone+ "\t" +  organizationName+ "\t" +position);
	        }
		}
		//删除这个活动
		public void deleteManager() throws SQLException {
			System.out.println("请输入你要删除的管理者表的id");
			String Id = n.next();
			sql = "delete from manage_detail where id = ?";
			pSta = connection.getconnection().prepareStatement(sql);
			pSta.setObject(1, Id);							//设置数据库操作语句对象顺序
			pSta.execute();
			System.out.println("管理者表已删除");
		}
	public static void main(String[] args) throws SQLException {
	SqlManager test = new SqlManager();
	ManagerMessageTable ManagerMessageTable = new ManagerMessageTable();
	//test.createManager(ManagerMessageTable);
	//test.changeManagerName(ManagerMessageTable);
	//test.changeManagerSex(ManagerMessageTable);
	//test.changeManagerNo(ManagerMessageTable);
	//test.changecollege(ManagerMessageTable);
	//test.changeclassName(ManagerMessageTable);
	//test.changeMobliePhone(ManagerMessageTable);
	//test.changeOrganizationName(ManagerMessageTable);
	//test.changePosition(ManagerMessageTable);
	//test.selectManager();
	test.deleteManager();
	}

}
