package com.greatlearning.main;

import com.greatlearning.department.*;

public class Driver {

	public static void main(String[] args) {
		
		//invoking methods of admin department to display functionalities
		AdminDepartment admin = new AdminDepartment();
		admin.displayFunctions();
		System.out.println();
		
		//invoking methods of hr department to display functionalities
		HRDepartment hr = new HRDepartment();
		hr.displayFunctions();
		System.out.println();
		
		//invoking methods of tech department to display functionalities
		TechDepartment tech = new TechDepartment();
		tech.displayFunctions();
	}
}
