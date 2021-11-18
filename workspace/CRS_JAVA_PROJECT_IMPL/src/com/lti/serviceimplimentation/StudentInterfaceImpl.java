package com.lti.serviceimplimentation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.lti.bean.Student;
import com.lti.dummydata.Relations;
import com.lti.service.StudentInterface;

public class StudentInterfaceImpl implements StudentInterface {
	


	public void changePassword() {
		// TODO Auto-generated method stub

	}

	public void register() {
		// TODO Auto-generated method stub

	}

	
	public void viewGradeCard() {
		
			System.out.println("Enter Student id to view Grade: ");
			Scanner sc=new Scanner(System.in);
			int s_id=sc.nextInt();	
			Relations rr=new Relations();
			Set students = rr.stud_set_grade.keySet();
			//Set String=rr.stud_set_grade.v
			Iterator<Student> itr  = students.iterator();
			Set<Integer> student_ids = new HashSet<Integer>();
			while(itr.hasNext()) {
				//System.out.println("hiii....");
				Student stud_temp=itr.next();
				if(stud_temp.getStudentId()==s_id)
				{
					System.out.println(rr.stud_set_grade.get(stud_temp));
				}
				else
				{
					System.out.println("Student doesn't exist in repo....");
				}
				//student_ids.add(itr.next().getStudentId());
				
			}
			
			/*for(Map.Entry map : rr.stud_set_grade.entrySet())
			{
				//System.out.println("hiii");
				Student key = (Student)map.getKey();
				String value=(String)map.getValue();
				if(key.getStudentId()==s_id)
				{
					System.out.println("Grade is : "+value+"for the Student: "+key);
				}
				
			}*/
		}

	}
	


