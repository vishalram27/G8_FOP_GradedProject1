package com.greatlearning.department;

public class TechDepartment extends SuperDepartment{

	//functions of tech department
	public String departmentName() {
		return "Tech Department";
	}
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}	
	public String getTechStackInformation() {
		return "core Java";
	} 
	
	//display function of tech
	public void displayFunctions(){

		System.out.println("Welcome to "+ departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(super.isTodayAHoliday());
	}
}
