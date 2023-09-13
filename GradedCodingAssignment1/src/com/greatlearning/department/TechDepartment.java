package com.greatlearning.department;

public class TechDepartment extends SuperDepartment {

	public TechDepartment() {
		
			super.getdepartmentName();
			
			super.setdepartmentName("Tech Department");
			
			super.getgetTodaysWork();
			
			super.setgetTodaysWork("Complete coding of module 1");
			
			super.setgetWorkDeadline(getWorkDeadline);
			
			super.setgetWorkDeadline("Complete by Today EOD");
			
			super.getgetTechStackInformation(getTechStackInformation);
			
			super.getgetTechStackInformation("Core Java");
			
			super.getIsTodayAHoliday();
			
			super.setIsTodayAHoliday();
	}

		public void displayTechDepartment(String DepartmentName) {
				
			System.out.println("Welcome to " + getdepartmentName());
			System.out.println(getTodaysWork);
			System.out.println(getWorkDeadline);
			System.out.println(getTechStackInformation);
			System.out.print(isTodayAHoliday);
			
		}
}