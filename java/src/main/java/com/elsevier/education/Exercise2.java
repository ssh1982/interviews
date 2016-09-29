package com.elsevier.education;

/**
 * TODO refactor the Car to use dependency injection of the engine TODO allow
 * use of either a gas engine or electric engine. TODO make sure we have no-op
 * implementations of both engines.
 */
public class Exercise2 {

	public static class Car {

		private Engine engine;

		/*
		 * Add engine argument to default constructor to pass certain engine
		 * type as a parameter
		 */
		public Car(Engine eng) {
			this.engine = eng;
		}

		public void moveForward() {
			this.engine.spinWheels();
		}
	}

	/*
	 * Declare contract interface for implementation different types of engines
	 */
	public interface Engine {
		void spinWheels();
	}

	/*
	 * Each engine type has to implement Engine interface
	 */
	public static class GasEngineImpl implements Engine {

		@Override
		public void spinWheels() {
			// no-op for now
		}
	}

	/*
	 * Each engine type has to implement Engine interface
	 */
	public static class ElectricEngineImpl implements Engine {
		@Override
		public void spinWheels() {
			// no-op for now
		}
	}

	/*
	 * Declare interface for engine injector
	 */
	public interface EngineInjector {
		Car getCar();
	}

	/*
	 * Implement injectors for both electric and gas engines
	 */
	public class GasEngineInjector implements EngineInjector {

		@Override
		public Car getCar() {
			return new Car(new GasEngineImpl());
		}

	}

	/*
	 * Implement injectors for both electric and gas engines
	 */
	public class ElectricEngineInjector implements EngineInjector {

		@Override
		public Car getCar() {
			return new Car(new ElectricEngineImpl());
		}

	}

}
