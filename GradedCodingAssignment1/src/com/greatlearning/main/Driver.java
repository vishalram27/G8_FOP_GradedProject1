package com.greatlearning.main;

import com.greatlearning.department.AdminDepartment;
import com.greatlearning.department.HRDepartment;
import com.greatlearning.department.TechDepartment;

public class Driver {

	public static void main(String[] args) {

		AdminDepartment admin = new AdminDepartment();
		admin.displayAdminDepartment("Admin Department");
		System.out.print("\n \n");
		HRDepartment hr = new HRDepartment();
		hr.displayHRDepartment("HR Department");
		System.out.print("\n \n");
		TechDepartment tech = new TechDepartment();
		tech.displayTechDepartment("Tech Department");
}
}
