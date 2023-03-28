import java.util.Scanner;

public class ArrayMinMax
{
	public static void main(String args[]) {
		int size = Integer.parseInt(args[0]);
		System.out.print("\nSize of Array is: " + size);
		int[] arr = new int[size];   // Declare an array variable
		Scanner reader = new Scanner(System.in);
		System.out.print("\nEnter the elements of the array --------");
		for(int i = 0; i < size; i++  )
		{
			System.out.print("\nEnter the "+ (i+1) + " element = ");
			arr[i] = reader.nextInt();
		}
		System.out.print("\nEntered array is ----------\n");
		for (int i = 0; i < size ;i++)
		{
			System.out.print("\t"+arr[i]);
		}
		// Code for finding Maximum and Minimum by appliyning linear search
		int max = arr[0];
		int min = arr[0];
		for(int i = 1; i<size; i++)
		{
			if (max<arr[i])
			{
				max = arr[i];
			}
			if (min>arr[i])
			{
				min = arr[i];
			}
		}
		System.out.print("\nMaximum of the array is: " + max);
		System.out.print("\nMinimum of the array is: " + min);
	}
}
output:
Size of Array is: 6
Enter the elements of the array --------
Enter the 1 element = 5

Enter the 2 element = 7

Enter the 3 element = 88

Enter the 4 element = 63

Enter the 5 element = 58

Enter the 6 element = 12

Entered array is ----------
        5       7       88      63      58      12
Maximum of the array is: 88
Minimum of the array is: 5
