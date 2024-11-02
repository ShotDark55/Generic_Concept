package generic_concept;

public class Generic {
	
	
public static void main(String[] args) {
		
		System.out.println("Generic way !!!!");
		
		Integer intArray [] = { 1 , 2 , 3 , 4 , 5 };
		Double doubleArray [] = { 1.5D , 1.7D , 2.5D , 3.5D , 9.9D };
		Character charArray [] = { 'A' , 'B' , 'C' , 'D' , 'S' };
		
		System.out.printf("\nOuput Double Array : ");
			display(doubleArray);
			
			
			System.out.printf("\nOuput Integer Array : ");
			display(intArray);
			
			
			System.out.printf("\nOuput Character Array : ");
			display(charArray);
						
	}
	
	public static <T> void display(T Array[]) {
		
		for( T element : Array ) {
			System.out.printf("%s - ", element);
		}
	}
	
	



}
