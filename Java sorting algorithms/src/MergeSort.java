
public class MergeSort {

	public static void sort(int A[], int p, int r) {
		if (p < r) {
			int q = (p+r)/2;
			sort(A,p,q);
			sort(A, q+1, r);
			merge(A, p, q, r);
		}
	}
	
	public static void merge(int[] A, int p, int q, int r) {
		int leftArray [] = new int[q-p+1];
		int rightArray [] = new int[r -q];
		
		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = A[p +i];
		}
		for (int i = 0; i < rightArray.length; i++) {
			rightArray[i] = A[q + i +1];
		}
		
		int leftIndex = 0;
		int rightIndex = 0;
		
		
		for (int i = p; i < r + 1; i++) {
			if(leftIndex < leftArray.length && rightIndex < rightArray.length) {
				if(leftArray[leftIndex] < rightArray[rightIndex]) {
					A[i] = leftArray[leftIndex];
					leftIndex++;
				}
				else {
					A[i] = rightArray[rightIndex];
					rightIndex++;
				}
			}
			else if (leftIndex < leftArray.length) {
				A[i] = leftArray[leftIndex];
				leftIndex++;
			}
			else if (rightIndex < rightArray.length) {
				A[i] = rightArray[rightIndex];
				rightIndex++;
			}
		}
	}

}
