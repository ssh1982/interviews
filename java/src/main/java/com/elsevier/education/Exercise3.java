package com.elsevier.education;

import java.util.*;

/**
 * can run with gradlew clean build; java -cp build/classes/main
 * com.elsevier.education.Exercise3 TODO We should be able to call people.add()
 * twice but end with only one object in it.
 */
public class Exercise3 {

	public static void main(String[] args) {

		Set<Person> people = new HashSet<>();

		Person p1 = new Person(1);
		people.add(p1);
		/*
		 * The following call of people.add(p1) will return false and HashSet
		 * will not be changed since p1 is the duplicate element, HashSet
		 * reflects math Set model and it doesn't allow duplicates
		 */

		people.add(p1);

		System.out.println(people.size());

	}

	public static class Person {
		// TODO Remove unused field
		// private static Random generator = new java.util.Random();
		private Integer id;

		public Person(int newId) {
			id = newId;
		}

		public int hashCode() {
			/*
			 * in the following case whenever id's are equal the hashcodes will
			 * be equal too, however, the way hashcode is generated may vary
			 */
			return 37 * id.hashCode();

			/*
			 * hashCode method must return the same value when id is the same,
			 * if multiplied to randomly generate value it will be returning
			 * different value every time it's invoked
			 */

			// return id * generator.nextInt();
		}

		public boolean equals(Object other) {
			return id.equals(((Person) other).id);
		}
	}
}
