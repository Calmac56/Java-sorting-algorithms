
public class QuickInSort {

	public static void sort(int[] A, int p, int r, int k ) {
		if (r-p > k) {
			int q = Partition(A, p, r);
			sort(A, p, q-1, k);
			sort(A, q+1, r, k);
		}
		else{
			InsertionSort(A, p, r);
		
		}
	}
	
	public static int Partition(int [] A, int p, int r) {
		int x = A[r];
		int i = p -1;
		for (int j = p; j < r ; j++) {
			if (A[j] <= x) {
				i += 1;
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
			
			
		}
		
		int temp1 = A[i+1];
		A[i+1] = A[r];
		A[r] = temp1;
		return i + 1;	
		}
	
	public static void InsertionSort(int[] A, int first, int size){
		for(int j = first+1; j<size+1; j++){
			int key = A[j];
			int i =  j-1;
			while(i>=0 && A[i] > key) {
				A[i+1] = A[i];
				i = i-1;
				A[i+1] = key;
			}
		}
	}
	

}
