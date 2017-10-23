import java.util.Scanner;

public class OddOrEvenIndex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int arraySize,evenNumbersCount,oddNumbersCount;
		evenNumbersCount = oddNumbersCount = 0;
		
		System.out.println("Enter array size:");
		arraySize = scan.nextInt();
		
		int [] array = new int[arraySize];
		
		System.out.println("Enter array elements:");
		for ( int i = 0 ; i < arraySize ; i++ ) {
			array[i] = scan.nextInt();
			
			if(array[i]%2 == 0)
				evenNumbersCount++;
		}
			
		oddNumbersCount = arraySize - evenNumbersCount;
		
		int [] evenElementsArray = new int[evenNumbersCount];
		int [] oddElementsArray = new int[oddNumbersCount];
		
		int evenCount,oddCount;
		evenCount = oddCount = 0;
		
		for ( int j = 0 ; j < arraySize ; j++ ) {
			
			
			
			if( array[j]%2 == 0 ) {
				evenElementsArray[evenCount] = array[j];
				evenCount++;
			}
			else {
				oddElementsArray[oddCount] = array[j];
				oddCount++;
			}
		}
		
	
		evenCount = oddCount = 0;
		
		for ( int k = 0 ; k < arraySize ; k++ ) {
			
			
			if( k%2 == 0 ) {
				array[k] = evenElementsArray[evenCount];
				evenCount++;
			}
			else {
				array[k] = oddElementsArray[oddCount];
				oddCount++;
			}
			
		}
		
		for ( int j = 0 ; j < arraySize ; j++ ) 
			System.out.println(array[j]);
			
		
		scan.close();
	}
}
