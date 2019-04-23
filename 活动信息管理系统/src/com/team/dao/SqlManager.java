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
	static String sql = null;//�������ݿ����
	static PreparedStatement pSta;//����Ԥ�������
	static ResultSet res;  //���ؽ����
	//������д��������Ϣ��
	public void createManager(Manager manager) throws SQLException { 
		System.out.println("���������������");
		manager.setManagerName();
		manager.setSex();  //�������Ա�
		System.out.println("�����������ѧ��");
		manager.setManasgerNo();
		System.out.println("�����������Ժϵ");
		manager.setCollege();
		System.out.println("�����������רҵ");
		manager.setClassName();
		System.out.println("��ѡ������ߵ绰");
		manager.setMobilePhone();
		System.out.println("��������֯��");
		manager.setOrganizationName();
		System.out.println("�����������ְλ");
		manager.setPosition();
		sql = "insert into manage_detail(managerName,sex,managerNo,college,"
				+ "className,mobliePhone,organizationName,position)values(?,?,?,?,?,?,?,?)";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1,manager.getManagerName());
		res.setObject(2,manager.getSexTest());
		res.setObject(3,manager.getManagerNo());
		res.setObject(4,manager.getCollege());
		res.setObject(5,manager.getClassName());
		res.setObject(6,manager.getMobilePhone());
		res.setObject(7,manager.getOrganizationName());
		res.setObject(8,manager.getPosition());
		res.execute();
		System.out.println("�ύ�����߱�ɹ�");
	}
	//���Ĺ���������
	public void changeManagerName(Manager manager) throws SQLException {
		System.out.println("����������ĵĹ���������");
		manager.setManagerName();
		System.out.println("����������ĵ�id���");
		String Id = n.next();
		sql = "update manage_detail set managerName = ?where id = ?";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1,manager.getManagerName());
		//System.out.println(Id);
		res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
		res.execute();
		System.out.println("�޸Ĺ����������ɹ�");
	}
	//���Ĺ������Ա�
	public void changeManagerSex(Manager manager) throws SQLException {
		System.out.println("����������ĵĹ������ձ�");
		manager.setSex();
		System.out.println("����������ĵ�id���");
		String Id = n.next();
		sql = "update manage_detail set sex = ?where id = ?";
		PreparedStatement res = connection.getconnection().prepareStatement(sql);
		res.setObject(1,manager.getSexTest());
		//System.out.println(Id);
		res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
		res.execute();
		System.out.println("�޸Ĺ������ձ�ɹ�");
	}
	//���Ĺ���������
		public void changeManagerNo(Manager manager) throws SQLException {
			System.out.println("����������ĵĹ�����ѧ��");
			manager.setManasgerNo();
			System.out.println("����������ĵ�id���");
			String Id = n.next();
			sql = "update manage_detail set managerNo = ?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1,manager.getManagerNo());
			//System.out.println(Id);
			res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
			res.execute();
			System.out.println("�޸Ĺ�����ѧ�ųɹ�");
		}	
	//���Ĺ�����Ժϵ
		public void changecollege(Manager manager) throws SQLException {
			System.out.println("����������ĵĹ�����Ժϵ");
				manager.setClassName();
				System.out.println("����������ĵ�id���");
				String Id = n.next();
				sql = "update manage_detail set className = ?where id = ?";
				PreparedStatement res = connection.getconnection().prepareStatement(sql);
				res.setObject(1,manager.getClassName());
				//System.out.println(Id);
				res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
				res.execute();
				System.out.println("�޸Ĺ�����Ժϵ�ɹ�");
				}		
	//���Ĺ�����רҵ
	public void changeclassName(Manager manager) throws SQLException {
		System.out.println("����������ĵĹ�����רҵ");
			manager.setCollege();
			System.out.println("����������ĵ�id���");
			String Id = n.next();
			sql = "update manage_detail set college = ?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1,manager.getCollege());
	 			//System.out.println(Id);
				res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
				res.execute();
				System.out.println("�޸Ĺ�����רҵ�ɹ�");
				}		
	//���Ĺ����ߵ绰
	public void changeMobliePhone(Manager manager) throws SQLException {
		System.out.println("����������ĵĹ����ߵ绰 ");
			manager.setMobilePhone();
			System.out.println("����������ĵ�id���");
			String Id = n.next();
			sql = "update manage_detail set mobliePhone = ?where id = ?";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1,manager.getMobilePhone());
	 			//System.out.println(Id);
				res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
				res.execute();
				System.out.println("�޸Ĺ������ֻ��ųɹ�");
				}		
	//���Ĺ�����֯��
			public void changeOrganizationName(Manager manager) throws SQLException {
				System.out.println("����������ĵĹ�������֯�� ");
					manager.setOrganizationName();
					System.out.println("����������ĵ�id���");
					String Id = n.next();
					sql = "update manage_detail set organizationName = ?where id = ?";
					PreparedStatement res = connection.getconnection().prepareStatement(sql);
					res.setObject(1,manager.getOrganizationName());
			 		//System.out.println(Id);
					res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
					res.execute();
					System.out.println("�޸Ĺ�����֯�ɹ�");
					}		
			//���Ĺ�����֯��
			public void changePosition(Manager manager) throws SQLException {
				System.out.println("����������ĵĹ�����ְλ ");
					manager.setPosition();
					System.out.println("����������ĵ�id���");
					String Id = n.next();
					sql = "update manage_detail set position = ?where id = ?";
					PreparedStatement res = connection.getconnection().prepareStatement(sql);
					res.setObject(1,manager.getPosition());
			 		//System.out.println(Id);
					res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
					res.execute();
					System.out.println("�޸Ĺ�����ְλ�ɹ�");
					}
			
		public void selectManager() throws SQLException {
			System.out.println("��������Ҫ��ѯ�Ļ��id");
			String Id = n.next();
			sql = "select * from manage_detail where id = ?";
			pSta = connection.getconnection().prepareStatement(sql);
			pSta.setObject(1, Id);							
			res = pSta.executeQuery();		
	        System.out.println("-----------------");
	        System.out.println("ִ�н��������ʾ:");  
	        System.out.println("-----------------");  
	        System.out.println("Id" + "\t" + "����������"+ "\t" +"�������Ա�"+ "\t" +"������ѧ��"
	        + "\t" +"������Ժϵ"+ "\t" +"������רҵ"+ "\t" +"�����ߵ绰"+ "\t" +"��������֯"+ "\t" +"������ְλ");  
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
	            //��ȡstuid��������
	            id = res.getString("id");
	            managerName = res.getString("managerName");
	            sex = res.getString("sex");
	            managerNo = res.getString("managerNo");
	            college = res.getString("college");
	            className= res.getString("className");
	            mobliePhone = res.getString("mobliePhone");
	            organizationName = res.getString("organizationName");
	            position = res.getString("position");
	            
	            //������
	            System.out.println(id + "\t" + managerName+ "\t" +sex+ "\t" +managerNo+ "\t" +college
	            		+ "\t" +className+ "\t" + mobliePhone+ "\t" +  organizationName+ "\t" +position);
	        }
		}
		//ɾ������
		public void deleteManager() throws SQLException {
			System.out.println("��������Ҫɾ���Ĺ����߱��id");
			String Id = n.next();
			sql = "delete from manage_detail where id = ?";
			pSta = connection.getconnection().prepareStatement(sql);
			pSta.setObject(1, Id);							//�������ݿ����������˳��
			pSta.execute();
			System.out.println("�����߱���ɾ��");
		}
	public static void main(String[] args) throws SQLException {
	SqlManager test = new SqlManager();
	Manager manager = new Manager();
	//test.createManager(manager);
	//test.changeManagerName(manager);
	//test.changeManagerSex(manager);
	//test.changeManagerNo(manager);
	//test.changecollege(manager);
	//test.changeclassName(manager);
	//test.changeMobliePhone(manager);
	//test.changeOrganizationName(manager);
	//test.changePosition(manager);
	//test.selectManager();
	test.deleteManager();
	}

}
