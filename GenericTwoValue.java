package generic_concept;

public class GenericTwoValue {
	
public static void main(String[] args) {
		
		System.out.println("Generic two or more value way !!!!");
		
		Integer intArray [] = { 1 , 2 , 3 , 4 , 5 };
		Double doubleArray [] = { 1.5D , 1.7D , 2.5D , 3.5D , 9.9D };
		Character charArray [] = { 'A' , 'B' , 'C' , 'D' , 'S' };
		
		System.out.printf("\nOuput Double Array : ");
			display(doubleArray,doubleArray);
			
			
			System.out.printf("\nOuput Integer Array : ");
			display(intArray,intArray);
			
			
			System.out.printf("\nOuput Character Array : ");
			display(charArray,doubleArray);
						
	}
	
	public static <T , T2> void display(T Array[] , T2 Array2[] ) {
		System.out.println("\nvalue 1 : ");
		
		for( T element : Array ) {
			System.out.printf("%s - ", element);
		}
		
		System.out.println("\nvalue 2 : ");
		
		for( T2 element : Array2 ) {
			System.out.printf("%s * ", element);
		}
		
		
	}
	
	



}
