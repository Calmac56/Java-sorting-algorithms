

public class QuickSortMed {
	
	public static void sort(int[] A, int p, int r ) {
		if (p < r) {
			int q = Partition(A, p, r);
			sort(A, p, q-1);
			sort(A, q+1, r);
		}
	}
		
		public static int Partition(int [] A, int p, int r) {
			int x = medianPivot(A, p, r);
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
		
		public static int medianPivot(int [] A, int p, int r) {
			int mid = (r+p)/2;
			if (A[mid] < A[p]){
				swap(A, p, mid);
			}
			if(A[r] < A[p]) {
				swap(A, r,p);
			}
			if(A[mid] < A[r]) {
				swap(A, mid, r);
			}
			
			return A[r];
		}
		
		public static void swap(int [] A, int x, int i) {
			int temp = A[x];
			A[x] = A[i];
			A[i] = temp;
		}
		
}
