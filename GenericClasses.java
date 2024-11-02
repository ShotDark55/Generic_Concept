package generic_concept;

public class GenericClasses <T1>{
	
public static void main(String[] args) {
		
		System.out.println("Classes Generic way !!!!");
		
		Integer intArray [] = { 1 , 2 , 3 , 4 , 5 };
		Double doubleArray [] = { 1.5D , 1.7D , 2.5D , 3.5D , 9.9D };
		Character charArray [] = { 'A' , 'B' , 'C' , 'D' , 'S' };
		
		Space<Object> space = new Space<>();
		
		
		System.out.printf("\nOuput Double Array : ");
			space.display(doubleArray);
			
			
			System.out.printf("\nOuput Integer Array : ");
			space.display(intArray);
			
			
			System.out.printf("\nOuput Character Array : ");
			space.display(charArray);
						
	}


	public static class Space <T1> {
		
		public void display(T1 Array[]) {
			
			for( T1 element : Array ) {
				System.out.printf("%s - ", element);
			}
		}
	}

	
	
	
	
	
	
	



}
