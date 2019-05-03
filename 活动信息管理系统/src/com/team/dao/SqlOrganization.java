package com.team.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import com.team.bean.Organization;
//��Ӧ��֯��Ϣ����ӦOrganization
public class SqlOrganization {
		Scanner n = new Scanner(System.in);
		static String sql = null;//�������ݿ����
		static PreparedStatement pSta;//����Ԥ�������
		static ResultSet res;  //���ؽ����
		//������֯��Ϣ��
		public void createOrganization(Organization organization) throws SQLException { 
			System.out.println("1.��������֯��");
			organization.setOrganizationName();
			System.out.println("2.��������֯����");
			organization.setOrganizationProperty();
			System.out.println("3.������ָ����ʦ����");
			organization.setTeacherName();
			System.out.println("4.�����븺��������");
			organization.setPrincipalName();
			sql = "insert into team_detail(organization,organi_character,tea_name,principal)values(?,?,?,?)";
			PreparedStatement res = connection.getconnection().prepareStatement(sql);
			res.setObject(1,organization.getOrganizationName());
			res.setObject(2,organization.getOrganizationProperty());
			res.setObject(3,organization.getTeacherName());
			res.setObject(4,organization.getPrincipalName());
			res.execute();
			System.out.println("�ύ��ɹ�");
		}
		//�޸���֯��
			public void changeOrganizationName(Organization organization) throws SQLException {
				System.out.println("����������ĵ���֯��");
				organization.setOrganizationName();
				System.out.println("����������ĵ�id���");
				String Id = n.next();
				sql = "update team_detail set organization = ?where id = ?";
				PreparedStatement res = connection.getconnection().prepareStatement(sql);
				res.setObject(1, organization.getOrganizationName());
				res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
				res.execute();
				System.out.println("�޸���֯���ɹ�");
			}
			//�޸���֯����
			public void changeOrganizationProperty(Organization organization) throws SQLException {
				System.out.println("����������ĵ���֯����");
				organization.setOrganizationProperty();
				System.out.println("����������ĵ�id���");
				String Id = n.next();
				sql = "update team_detail set organi_character = ?where id = ?";
				PreparedStatement res = connection.getconnection().prepareStatement(sql);
				res.setObject(1,organization.getOrganizationProperty());
				//System.out.println(Id);
				res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
				res.execute();
				System.out.println("�޸���֯���ʳɹ�");
			}
			//�޸�ָ����ʦ����
			public void changeTeacherName(Organization organization) throws SQLException {
				System.out.println("����������ĵ�֪ͨ�ʱ��");
				organization.setTeacherName();
				System.out.println("����������ĵ�id���");
				String Id = n.next();
				sql = "update team_detail set tea_name = ?where id = ?";
				PreparedStatement res = connection.getconnection().prepareStatement(sql);
				res.setObject(1, organization.getTeacherName());
				//System.out.println(Id);
				res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
				res.execute();
				System.out.println("�޸�ָ����ʦ�����ɹ�");
			}
			//�޸ĸ���������
			public void changePrincipalName(Organization organization) throws SQLException {
				System.out.println("����������ĵĸ���������");
				organization.setPrincipalName();
				System.out.println("����������ĵ�id���");
				String Id = n.next();
				sql = "update team_detail set principal = ?where id = ?";
				PreparedStatement res = connection.getconnection().prepareStatement(sql);
				res.setObject(1,organization.getPrincipalName());
				//System.out.println(Id);
				res.setObject(2,Id);//2 ���޸�idΪ2 �ı��ֶ�
				res.execute();
				System.out.println("�޸ĸ����������ɹ�");
			}
			//ɾ��֪ͨ
			public void deleteOrganization() throws SQLException {
				System.out.println("��������Ҫɾ�����˺���Ϣ��id");
				String Id = n.next();
				sql = "delete from team_detail where id = ?";
				pSta = connection.getconnection().prepareStatement(sql);
				pSta.setObject(1, Id);							//�������ݿ����������˳��
				pSta.execute();
				System.out.println("�˺���Ϣ��ɾ��");
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


