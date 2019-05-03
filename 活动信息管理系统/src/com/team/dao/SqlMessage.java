package com.team.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.team.bean.ActionMessageTable;
import com.team.bean.InformMessageTable;

public class SqlMessage {
	Scanner n = new Scanner(System.in);
	static String sql = null;//定义数据库语句
	static PreparedStatement pSta;//定义预编译语句
	static ResultSet res;  //返回结果集
	public void createMessage(InformMessageTable InformMessageTable) throws SQLException { 
		System.out.println("1.请输入信息名");
		InformMessageTable.setMessage();
		System.out.println("2.请输入信息内容");
		InformMessageTable.setText();
		System.out.println("3.请输入通知活动时间");
		InformMessageTable.setTime();
		System.out.println("4.请输入发布组织");
		InformMessageTable.setOrganization();
		sql = "insert into inform_detail(message_title ,message_detail,time,message_belong)values(?,?,?,?)";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1,InformMessageTable.getMessage());
		res.setObject(2,InformMessageTable.getText());
		res.setObject(3,InformMessageTable.getT());
		res.setObject(4,InformMessageTable.getOrganization());
		res.execute();
		System.out.println("提交表成功");
	}
	//修改信息名
		public void changeMessageTitle(InformMessageTable InformMessageTable) throws SQLException {
			System.out.println("请输入想更改的信息名");
			InformMessageTable.setMessage();
			System.out.println("请输入想更改的id序号");
			String Id = n.next();
			sql = "update inform_detail set message_title = ?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1, InformMessageTable.getMessage());
			//System.out.println(Id);
			res.setObject(2,Id);//2 是修改id为2 的表字段
			res.execute();
			System.out.println("修改信息名成功");
		}
		//修改信息内容
		public void changeMessageText(InformMessageTable InformMessageTable) throws SQLException {
			System.out.println("请输入想更改的信息内容");
			InformMessageTable.setText();
			System.out.println("请输入想更改的id序号");
			String Id = n.next();
			sql = "update inform_detail set message_detail = ?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1, InformMessageTable.getText());
			//System.out.println(Id);
			res.setObject(2,Id);//2 是修改id为2 的表字段
			res.execute();
			System.out.println("修改活动名成功");
		}
		//修改通知时间
		public void changeMessageTime(InformMessageTable InformMessageTable) throws SQLException {
			System.out.println("请输入想更改的通知活动时间");
			InformMessageTable.setTime();
			System.out.println("请输入想更改的id序号");
			String Id = n.next();
			sql = "update inform_detail set time = ?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1, InformMessageTable.getT());
			//System.out.println(Id);
			res.setObject(2,Id);//2 是修改id为2 的表字段
			res.execute();
			System.out.println("修改通知时间成功");
		}
		//修改发布组织
		public void changeOrganization(InformMessageTable InformMessageTable) throws SQLException {
			System.out.println("请输入想更改的发布组织名");
			InformMessageTable.setOrganization();
			System.out.println("请输入想更改的id序号");
			String Id = n.next();
			sql = "update inform_detail set message_belong = ?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1, InformMessageTable.getOrganization());
			//System.out.println(Id);
			res.setObject(2,Id);//2 是修改id为2 的表字段
			res.execute();
			System.out.println("修改发布组织成功");
		}
		//删除通知
		public void deleteMessage() throws SQLException {
			System.out.println("请输入你要删除的通知的id");
			String Id = n.next();
			sql = "delete from inform_detail where id = ?";
			pSta = connection.getconnection().prepareStatement(sql);
			pSta.setObject(1, Id);							//设置数据库操作语句对象顺序
			pSta.execute();
			System.out.println("通知已删除");
		}
	public static void main(String[] args) throws SQLException {
		SqlMessage test = new SqlMessage();
		InformMessageTable InformMessageTable = new InformMessageTable();
	//	test.createMessage(InformMessageTable);
	//	test.changeMessageTitle(InformMessageTable);
	//	test.changeMessageText(InformMessageTable);
	//	test.changeMessageTime(InformMessageTable);
	//	test.changeOrganization(InformMessageTable);	
		test.deleteMessage();
	}

}
