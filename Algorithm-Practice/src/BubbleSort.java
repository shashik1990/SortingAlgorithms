
/*
 * Bubble sort has a time complexity of O(n^2) this is calculated based on number of loops that we are using.
 * So, if you have one loop then it's a LINEAR TIME COMPLEXITY O(n) 
 *     if you have two loop then it's a QUADRATIC TIME COMPLEXITY O(n^n) 
 *     
 */
public class BubbleSort {
	
	
	public static void sortWithBubble(int[] arr) {
		
		int maxIndex = arr.length-1;
		
		for(int i=0;i<arr.length;i++) {
			
			
			for(int j=0;j<maxIndex;j++) {
				
				//Don't change anything if arr[j] is equal to arr[j+1] or  arr[j] less than arr[j+1]
				if(arr[j] == arr[j+1] || arr[j] < arr[j+1]) 
					continue;
				
				//  Swap values if arr[j] is greater than arr[j+1]
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
			// Reduce the maxIndex after every iteration of 'j' so that we sort only unsorted part of an array
			--maxIndex;
		}
		System.out.print("Sorted Array : ");
		for(int i=0;i<arr.length;i++) 
			System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {20,35, -15, 7,55,1,-22};
		
		sortWithBubble(arr);
		
		

	}

}
