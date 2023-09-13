package com.greatlearning.department;

public class SuperDepartment {
	public String departmentName;
	public String getTodaysWork;
	public String getWorkDeadline;
	public String getTechStackInformation;
	public String doActivity;
	public String isTodayAHoliday;
	
	public String getdepartmentName() {
		return departmentName;
	}
	public void setdepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getgetTodaysWork() {
		return getTodaysWork;
	}
	public void setgetTodaysWork(String getTodaysWork) {
		this.getTodaysWork = getTodaysWork;
	}
	public String getgetWorkDeadline() {
		return getWorkDeadline;
	}
	public void setgetWorkDeadline(String getWorkDeadline) {
		this.getWorkDeadline = getWorkDeadline;
	}
	public void getgetTechStackInformation(String getTechStackInformation) {
		this.getTechStackInformation = getTechStackInformation;	
	}
	public String setgetTechStackInformation(String getTechStackInformation) {
		return getTechStackInformation;
		
	}
	public String getdoActivity() {
		return doActivity;	
	}
	public void setdoActivity(String doActivity) {
		this.doActivity = doActivity;
		
	}
	public String getIsTodayAHoliday() {
		return isTodayAHoliday;
	}
	public void setIsTodayAHoliday() {
		isTodayAHoliday = "Today is not a holiday";
	}
}
