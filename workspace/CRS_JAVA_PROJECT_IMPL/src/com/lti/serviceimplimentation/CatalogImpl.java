/**
 * 
 */
package com.lti.serviceimplimentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lti.bean.Course;
import com.lti.dummydata.DummyData;
import com.lti.service.CatalogInterface;

/**
 * @author user254
 *
 */
public class CatalogImpl implements CatalogInterface {

	/* (non-Javadoc)
	 * @see com.lti.service.Catalog#addCourse()
	 */
	public void addCourse() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.lti.service.Catalog#deleteCourse()
	 */
	public void deleteCourse() {
		System.out.println("Enter Course ID to drop the Course");
		Scanner sc=new Scanner(System.in);
		String c_id=sc.nextLine();
		DummyData dd=new DummyData();
		List<Course> clist=dd.courses;
		for(int i=0;i<clist.size();i++)
		{
			if (c_id.equals(clist.get(i).getCourseCode()))
			{
				//System.out.println("hii");
				clist.remove(i);
				System.out.println("Removed Successfully!");
				viewCourseDetails();
			}
			
		}

	}

	/* (non-Javadoc)
	 * @see com.lti.service.Catalog#viewCourseDetails()
	 */
	public void viewCourseDetails() {
		
		DummyData dd=new DummyData();
		System.out.println("Course List Details:");
		List<Course> list=new ArrayList<Course>();
		list=dd.courses;
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}

}
