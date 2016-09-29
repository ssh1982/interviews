package com.elsevier.education;

/**
TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		/*
		 * The increment ++ is not atomic operation 
		 * thus increment() is not thread-safe, 
		 * either synchronized needs to be added to method declaration to fix this
		 * or change count type to AtomicInteger and invoke getAndIncrement() method 
		 * to return incremented value
		 */
		public int increment() {
			return ++count;
		}
		/*
		 * Reading primitives is an atomic operation therefore it's thread safe
		 */
		public int getCount() {
			return count;
		}
		/*
		 * Writing to primitives is an atomic operation therefore it's thread safe
		 */
		public void resetCount() {
			count = 0;
		}

	}
}
