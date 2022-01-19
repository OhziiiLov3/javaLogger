package javaLogger;
//Garbage collection is an automatic memory management system by Java, it allocates memory to the heap
 
class Dog {
	
	private String name;
	
	public Dog (String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}

}

public class garbageCollection {
	
	private static Dog d4;
	public static void main(String[] args) {
		Dog d1 = new Dog("Zooty");
		Dog d2 = new Dog("Cali");
		Dog d3 = new Dog("Zoey");
		Dog d4 = new Dog("Koko");
		
		d3 = new Dog("Fefe");
//		Cali is pushed to the garbage collector as we add a new object called
		System.out.println(d3);
		
	}
}
