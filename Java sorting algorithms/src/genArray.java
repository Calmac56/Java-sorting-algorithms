
public class genArray {

	public static int[] generate(int length) {
		int[] theArray = new int[length];
		int j = 0;
		for (int i = 0; i < length; i=i+2) {
			theArray[j] = i;
			j = j +1;
		}
		for(int i = length-1; i > 0; i=i-2) {
			theArray[j] = i;
			j = j +1;
		}
		
		return theArray;
	}

}
