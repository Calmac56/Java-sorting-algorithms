
public class threewayquick {

	public static void sort(int[] A, int p, int r ) {
		if (p < r) {
			int i = 0;
			int j = 0;
			int[] x = Partition(A, p, r, i ,j);
			
			sort(A, p, x[0]);
			sort(A, x[1], r);
		}
	}
	
	public static int [] Partition(int A[], int p, int r, int i, int j) {
		if (r - p <= 1) {
			if (A[r] < A[p]) {
				swap(A, r,p);
			}
			i = p;
			j = r;
			
		}
		int mid = p;
		int pivot = A[r];
		while (mid <= r) {
			if (A[mid] < pivot) {
				swap(A, p, mid);
				p += 1;
				mid +=1;
			}
			else if (A[mid] == pivot) {
				mid += 1;
				
			}
			else {
				swap(A, mid, r);
				r = r -1;
			}
		}
		
		i = p -1;
		j = mid;
		int [] f = {i,j};
		
		return f;
	}
	
	public static void swap(int [] A, int x, int i) {
		int temp = A[x];
		A[x] = A[i];
		A[i] = temp;
	}
	
	
}
