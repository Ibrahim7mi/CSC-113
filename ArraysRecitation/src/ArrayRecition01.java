import java.util.Scanner;

public class ArrayRecition01 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a value.");

		for (int i = 0; i < arr.length; i++)
			arr[i] = input.nextInt();

		// Compute the sum.
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];

		System.out.println("The sum of all numbers is: " + sum);

		// Compute the max.
		int max = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		System.out.println("The max is: " + max);

		// Odd and Even counters.
		int Odds = 0, Evens = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] % 2 == 0)
				Evens++;
			else
				Odds++;
		System.out.println("Number of odds are " + Odds + " and number of evens are " + Evens);

		// Separate negative and positive numbers into two different arrays.
		int arrPositive[] = new int[arr.length];
		int arrNegative[] = new int[arr.length];
		int j = 0, k = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] >= 0) {
				arrPositive[j] = arr[i];
				j++;
			} else {
				arrNegative[k] = arr[i];
				k++;
			}

	}

}
