/**
 * 
 */
package com.lti.bean;

import java.util.Date;

/**
 * @author user254
 *
 */
public class Admin {

	private Date doj;

	/**
	 * @return the doj
	 */
	public Date getDoj() {
		return doj;
	}

	/**
	 * @param doj the doj to set
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Admin [doj=" + doj + "]";
	}
	
}
