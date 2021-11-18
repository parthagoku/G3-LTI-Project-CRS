package com.lti.application;

import java.util.Iterator;
import java.util.Scanner;



import com.lti.bean.Course;
import com.lti.dummydata.DummyData;

public class CRSApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		while(true)
		{
		System.out.println("=====================CRS Application Portal==========================");
		System.out.println("=====================================================================");
		System.out.println("Enter your Designation to enter the portal or type Exit to exit.");
		Scanner choice1=new Scanner(System.in);
		String option=choice1.nextLine();
		ProfApp pf=new ProfApp();
		StudentApp sa=new StudentApp();
		AdminApp aa=new AdminApp();
		if(option.equalsIgnoreCase("Professor"))
		{
			
			pf.profOpp();
		}
		
		else if(option.equalsIgnoreCase("Student"))
		{
			sa.studentOpp();
		}
		else if(option.equalsIgnoreCase("Admin"))
		{
			aa.adminOpp();
		}
		else if(option.equalsIgnoreCase("Exit"))
		{
			System.out.println("Logged OFF.....");
			break;
		}
		}
		
		/*DummyData dd = new DummyData();
		// entry point
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter 1 to add courses ");
			System.out.println("Enter 11 to show courses ");
			
			System.out.println("Enter 2 to add Student ");
			System.out.println("Enter 3 to map student to courses");
			System.out.println("Enter 4 to enter Payment ");
			System.out.println("Enter 10 to exit ");
			int choice = sc.nextInt();
			if (choice == 1 ) {
				System.out.println("Enter course code");
				System.out.println("Enter course name");
				System.out.println("Enter is Offered");
				System.out.println("Ener instructor");
				String courseCode = sc.next();
				String courseName = sc.next();
				boolean isOffered = sc.nextBoolean();
				String instructor = sc.next();
				
				dd.courses.add(new Course(courseCode , courseName , isOffered , instructor));
				
				
				
				//dd.courses
			}
			else if ( choice == 11 ) {
				Iterator<Course> itr=dd.courses.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
			}
		 else if (choice == 2 ) {
				
			}
			else if (choice == 3 ) {
	
			}
			else if (choice == 4 ) {
	
			}
			else if (choice == 5 ) {
				break;
			}
			else {
				;
			}
			
		}
		
*/

	}
	

}
