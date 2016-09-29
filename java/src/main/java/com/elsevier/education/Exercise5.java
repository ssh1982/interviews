package com.elsevier.education;

/**
 * TODO: Turn the "Singleton" class into an actual singleton. The main() method
 * should still call .doSomething().
 */
public class Exercise5 {

	public static class Singleton {
		
		private static Singleton instance = null;
		
		/*
		 * Declare private default constructor to ensure that only 
		 * getInstance method can be used to create new instance
		 */
		private Singleton() {
			
		}
		/*
		 * Creates new instance if it doesn't exists
		 * and returns the only instance 
		 */
		public static Singleton getInstance() {
			if (Singleton.instance == null) {
				Singleton.instance = new Singleton();
			}
			return instance;
		}
		
		public void doSomeThing() {
			System.out.println("Doing something....");
		}
	}

	public static void main(String a[]) {
		Singleton st = new Singleton();
		st.doSomeThing();
		/*
		 * Singleton object should be created as follows
		 */
		Singleton st1 = Singleton.getInstance();
		st1.doSomeThing();
	}
}
