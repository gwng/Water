package com.team.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.team.bean.ActionMessageTable;
import com.team.bean.InformMessageTable;

public class SqlMessage {
	Scanner n = new Scanner(System.in);
	static String sql = null;//�������ݿ����
	static PreparedStatement pSta;//����Ԥ�������
	static ResultSet res;  //���ؽ����
	public void createMessage(InformMessageTable InformMessageTable) throws SQLException { 
		System.out.println("1.��������Ϣ��");
		InformMessageTable.setMessage();
		System.out.println("2.��������Ϣ����");
		InformMessageTable.setText();
		System.out.println("3.������֪ͨ�ʱ��");
		InformMessageTable.setTime();
		System.out.println("4.�����뷢����֯");
		InformMessageTable.setOrganization();
		sql = "insert into inform_detail(message_title ,message_detail,time,message_belong)values(?,?,?,?)";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1,InformMessageTable.getMessage());
		res.setObject(2,InformMessageTable.getText());
		res.setObject(3,InformMessageTable.getT());
		res.setObject(4,InformMessageTable.getOrganization());
		res.execute();
		System.out.println("�ύ��ɹ�");
	}
	//�޸���Ϣ��
		public void changeMessageTitle(InformMessageTable InformMessageTable) throws SQLException {
			System.out.println("����������ĵ���Ϣ��");
			InformMessageTable.setMessage();
			System.out.println("����������ĵ�id���");
			String Id = n.next();
			sql = "update inform_detail set message_title = ?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1, InformMessageTable.getMessage());
			//System.out.println(Id);
			res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
			res.execute();
			System.out.println("�޸���Ϣ���ɹ�");
		}
		//�޸���Ϣ����
		public void changeMessageText(InformMessageTable InformMessageTable) throws SQLException {
			System.out.println("����������ĵ���Ϣ����");
			InformMessageTable.setText();
			System.out.println("����������ĵ�id���");
			String Id = n.next();
			sql = "update inform_detail set message_detail = ?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1, InformMessageTable.getText());
			//System.out.println(Id);
			res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
			res.execute();
			System.out.println("�޸Ļ���ɹ�");
		}
		//�޸�֪ͨʱ��
		public void changeMessageTime(InformMessageTable InformMessageTable) throws SQLException {
			System.out.println("����������ĵ�֪ͨ�ʱ��");
			InformMessageTable.setTime();
			System.out.println("����������ĵ�id���");
			String Id = n.next();
			sql = "update inform_detail set time = ?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1, InformMessageTable.getT());
			//System.out.println(Id);
			res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
			res.execute();
			System.out.println("�޸�֪ͨʱ��ɹ�");
		}
		//�޸ķ�����֯
		public void changeOrganization(InformMessageTable InformMessageTable) throws SQLException {
			System.out.println("����������ĵķ�����֯��");
			InformMessageTable.setOrganization();
			System.out.println("����������ĵ�id���");
			String Id = n.next();
			sql = "update inform_detail set message_belong = ?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1, InformMessageTable.getOrganization());
			//System.out.println(Id);
			res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
			res.execute();
			System.out.println("�޸ķ�����֯�ɹ�");
		}
		//ɾ��֪ͨ
		public void deleteMessage() throws SQLException {
			System.out.println("��������Ҫɾ����֪ͨ��id");
			String Id = n.next();
			sql = "delete from inform_detail where id = ?";
			pSta = connection.getconnection().prepareStatement(sql);
			pSta.setObject(1, Id);							//�������ݿ����������˳��
			pSta.execute();
			System.out.println("֪ͨ��ɾ��");
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
