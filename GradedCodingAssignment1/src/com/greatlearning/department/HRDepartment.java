package com.greatlearning.department;

public class HRDepartment extends SuperDepartment {
	
	public HRDepartment() {
		
			super.getdepartmentName();
			
			super.setdepartmentName("HR Department");
			
			super.getgetTodaysWork();
			
			super.setgetTodaysWork("Fill today’s timesheet and mark your attendance");
			
			super.getgetWorkDeadline();
			
			super.setgetWorkDeadline("Complete by Today EOD");
			
			super.getdoActivity();
			
			super.setdoActivity("Team Lunch");
			
			super.getIsTodayAHoliday();
			
			super.setIsTodayAHoliday();
}
	
	public void displayHRDepartment(String departmentName) {
		System.out.println("Welcome to " + departmentName);
		System.out.println(doActivity);
		System.out.println(getTodaysWork);
		System.out.println(getWorkDeadline);
		System.out.print(isTodayAHoliday);
		
	}
}