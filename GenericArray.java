package generic_concept;

public class GenericArray {
	
	// use private modifier for encapsulation for pro work !
	
	private static Double doubleArray[] = {1.5D,1.6D,1.7D,2.5D};
	private static Float floatArray[] = {3.5F,3.6F,3.7F,3.5F};
	private static String stringArray[] = {"otto" , "yohan" , "tomas"};
	private static boolean booleanArray[] = {true , false , 0 == 0 , 0 ==-1} ;
	private static Character charArray[] = {'a','b','c','*'};
	private static char charArrayList[] = {'A','X','Y','Z'};
	 
	public static void main(String[] args) {
		
		// you can't use primitive data type
		// in this case charArray is an object of Character
		// but char is an primitive so you can add in generic function 
		// so you see an error
		//Oldfunction(charArrayList);
		
		function(doubleArray);
		Oldfunction(doubleArray);
		
	}
	
	// this is new way in for loop statement
	
	private static <Data> void function(Data[] d) {
		for(Data data : d) {
			System.out.println(data);
		}
	}
	
	
	//this is old way in for loop statement
	
	private static <Data> void Oldfunction(Data[] d) {
		for (int x = 0 ; x<d.length ; x++) {
			System.out.println(d[x]);
		}
	}

}
