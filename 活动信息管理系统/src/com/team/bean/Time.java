package com.team.bean;
//���ߣ�������
//����ʱ����
public class Time {


		//����������ʱ����
		private String year;
		private String month;
		private String day;
		private String dhour;
		private String dminter;
		private String second;
		//��ʼ��
		Time(){
			year="0000";
			month="00";
			day="00";
			dhour="00";
			dminter="00";
			second="00";
		}
		//����ʱ�䷽��
		public void setTime(String year,String month,String day,String dhour,String dminter,String dsecond) {
			this.year=year;
			this.month=month;
			this.day=day;
			this.dhour=dhour;
			this.dminter=dminter;
			this.second=dsecond;
			
		}
		//��ȡʱ�䷽��
		public String getTime() {
			String str;
			str=year+"-"+month+"-"+day+"-"+dhour+"-"+dminter+"-"+second;
			return str;
		
	}

}
