package com.lti.serviceimplimentation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import com.lti.bean.Course;
import com.lti.bean.Student;
import com.lti.dummydata.DummyData;
import com.lti.dummydata.Relations;
import com.lti.service.SemesterRegistrationInterface;

public class SemesterRegistrationImpl implements SemesterRegistrationInterface {

DummyData dd = new DummyData();
	
	Relations rr = new Relations();
	

	public void dropCourse() {
		// TODO Auto-generated method stub

	}

	public void payfees() {
		// TODO Auto-generated method stub;
;
	}

	public void viewRegisteredCourses() {
		// TODO Auto-generated method stub

	}

	
	public void registerCourses(Student s, Course c) {
		addCourse(s, c);
		
	}

      public void addCourse(Student s , Course c) {
		int id = s.getStudentId();
		Set students = rr.stud_course.keySet();
		Iterator<Student> itr  = students.iterator();
		Set<Integer> student_ids = new HashSet<Integer>();
		while(itr.hasNext()) {
			student_ids.add(itr.next().getStudentId());
			
		}
		
		if(student_ids.contains(s.getStudentId())) { 
			LinkedList<Course> cl = rr.stud_course.get(s);
			cl.add(c);
			System.out.println("updated map");
			rr.stud_course.put(s, cl); // updated again ( may be not necessary ) 
			
		}
		else {
			LinkedList<Course> cl = new LinkedList<Course>();
			cl.add(c);
			rr.stud_course.put(s , cl);
			
		}
		
		//rr.stud_course.put(s, )
		
	}

}
