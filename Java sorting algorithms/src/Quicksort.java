
public class Quicksort {

	public static void sort(int[] A, int p, int r ) {
		if (p < r) {
			int q = Partition(A, p, r);
			sort(A, p, q-1);
			sort(A, q+1, r);
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
	
	
	
	

}
