package com.greatlearning.department;

public class HRDepartment extends SuperDepartment{

	//functions of hr department
	public String departmentName() {
		return "HR Department";
	}
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}	
	public String doActivity() {
		return "Team Lunch";
	}

	//display function of hr
	public void displayFunctions(){

		System.out.println("Welcome to "+ departmentName());
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(super.isTodayAHoliday());
	}

}
