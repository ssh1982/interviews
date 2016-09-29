package com.elsevier.education;

import java.util.Set;

/**
 * TODO: Make this class immutable.
 */

public class Exercise1 {

	public final static class Person {

		/*
		 * All fields should be private and final to prevent any accidental
		 * change
		 */
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		/*
		 * Make the default constructor private and return instance via factory
		 * method
		 */
		private Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		/*
		 * Use factory method to return instance
		 */
		public static Person getNewInstance(Set<String> phoneNumbers, String firstName, String lastName) {
			return new Person(phoneNumbers, firstName, lastName);
		}

		/*
		 * Make all methods final so they cannot be overridden String is
		 * immutable class so we can return set of String as-is
		 */
		public final Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}

		/*
		 * Immutable class shouldn't have setters that can modify it's fields as
		 * long as setters can change the state of object. Commented all setter
		 * methods
		 */
		// public void setPhoneNumbers(Set<String> newPhoneNumbers) {
		// phoneNumbers = newPhoneNumbers;
		// }

		/*
		 * Make all methods final so they cannot be overridden String is
		 * immutable class so we can return it as-is
		 */
		public final String getFirstName() {
			return firstName;
		}

		/*
		 * Commented all setter methods
		 */
		// public void setFirstName(String newName) {
		// firstName = newName;
		// }

		/*
		 * Make all methods final so they cannot be overridden String is
		 * immutable class so we can return it as-is
		 */
		public final String getLastName() {
			return lastName;
		}

		/*
		 * Commented all setter methods
		 */
		// public void setLastName(String newName) {
		// lastName = newName;
		// }
	}

}
