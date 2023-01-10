/**
 * 
 */
package com.learn2cod.springFrameWork;

/**
 * @author HP
 *
 */
public class SingletonClassExample {

	private static SingletonClassExample instance;

	private SingletonClassExample() {

	}

	public static SingletonClassExample getInstance() {

		if (instance == null) {
			instance = new SingletonClassExample();
			
			System.out.println("In Singleton class ");
		}
		return instance;

	}

}
