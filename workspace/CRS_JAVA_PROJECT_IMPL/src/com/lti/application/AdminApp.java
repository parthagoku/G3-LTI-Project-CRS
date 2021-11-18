package com.lti.application;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.lti.bean.Admin;
import com.lti.dummydata.Relations;

public class AdminApp {
	
	public void adminOpp()
	{
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("======Sub-menu for Admin==========");
			System.out.println("Enter 100 to create admin ");
			System.out.println("Enter 101 to see existing admins ");
			System.out.println("Enter 102 to exit ");
			int choice_admin = new Scanner(System.in).nextInt();
			
			if(choice_admin == 102 ) {
				break;
			}
			if ( choice_admin == 100) {
			
			// create admin
			System.out.println("Enter user id");
			System.out.println("Enter user name");
			System.out.println("Enter user role");
			System.out.println("Ener password ");
			int id = sc.nextInt();
			String name = sc.next();
			String role = sc.next();
			String pass = sc.next();
			//Date date = sc.next();
			Admin admin = new Admin(id , name , role);
			Relations rr = new Relations();
			rr.admin_pass.put(admin , pass);
			
		}
		
		else if ( choice_admin == 101 ) {
			Relations rr = new Relations();
			//Map.Entry<Admin, String > x =  (Entry<Admin, String>) rr.admin_pass.entrySet();
			Set<Admin> admins = rr.admin_pass.keySet();
			Iterator<Admin> itr = admins.iterator();
			while(itr.hasNext()) {
				Admin a = itr.next();
				System.out.println(a + " " + rr.admin_pass.get(a));
				
			}
		
			// show list of admins
		}
	} //
	}

}
