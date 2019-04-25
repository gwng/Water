package com.team.bean;
//作者：钟泽南
//创建时间类
public class Time {


		//设置年月日时分秒
		private String year;
		private String month;
		private String day;
		private String dhour;
		private String dminter;
		private String second;
		//初始化
		Time(){
			year="0000";
			month="00";
			day="00";
			dhour="00";
			dminter="00";
			second="00";
		}
		//设置时间方法
		public void setTime(String year,String month,String day,String dhour,String dminter,String dsecond) {
			this.year=year;
			this.month=month;
			this.day=day;
			this.dhour=dhour;
			this.dminter=dminter;
			this.second=dsecond;
			
		}
		//获取时间方法
		public String getTime() {
			String str;
			str=year+"-"+month+"-"+day+"-"+dhour+"-"+dminter+"-"+second;
			return str;
		
	}

}
