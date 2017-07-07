package BinarySearchDemo;

import java.util.Scanner; 

public class AssignmentDemo {

	public static void main(String[] args) {
		
		int x, y, z, a[], first, last, mid;

		Scanner in = new Scanner(System.in); // here by taking input from user
		System.out.println("Enter number of elements in array:");
		y = in.nextInt();

		a = new int[y]; // here by creating array

		System.out.println("Enter the integers");

		for (x = 0; x < y; x++) //here by took Loop to store numbers into array
			a[x] = in.nextInt();

		System.out.println("\nEnter the integer to be search:");
		z = in.nextInt();

		first = 1;
		last = a.length; // here finding the length of array and assign into high

		mid = first + ((last - first) / 2); // finding the middle position and assign into mid
											
		

		for (first = 1; first < last; first++) // applying for-loop

		{
			if (a[mid] < x) 

			
				mid = mid + 1;
			 else if (a[mid] > z)
									

			{
				mid = mid - 1;
			} else if (a[mid] == z) { // Searching element in the array
				System.out.println("Integer is found");
				break; // if the element is found break this loop
			} else 
				last = mid - 1;
			
			mid = (first + last) / 2;
		}
		if (first > last)
			System.err.println("Integer is not found");

	}

}
