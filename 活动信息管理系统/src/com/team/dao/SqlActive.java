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
	static String sql = null;//�������ݿ����
	static PreparedStatement pSta;//����Ԥ�������
	static ResultSet res;  //���ؽ����
	//������д���Ϣ��
	public void createActiDetail(Active action) throws SQLException { 
		System.out.println("1.��������");
		action.setActionName();
		//System.out.println(action.getActionName());
		System.out.println("2.����������");
		action.setActionTxt();
		System.out.println("3.����������");
		action.setActionClass();
		//System.out.println("3.����������ʱ��");
		//action.setPushTime();
		System.out.println("5.��ѡ��״̬");
		action.setActionStatusTest();
		System.out.println("6.��������֯����");
		action.setActionOrganization();
		System.out.println("7.�����뱨����ֹʱ��");
		action.setStopTime();
		System.out.println("8.�����뿪ʼ����ʱ��");
		action.setBeginTime();
		Date date = new Date();
		System.out.println("��ǰʱ��Ϊ��"+date);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("��ʽ�����ʱ�䣺����>"+format.format(date));
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
		System.out.println("�ύ��ɹ�");
	}
	//��ѯ�ı�����
	public String selectTxt() throws SQLException {
		System.out.println("��������Ҫ���ĵ��ı���id");
		String Id = n.next();
		
		sql = "select actionTxt from acti_detail where id = ?";
		pSta = connection.getconnection().prepareStatement(sql);
		pSta.setObject(1, Id);							//�������ݿ����������˳��
		res = pSta.executeQuery();			
		if(res.next()) {							//res.next()�����صĽ���������������ͬ		
			System.out.println(res.getString("actionTxt"));				//ע��ʧ�ܣ��ݹ���ִ��
		}
		return res.getString("actionTxt");
	}
	//�޸Ļ����
	public void changeActionClass(Active action) throws SQLException {
		System.out.println("������������ĵ�Id��");
		String Id = n.next();
		System.out.println("���޸���Ļ����");
		action.setActionClass();
		sql = "update acti_detail set actionClass =?where id = ?";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1, action.getActionClass());
		res.setObject(2,Id);
		res.execute();
		System.out.println("�޸Ļ���ͳɹ�");
	} 
	//�޸���֯����
	public void changeActionOrganization(Active action) throws SQLException {
		System.out.println("������������ĵ�Id��");
		String Id = n.next();
		System.out.println("���޸������֯����");
		action.setActionOrganization();
		sql = "update acti_detail set actionOrganization =?where id = ?";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1, action.getActionOrganization());
		res.setObject(2,Id);
		res.execute();
		System.out.println("�޸���֯�����ɹ�");
	} 
	//�޸Ŀ�ʼ����ʱ��
	public void changeBeginTime(Active action) throws SQLException {
			System.out.println("������������ĵ�Id��");
			String Id = n.next();
			System.out.println("���޸Ľ��ܱ���ʱ��");
			action.setBeginTime();
			sql = "update acti_detail set beginTime =?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1, action.getBeginTime());
			res.setObject(2,Id);
			res.execute();
			System.out.println("�޸ı���ʱ��ɹ�");
		} 
	//�޸Ľ�ֹ����ʱ��
	public void changeStoptime(Active action) throws SQLException {
		System.out.println("������������ĵ�Id��");
		String Id = n.next();
		System.out.println("���޸���Ľ�ֹ����ʱ��");
		action.setStopTime();
		sql = "update acti_detail set stopTime =?where id = ?";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1, action.getStopTime());
		res.setObject(2,Id);
		res.execute();
		System.out.println("�޸Ľ�ֹ����ʱ��ɹ�");
	} 
	//�޸Ļ״̬
	public void changeActionStatus(Active action) throws SQLException {
		System.out.println("������������ĵ�Id��");
		String Id = n.next();
		System.out.println("���޸���Ļ״̬");
		action.setActionStatusTest();
		sql = "update acti_detail set actionStatus =?where id = ?";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1, action.getActionStatusTest());
		res.setObject(2,Id);
		System.out.println(sql);
		res.execute();
		System.out.println("�޸Ļ���ͳɹ�");
	}
	//�޸Ļ��
	public void changeActionName(Active action) throws SQLException {
		System.out.println("����������ĵĻ��");
		action.setActionName();
		System.out.println("����������ĵ�id���");
		String Id = n.next();
		sql = "update acti_detail set actionName = ?where id = ?";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1, action.getActionName());
		//System.out.println(Id);
		res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
		res.execute();
		System.out.println("�޸Ļ���ɹ�");
	}
	//�����ı�����
	public void changeActionTxt(Active action) throws SQLException{
		String hadSaveTxt;  //֮ǰ����������ı�
		hadSaveTxt = selectTxt();
		System.out.println("���޸�����ı�����");
		action.setActionTxt();
		sql = "update acti_detail set actionTxt = ?where id = ?";
		System.out.println("���������޸ĵ�id");
		String Id = n.next();
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1, action.getActionTxt());
		res.setObject(2,Id);
		res.execute();
		System.out.println("�޸��ı����ݳɹ�");
	}
	//��ѯ�����
	public void selectActive() throws SQLException {
		System.out.println("��������Ҫ��ѯ�Ļ��id");
		String Id = n.next();
		sql = "select * from acti_detail where id = ?";
		pSta = connection.getconnection().prepareStatement(sql);
		pSta.setObject(1, Id);							
		res = pSta.executeQuery();		
        System.out.println("-----------------");
        System.out.println("ִ�н��������ʾ:");  
        System.out.println("-----------------");  
        System.out.println("Id" + "\t" + "���"+ "\t" +"�����"+ "\t" +"�����"
        + "\t" +"����ʱ��"+ "\t" +"�״̬"+ "\t" +"������֯"+ "\t" +"��ֹ����ʱ��"+ "\t" +"���ܱ���ʱ��");  
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
            //��ȡstuid��������
            id = res.getString("id");
            actionName = res.getString("actionName");
            actionTxt = res.getString("actionTxt");
            actionClass = res.getString("actionClass");
            pushTime = res.getString("pushTime");
            actionStatus = res.getString("actionStatus");
            actionOrganization = res.getString("actionOrganization");
            stopTime = res.getString("stopTime");
            beginTime = res.getString("beginTime");
            
            //������
            System.out.println(id + "\t" + actionName+ "\t" +actionTxt+ "\t" +actionClass+ "\t" +pushTime
            		+ "\t" + actionStatus+ "\t" +actionOrganization+ "\t" +  stopTime+ "\t" +beginTime);
        }
	}
	//ɾ������
	public void deleteAction() throws SQLException {
		System.out.println("��������Ҫɾ���Ļ��id");
		String Id = n.next();
		sql = "delete from acti_detail where id = ?";
		pSta = connection.getconnection().prepareStatement(sql);
		pSta.setObject(1, Id);							//�������ݿ����������˳��
		pSta.execute();
		System.out.println("���ɾ��");
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
