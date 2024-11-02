package generic_concept;

public class GenericClassOldMethod <T> {

public static void main(String[] args) {
		
		System.out.println("newBagdad Generic way !!!!");
		System.out.println("just need cast or type T element like object");
		System.out.println("so java suggest to do this way");
		Integer intArray [] = { 1 , 2 , 3 , 4 , 5 };
		Double doubleArray [] = { 1.5D , 1.7D , 2.5D , 3.5D , 9.9D };
		Character charArray [] = { 'A' , 'B' , 'C' , 'D' , 'S' };
		
		GenericClassOldMethod<Object> main = new GenericClassOldMethod<>();
		
		System.out.printf("\nOuput Double Array : ");
			main.display(doubleArray);
			 // new Main().display(charArray);
			
			System.out.printf("\nOuput Integer Array : ");
			main.display(intArray);
			 // new Main().display(charArray);
			
			System.out.printf("\nOuput Character Array : ");
			main.display(charArray);
			
			// new Main().display(charArray);
						
	}
	
	public void display(T Array[]) {
		
		for( T element : Array ) {
			System.out.printf("%s - ", element);
		}
	}
	
	

	
}

