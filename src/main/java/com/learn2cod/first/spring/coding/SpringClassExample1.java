/**
 * 
 */
package com.learn2cod.first.spring.coding;

/**
 * @author HP
 *
 */
public class SpringClassExample1 {

	String courseName =null;

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void display() {
		System.out.println("Welcome to "+ courseName);
	}
	
}
