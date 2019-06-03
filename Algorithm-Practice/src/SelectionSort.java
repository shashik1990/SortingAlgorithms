/*
 * Unlike Bubble sort in selection sort we do not swap elements in every comparison,
 * but only swap after comparing all values and finding largest number
 * 
 * Here we start from Index 0 which we consider as the largest element at the beginning
 * and then take compare it with [current index +1]
 * If the [current index +1] is bigger than largest then replace index number of largest to [current index +1] 
 *  and similarly after comparing all the elements swap the largest elemnt with the lastUnsortedIndex.
 *  decrement the  lastUnsortedIndex after every swap
 *  
 *  
 *  Selection Sort is again a quadratic algorithm O(n^2) because each loop is n and since we have two loops it's  n^n(n^2)
 */
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] myArray = selectionSort(new int[] {9,8,3,13,87,12,99});
		
		for(Integer i : myArray) {
			System.out.print(i + " ");
		}
	}
	
	
	public static int[] selectionSort(int a[]) {
		int indexValToReplace = -1;
		for(int i=0;i<a.length;i++) {
			int minimum = i;
			for(int j =i+1;j<a.length;j++) {
			if(a[j] < a[minimum]) {
			 minimum = j;
			} 
			}
			int temp = a[i];
			a[i] = minimum;
			a[minimum] = temp;
		}
		
		return a;
		
	}

}
