
public class InsertionSort {

	public static void sort(int[] A, int first, int size){
		for(int j = first+1; j<size+1; j++){
			int key = A[j];
			int i =  j-1;
			while(i>=0 && A[i] > key) {
				A[i+1] = A[i];
				i = i-1;
				
			}
			A[i+1] = key;
		}
	}
}
