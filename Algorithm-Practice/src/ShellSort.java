/*
 * It is a variation of insertion sort.
 * Usually  INSERTION SORT chooses which element to insert using a GAP VALUE of 1,
 * BUT SHELL SORT, as the algorithm runs the gap is reduced
 * 
 *  GOAL is to reduce the amount of shifting required, 
 *  ---so the gap value starts reducing and eventually when the gap value becomes 1 it behaves as an insertion sort
 *  
 *   There are many gap calculation techniques and the one we are using is Knuth SEQUENCE.
 *   ---(3^k-1)/2	- k is based on length of an array
 *   ---We want the gap to be as close as possible to the length of the array we want to sort,
 *   ---without being greater than the length
 *   
 *   It is difficult to nail down the time complexity of shell sort bcoz it will depend on the gap.
 *   WORST CASE : O(n^2) but it performs much better than that.
 *   It is an unstable algorithm because there is possibility of shifting DUPLICATE elements
 *   	 
 */
public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int [] myArray = shellSort(new int[] {20,35, -15, 7,55,1,-22});
		
		for(Integer i : myArray) {
			System.out.print(i + " ");
		}

	}

	private static int[] shellSort(int[] a) {
		/* If you see all logic is almost similar to Insertion sort 
		except the first loop where at the place of unsortedIndex=1 we are taking gap 
		*/
		for(int gap = a.length/2; gap > 0;gap /= 2) {
			
			for(int i=gap;i<a.length;i++) {
				int newEelement = a[i];
				int j = i;
				
				while(j>=gap && a[j - gap] > newEelement) {
					a[j] = a[j - gap];
					j -= gap;
				}
				a[j] = newEelement;
			}
		}
		
		return a;
	}

}
