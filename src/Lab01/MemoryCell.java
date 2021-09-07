package Lab01;

public class MemoryCell<AnyType> {
	// Private internal data representation
	private AnyType storedValue;
	//*** ADD YOUR CODE HERE ***//
	
	
	public static void main(String[] args) {
		MemoryCell<String> mc1; // mc1 is a reference to an object of type MemoryCell that holds a String
		MemoryCell<Integer> mc2; // mc2 holds an Integer
		MemoryCell<Double> mc3; // mc2 holds a Double

		// memory allocation for mc1 - call to no argument constructor
		mc1 = new MemoryCell<String>();
		// call of method write to set the stored value
		mc1.write("This is a String");

		mc2 = new MemoryCell<Integer>();
		mc2.write(12345);

		mc3 = new MemoryCell<Double>();
		mc3.write(1234.567);

		System.out.println("This is a generic java class example");
		// call of method read to get and print the storedvalue
		System.out.println("mc1 holds a String:\t" + mc1.read());
		System.out.println("mc2 holds an Integer:\t" + mc2.read());
		System.out.println("mc3 holds a Double:\t" + mc3.read());

		/** Array of generic instances **/
		System.out.println("=========================================");
		// an array of 5 MemoryCell that hold unknown type of objects
		MemoryCell<?> arr[] = new MemoryCell[5];

		// the second constructor is used to instantiate these objects and store them in
		// the array
		arr[0] = new MemoryCell<String>("String0");
		arr[1] = new MemoryCell<Integer>(10);
		arr[2] = new MemoryCell<Double>(123.567);

		for (int i = 3; i < 5; i++) {
			arr[i] = new MemoryCell<String>("String " + i);
		}

		System.out.println("Start printing array");
		for (int i = 0; i < 5; i++) {
			System.out.println("array[" + i + "] holds:\t" + arr[i].read() + " " + arr[i].read().getClass().getName());
		}
		System.out.println("=========================================");
		// an array of 5 MemoryCell that hold unknown type of objects
		MemoryCell<? extends Number> arr2[] = new MemoryCell[5];

		// the second constructor is used to instantiate these objects and store them in
		// the array
		// arr2[0] = new MemoryCell<String>("String0"); // ERROR
		arr2[1] = new MemoryCell<Integer>(10);
		arr2[2] = new MemoryCell<Double>(123.567);

		for (int i = 3; i < 5; i++) {
			// arr2[i] = new MemoryCell<String>("String " + i); //ERROR
		}

		System.out.println("Start printing array2");
		for (int i = 1; i < 3; i++) {
			System.out
					.println("array[" + i + "] holds:\t" + arr2[i].read() + " " + arr2[i].read().getClass().getName());
		}
	}
}
