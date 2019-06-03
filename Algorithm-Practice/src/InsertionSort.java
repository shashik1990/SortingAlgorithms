/*
 * Insertion Sort is a QUADRATIC SORT ALGORITHM. 
 * This algorithm like Bubble and selection partitions an Array into sorted and unsorted partitions
 * but in this algorithm we consider left part as sorted and element from position 1 until the end are right unsorted
 * and then we take 
 * At end of first iteration, the first two elements would be sorted.
 * 
 * HERE WE DONT SWAP ELEMENTS, WE ONLY SHIFT THEM
 * 
 * 
 * Disadvantage : This algorithm involves a lot of shifting if biggest element is at the right most side
 * Advangtage : As we said this algo is Quadratic but if algo. is nearly sorted then it runs in almost linear time and it does that the because of less shifting
 */
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] myArray = insertionSort(new int[] {20,35, -15, 7,55,1,-22});
		
		for(Integer i : myArray) {
			System.out.print(i + " ");
		}
	}
	
	
	
	public static int[] insertionSort(int a[]) {
		for(int unsortedIndex=1;unsortedIndex<a.length;unsortedIndex++) {
			// save unsorted value so that it can be placed in sorted array after completion of inner loop
			int nuwElement = a[unsortedIndex];
			int j;
			/*=
			 * Iterate over sorted portion of Array to put unsorted array's value at correct sorted position
			 */
			for( j=unsortedIndex; j>0 && a[j-1] > nuwElement; j--) {
				//HERE WE DONT SWAP ELEMENTS, WE ONLY SHIFT THEM
			a[j] = a[j - 1];
		}
			// After looping and comparing all elements of sorted array, we put our unsorted element into sorted array at expected position
			a[j] = nuwElement;
			
		}
		
		return a;
		
	}

}
