package com.team.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.team.bean.Active;
import com.team.bean.Message;

public class SqlMessage {
	Scanner n = new Scanner(System.in);
	static String sql = null;//�������ݿ����
	static PreparedStatement pSta;//����Ԥ�������
	static ResultSet res;  //���ؽ����
	public void createMessage(Message message) throws SQLException { 
		System.out.println("1.��������Ϣ��");
		message.setMessage();
		System.out.println("2.��������Ϣ����");
		message.setText();
		System.out.println("3.������֪ͨ�ʱ��");
		message.setTime();
		System.out.println("4.�����뷢����֯");
		message.setOrganization();
		sql = "insert into inform_detail(message_title ,message_detail,time,message_belong)values(?,?,?,?)";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1,message.getMessage());
		res.setObject(2,message.getText());
		res.setObject(3,message.getT());
		res.setObject(4,message.getOrganization());
		res.execute();
		System.out.println("�ύ��ɹ�");
	}
	//�޸���Ϣ��
		public void changeMessageTitle(Message message) throws SQLException {
			System.out.println("����������ĵ���Ϣ��");
			message.setMessage();
			System.out.println("����������ĵ�id���");
			String Id = n.next();
			sql = "update inform_detail set message_title = ?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1, message.getMessage());
			//System.out.println(Id);
			res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
			res.execute();
			System.out.println("�޸���Ϣ���ɹ�");
		}
		//�޸���Ϣ����
		public void changeMessageText(Message message) throws SQLException {
			System.out.println("����������ĵ���Ϣ����");
			message.setText();
			System.out.println("����������ĵ�id���");
			String Id = n.next();
			sql = "update inform_detail set message_detail = ?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1, message.getText());
			//System.out.println(Id);
			res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
			res.execute();
			System.out.println("�޸Ļ���ɹ�");
		}
		//�޸�֪ͨʱ��
		public void changeMessageTime(Message message) throws SQLException {
			System.out.println("����������ĵ�֪ͨ�ʱ��");
			message.setTime();
			System.out.println("����������ĵ�id���");
			String Id = n.next();
			sql = "update inform_detail set time = ?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1, message.getT());
			//System.out.println(Id);
			res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
			res.execute();
			System.out.println("�޸�֪ͨʱ��ɹ�");
		}
		//�޸ķ�����֯
		public void changeOrganization(Message message) throws SQLException {
			System.out.println("����������ĵķ�����֯��");
			message.setOrganization();
			System.out.println("����������ĵ�id���");
			String Id = n.next();
			sql = "update inform_detail set message_belong = ?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1, message.getOrganization());
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
		Message message = new Message();
	//	test.createMessage(message);
	//	test.changeMessageTitle(message);
	//	test.changeMessageText(message);
	//	test.changeMessageTime(message);
	//	test.changeOrganization(message);	
		test.deleteMessage();
	}

}
