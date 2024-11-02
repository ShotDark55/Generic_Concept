package generic_concept;

public class GenericBetterThenPolymorphism {
	
	// generic is big shortcut here so 
	// just type one function better then type 10 or more function 
	// generic also give you to add object if you want 

	
	
	// this is object 
	// so object work like generic 
	// but generic large then object
 
	public void show(Object data) {
		System.out.println(data);
	}
	
	
	
	// you can add more generic data or parameter
	
	public <Data1,Data2> void display(Data1 data1 , Data2 data2) {
		System.out.println("data 1 : " + data1);
		System.out.println("data 2 : " + data2);
	}
	
	
	// this is generic 
	
	public <Data> void display(Data data) {
		System.out.println(data);
	}
	
	
	
	// this is polymorphism function
	
	public void display(String data) {
		System.out.println(data);
	}
	
	
	public void display(int data) {
		System.out.println(data);
	}
	
	
	public void display(double data) {
		System.out.println(data);
	}
	
	
	public void display(boolean data) {
		System.out.println(data);
	}
	
	

}
