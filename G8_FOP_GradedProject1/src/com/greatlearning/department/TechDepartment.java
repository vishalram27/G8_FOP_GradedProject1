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

		//String dept = departmentName();
		System.out.println("Welcome to "+this.departmentName());

		//String work = getTodaysWork();
		System.out.println(this.getTodaysWork());

		//String deadline = getWorkDeadline();
		System.out.println(this.getWorkDeadline());

		//String task = getTechStackInformation();
		System.out.println(this.getTechStackInformation());

		//String holidayStatus = super.isTodayAHoliday();
		System.out.println(super.isTodayAHoliday());
	}

}
