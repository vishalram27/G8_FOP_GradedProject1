package com.greatlearning.department;

public class AdminDepartment extends SuperDepartment {

	public AdminDepartment(){
		
		super.getdepartmentName();
		
		super.setdepartmentName("Admin Department");
		
		super.getgetTodaysWork();
		
		super.setgetTodaysWork("Complete your documents submission");
		
		super.getgetWorkDeadline();
		
		super.setgetWorkDeadline("Complete by Today EOD");
		
		super.getIsTodayAHoliday();
		
		super.setIsTodayAHoliday();
	}
	
	public void displayAdminDepartment(String departmentName) {
		System.out.println("Welcome to " + getdepartmentName());
		System.out.println(getTodaysWork);
		System.out.println(getWorkDeadline);
		System.out.print(isTodayAHoliday);
		
	}

	
}