/*
 * Merge sort is usually implemented using recursion.
 * It uses Divide and conquer where you split an array into smaller arrays 
 * 
 * It has two major phases : 
 * --- 1. Splitting phase - It is a preparation phase to make sorting faster during merging phase.
 * 		The splitting is logical and we DONT create the new arrays to keep track of where the array has split.
 * --- 2. Merging phase - We do sorting during this phase
 * 
 * We merge sibling left and right array.  
 * 
 * It is NOT an in-Place array since it uses temporary arrays.
 * ---But since these days memory is cheap and plentiful so it's better to focus on TIME COMPLEXITY than on SPACE COMPLEXITY.
 *  But if memory is an issue then you should think before using Merge sort. 
 * ---We create a TEMP ARRAY large enough to hold 
 * ---all the elements we are merging
 * 
 * TIME COMPLEXITY - O(nlogn) -base 2 - Because we are repeatedly dividing the array in half during splitting
 *  
 * we set 'i' to the first index of LEFT ARRAY and 'j' to the first index of RIGHT ARRAY and then
 * ---we compare left[i] with right[j]. If left is smaller, we copy it to the TEMP ARRAY and increment 'i' by 1.
 * ---if right is smaller we copy right to the TEMP ARRAY and increment 'j' by 1. 
 * ---So, if we kkeep doing this then finally the temporary array will have all sorted values.
 * ---After all this we have to copy this temp array BACK TO the array that w are sorting
 * 
 */
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22 };
		
		mergeSort(intArray, 0 , intArray.length);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	
	}

	/*
	 * We would call this method recursively, and since for recursion we need a breaking 
	 * condition, so we break out of recursion when this method is called with one element array 
	 * because there is nothing to be done with one element array since it is sorted
	 */
	private static void mergeSort(int[] input, int start , int end) {
		/*
		 * If we have only one element do following because 1 element means it's already sorted
		 */
		if(end - start < 2) 
			return;
		
		
		/*
		 * If we have two or more element then do the LOGICAL PARTISIONING.
		 * For first invocation start - 0 AND end - 7    
		 */
		
		int mid  = (start + end ) / 2;
		/*
		 * LEFT SORTING
		 * As said earlier we are going to use the SAME array because it's just the LOGICAL PARTITIONING 
		 */
		mergeSort(input, start, mid);
		/*
		 * RIGHT ARRAY SORTING
		 */
		mergeSort(input, mid, end);
		/*
		 * Merging LEFT and RIGHT array
		 */
		merge(input, start, mid, end);
	}

	
	/*
	 * We know that WE ARE MERGING the SORTED elements. 
	 * So, left partition is sorted and similarly right is sorted before coming to this step
	 */
	private static void merge(int[] input, int start ,int mid,  int end) {
		// TODO Auto-generated method stub
		/*
		 * We know that WE ARE MERGING the SORTED elements. 
		 * So, left partition is sorted and similarly right is sorted before coming to this step
		 * intArray[mid] is the first element in RIGHT PARTITION and intArray[mid-1] is the last element in LEFT PARTITION
		 * So, we don't need to do any merging since they are already sorted.
		 * This is a very good optimization 
		 */
		if(input[mid-1] <= input[mid])
			return;
		
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		
		
		int [] temp =  new int[end - start];
		while(i < mid && j < end) {
			temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++]; 
		}
		
		
		System.arraycopy(input, i, input, start + tempIndex, mid -1);
		System.arraycopy(temp, 0, input, start, tempIndex);
		
	}
	
	
	
	

}
