package arrays;

import java.util.Random;
//Keith
public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] array = new String [5];
		array[0] = "hi";
		array[1] = "hello";
		array[2] = "world";
		array[3] = "computer";
		array[4] = "keyboard";
		//2. print the third element in the array
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2] = "robot";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//6. make an array of 50 integers
		int [] intArray = new int [50];
		//7. use a for loop to make every value of the integer array a random number
		Random num = new Random();
		for(int j = 0; j < intArray.length; j++) {
			intArray [j] = num.nextInt(50);
			System.out.println(intArray[j]);
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = 49;
		for(int k = 0; k < intArray.length; k++) {
			if(intArray[k] < smallest) {
				smallest = intArray[k];
			}
		}
		System.out.println("smallest: "+smallest);
		//9 print the entire array to see if step 8 was correct
		for(int m : intArray) {
			System.out.println(m);
		}
		//10. print the largest number in the array.
		int largest = 0;
		for(int l = 0; l <intArray.length; l++) {
			if(intArray[l] > largest) {
				largest = intArray[l];
			}
		}
		System.out.println("largest is:" +largest);
	}
}
