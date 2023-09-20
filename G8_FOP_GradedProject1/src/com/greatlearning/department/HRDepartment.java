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

		//String dept = departmentName();
		System.out.println("Welcome to "+this.departmentName());

		//String activity = doActivity();
		System.out.println(this.doActivity());

		//String work = getTodaysWork();
		System.out.println(this.getTodaysWork());

		//String deadline = getWorkDeadline();
		System.out.println(this.getWorkDeadline());

		//String holidayStatus = super.isTodayAHoliday();
		System.out.println(super.isTodayAHoliday());
	}

}
