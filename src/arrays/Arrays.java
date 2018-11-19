package arrays;
import java.util.Random;

public class Arrays {
public static void main(String[] args) {
	String [] array = new String [10];
	array[0] = "ten";
	array[1] = "a";
	array[2] = "hello";
	array[3] = "chair";
	array[4] = "join";
	array[5] = "the";
	array[6] = "league";
	array[7] = "class";
	array[8] = "school";
	array[9] = "computer";
	
	String firstArray = "z";
	String lastArray = "a";
	for(int n = 0; n < array.length; n++) {
		for(int o = 0; o < array.length; o++) {
		 if(array[n].charAt(0) < firstArray.charAt(0) && array[n].charAt(0) > lastArray.charAt(0)) {
			 firstArray = array[n];
		 }
		}
	}
	
	
	for(int m = 0; m < array.length; m++) {
		if(array[m].contains("r")) {
			System.out.println("contains r: " +array[m]);
		}
	}
	for(int i = 0; i < array.length; i++) {
		System.out.println(array [i]);
	}
	int [] intArray = new int [100];
	Random num = new Random();
	for(int j = 0; j < intArray.length; j++) {
		intArray [j] = num.nextInt(500);
		System.out.println(intArray[j]);
	}
	int smallest = 49;
	for(int k = 0; k < intArray.length; k++) {
		if(intArray[k] < smallest) {
			smallest = intArray[k];
		}
	}
	System.out.println(smallest);
	int largest = 0;
	for(int l = 0; l <intArray.length; l++) {
		if(intArray[l] > largest) {
			largest = intArray[l];
		}
	}
	System.out.println("largest is:" +largest);
}
}
