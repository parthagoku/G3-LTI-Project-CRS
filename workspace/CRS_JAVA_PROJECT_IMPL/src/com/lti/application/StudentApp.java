/**
 * 
 */
package com.lti.application;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.lti.bean.Course;
import com.lti.bean.Student;
import com.lti.dummydata.DummyData;
import com.lti.dummydata.Relations;
import com.lti.serviceimplimentation.CatalogImpl;
import com.lti.serviceimplimentation.StudentInterfaceImpl;

/**
 * @author user254
 *
 */
public class StudentApp {

	/**
	 * @param args
	 */
	CatalogImpl ci=new CatalogImpl();
	DummyData dd = new DummyData();
	Relations rr=new Relations();
	StudentInterfaceImpl sii=new StudentInterfaceImpl();
	public void studentOpp() {
		
		dd.initializeDummy();
		
		// entry point
		while(true) {
			Scanner sc = new Scanner(System.in);
			//System.out.println("Enter 100 to View courses ");
			System.out.println("Enter 1 to add courses ");
			System.out.println("Enter 11 to show courses ");
			
			System.out.println("Enter 2 to Drop Course ");
			System.out.println("Enter 3 view Grades");
			System.out.println("Enter 4 to Make Payment ");
			System.out.println("Enter 10 to exit ");
			int choice = sc.nextInt();
			if (choice == 1 ) {
				System.out.println("Enter course code");
				System.out.println("Enter course name");
				System.out.println("Course Offered");
				System.out.println("Ener instructor");
				String courseCode = sc.next();
				String courseName = sc.next();
				boolean isOffered = sc.nextBoolean();
				String instructor = sc.next();
				
				dd.courses.add(new Course(courseCode , courseName , isOffered , instructor));
				
				
				
				//dd.courses
			}
			else if ( choice == 11 ) {
				Iterator<Course> itr = dd.courses.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
			}
			else if (choice == 2 ) {
				
				ci.deleteCourse();
				/*System.out.println("Enter StudentId");
				String StudentId = sc.next();
				System.out.println("Enter Branch");
				String Branch = sc.next();
				System.out.println("Enter batch");
				String batch = sc.next();
				System.out.println("Enter courseName");
				String courseName = sc.next();
				System.out.println("Enter courseCode");
				String courseCode = sc.next();
				
				
				dd.students.add(new Student(Integer.parseInt(StudentId), Branch, Integer.parseInt(batch),courseName,courseCode));
				*/
				
			}
			else if (choice == 100 ) {
			//ci.viewCourseDetails();
			}
				
			else if (choice == 3 ) {
				//System.out.println("Hii");
				sii.viewGradeCard();
				/*Iterator<Student> itr = dd.students.iterator();
				
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}*/
				
				
			}
			else if (choice == 4 ) {
	
			}
			else if (choice == 5 ) {
				break;
			}
			else {
				System.exit(0);
			}
			
		}
		

	}

}
