package com.team.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.mysql.jdbc.Statement;
import com.team.bean.*;

public class SqlActive {
	Scanner n = new Scanner(System.in);
	static String sql = null;//定义数据库语句
	static PreparedStatement pSta;//定义预编译语句
	static ResultSet res;  //返回结果集
	//创建填写活动信息表
	public void createActiDetail(Active action) throws SQLException { 
		System.out.println("1.请输入活动名");
		action.setActionName();
		//System.out.println(action.getActionName());
		System.out.println("2.请输入活动内容");
		action.setActionTxt();
		System.out.println("3.请输入活动类型");
		action.setActionClass();
		//System.out.println("3.请输入活动发布时间");
		//action.setPushTime();
		System.out.println("5.请选择活动状态");
		action.setActionStatusTest();
		System.out.println("6.请输入组织归属");
		action.setActionOrganization();
		System.out.println("7.请输入报名截止时间");
		action.setStopTime();
		System.out.println("8.请输入开始报名时间");
		action.setBeginTime();
		Date date = new Date();
		System.out.println("当前时间为："+date);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("格式化后的时间：——>"+format.format(date));
		sql = "insert into acti_detail(actionName,actionTxt,actionClass,pushTime,actionStatus,"
				+ "actionOrganization,stopTime,beginTime)values(?,?,?,?,?,?,?,?)";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1,action.getActionName());
		res.setObject(2,action.getActionTxt());
		res.setObject(3,action.getActionClass());
		res.setObject(4,format.format(date));
		res.setObject(5,action.getActionStatusTest());
		res.setObject(6,action.getActionOrganization());
		res.setObject(7,action.getStopTime());
		res.setObject(8,action.getBeginTime());
		res.execute();
		System.out.println("提交表成功");
	}
	//查询文本内容
	public String selectTxt() throws SQLException {
		System.out.println("请输入你要更改的文本的id");
		String Id = n.next();
		
		sql = "select actionTxt from acti_detail where id = ?";
		pSta = connection.getconnection().prepareStatement(sql);
		pSta.setObject(1, Id);							//设置数据库操作语句对象顺序
		res = pSta.executeQuery();			
		if(res.next()) {							//res.next()代表返回的结果与输入的数据相同		
			System.out.println(res.getString("actionTxt"));				//注册失败，递归再执行
		}
		return res.getString("actionTxt");
	}
	//修改活动类型
	public void changeActionClass(Active action) throws SQLException {
		System.out.println("请输入你想更改的Id号");
		String Id = n.next();
		System.out.println("请修改你的活动类型");
		action.setActionClass();
		sql = "update acti_detail set actionClass =?where id = ?";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1, action.getActionClass());
		res.setObject(2,Id);
		res.execute();
		System.out.println("修改活动类型成功");
	} 
	//修改组织归属
	public void changeActionOrganization(Active action) throws SQLException {
		System.out.println("请输入你想更改的Id号");
		String Id = n.next();
		System.out.println("请修改你的组织归属");
		action.setActionOrganization();
		sql = "update acti_detail set actionOrganization =?where id = ?";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1, action.getActionOrganization());
		res.setObject(2,Id);
		res.execute();
		System.out.println("修改组织归属成功");
	} 
	//修改开始报名时间
	public void changeBeginTime(Active action) throws SQLException {
			System.out.println("请输入你想更改的Id号");
			String Id = n.next();
			System.out.println("请修改接受报名时间");
			action.setBeginTime();
			sql = "update acti_detail set beginTime =?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1, action.getBeginTime());
			res.setObject(2,Id);
			res.execute();
			System.out.println("修改报名时间成功");
		} 
	//修改截止报名时间
	public void changeStoptime(Active action) throws SQLException {
		System.out.println("请输入你想更改的Id号");
		String Id = n.next();
		System.out.println("请修改你的截止报名时间");
		action.setStopTime();
		sql = "update acti_detail set stopTime =?where id = ?";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1, action.getStopTime());
		res.setObject(2,Id);
		res.execute();
		System.out.println("修改截止报名时间成功");
	} 
	//修改活动状态
	public void changeActionStatus(Active action) throws SQLException {
		System.out.println("请输入你想更改的Id号");
		String Id = n.next();
		System.out.println("请修改你的活动状态");
		action.setActionStatusTest();
		sql = "update acti_detail set actionStatus =?where id = ?";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1, action.getActionStatusTest());
		res.setObject(2,Id);
		System.out.println(sql);
		res.execute();
		System.out.println("修改活动类型成功");
	}
	//修改活动名
	public void changeActionName(Active action) throws SQLException {
		System.out.println("请输入想更改的活动名");
		action.setActionName();
		System.out.println("请输入想更改的id序号");
		String Id = n.next();
		sql = "update acti_detail set actionName = ?where id = ?";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1, action.getActionName());
		//System.out.println(Id);
		res.setObject(2,Id);//2 是修改id为2 的表字段
		res.execute();
		System.out.println("修改活动名成功");
	}
	//更改文本内容
	public void changeActionTxt(Active action) throws SQLException{
		String hadSaveTxt;  //之前保存的内容文本
		hadSaveTxt = selectTxt();
		System.out.println("请修改你的文本内容");
		action.setActionTxt();
		sql = "update acti_detail set actionTxt = ?where id = ?";
		System.out.println("请输入你修改的id");
		String Id = n.next();
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1, action.getActionTxt());
		res.setObject(2,Id);
		res.execute();
		System.out.println("修改文本内容成功");
	}
	//查询整个活动
	public void selectActive() throws SQLException {
		System.out.println("请输入你要查询的活动的id");
		String Id = n.next();
		sql = "select * from acti_detail where id = ?";
		pSta = connection.getconnection().prepareStatement(sql);
		pSta.setObject(1, Id);							
		res = pSta.executeQuery();		
        System.out.println("-----------------");
        System.out.println("执行结果如下所示:");  
        System.out.println("-----------------");  
        System.out.println("Id" + "\t" + "活动名"+ "\t" +"活动内容"+ "\t" +"活动类型"
        + "\t" +"发布时间"+ "\t" +"活动状态"+ "\t" +"归属组织"+ "\t" +"截止报名时间"+ "\t" +"接受报名时间");  
        System.out.println("-----------------");  
         
        String id = null;
        String actionName = null;
        String actionTxt = null;
        String actionClass = null;
        String pushTime = null;
        String actionStatus = null;
        String actionOrganization = null;
        String stopTime = null;
        String beginTime = null;
        while(res.next()){
            //获取stuid这列数据
            id = res.getString("id");
            actionName = res.getString("actionName");
            actionTxt = res.getString("actionTxt");
            actionClass = res.getString("actionClass");
            pushTime = res.getString("pushTime");
            actionStatus = res.getString("actionStatus");
            actionOrganization = res.getString("actionOrganization");
            stopTime = res.getString("stopTime");
            beginTime = res.getString("beginTime");
            
            //输出结果
            System.out.println(id + "\t" + actionName+ "\t" +actionTxt+ "\t" +actionClass+ "\t" +pushTime
            		+ "\t" + actionStatus+ "\t" +actionOrganization+ "\t" +  stopTime+ "\t" +beginTime);
        }
	}
	//删除这个活动
	public void deleteAction() throws SQLException {
		System.out.println("请输入你要删除的活动的id");
		String Id = n.next();
		sql = "delete from acti_detail where id = ?";
		pSta = connection.getconnection().prepareStatement(sql);
		pSta.setObject(1, Id);							//设置数据库操作语句对象顺序
		pSta.execute();
		System.out.println("活动已删除");
	}
	public static void main(String[] args) throws SQLException {
	
	SqlActive test = new SqlActive();
	Active action =new Active();
	//test.createActiDetail(action);
	//test.changeActionName(action);
	//test.changeActionTxt(action);
	//test.selectTxt();
	//test.changeActionOrganization(action);
	//test.changeStoptime(action);
	//test.changeActionStatus(action);
	//test.changeActionClass(action);
	//test.deleteAction();
	//test.changeBeginTime(action);
	test.selectActive();
	connection.closeMyConnection();
	}

}
