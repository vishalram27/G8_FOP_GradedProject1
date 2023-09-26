package com.greatlearning.department;

public class AdminDepartment extends SuperDepartment {

	//functions of admin department
	public String departmentName() {
		return "Admin Department";
	}
	public String getTodaysWork() {
		return "Complete Your Documents Submission";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	//display function of admin
	public void displayFunctions(){
	
		System.out.println("Welcome to "+this.departmentName());
		System.out.println(this.getTodaysWork());
		System.out.println(this.getWorkDeadline());
		System.out.println(super.isTodayAHoliday());
	}
	
}
