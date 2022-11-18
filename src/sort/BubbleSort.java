package sort;

public class BubbleSort {
	
	int array[] = {37,53,66,12,71,2,3,9,14,1,5};
	int value;
	
	public void sort() {
		//go through the array
		for(int i=0; i<array.length; i++) {
			
			//compare the values
			for(int j=0; j<(array.length-1); j++) {
				if(array[j]>array[j+1]) {
					value = array[j];
					array[j] = array[j+1];
					array[j+1] = value;
				}
			}
		}
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
