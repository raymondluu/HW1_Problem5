/*
 * Raymond Luu
 * TCSS 343
 * 4/7/2014
 * Homework 1 Problem 5
 */
public class HW1_Problem5 {
	
	/**
	 * Main method
	 * 
	 * @param args console input.
	 */
	public static void main(String[] args) {
		// To hold all numbers. Modify to use other lists of numbers.
		int[] numbers = {3, 4, 5, 8, 9};
		// Size of array. Modify according to the above array size.
		int array_size = 5;
		// To hold sum(K). Modify to find a different sum.
		int sum = 13;
		
		boolean valid = problem5(numbers, array_size, sum);
		
		System.out.println("This array has a pair (a,b) that sums up to the value K: " + valid);
	}
	
	/**
	 * Method to solve problem 5 in Homework 1
	 * 
	 * @param input array of numbers.
	 * @param K sum to look for with pair of numbers (a,b) in array.
	 * @return true if pair exists and false otherwise.
	 */
	public static boolean problem5(int []input, int size, int K)
	{
		int left_index = 0;
		int right_index = size - 1;
		int current_sum = 0;
		boolean valid = false;
		
		while(left_index < right_index)
		{
			current_sum = input[left_index] + input[right_index];
			
			if (current_sum == K)
			{
				valid = true;
				left_index = right_index;
			}
			else if (current_sum < K)
			{
				left_index++;
			}
			else
			{
				right_index--;
			}
		}
		return valid;
	}

}
