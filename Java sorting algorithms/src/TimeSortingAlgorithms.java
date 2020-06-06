
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;



public class TimeSortingAlgorithms {
	public static boolean isSorted(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) throws IOException {
		String filetoread = "C:\\Users\\cmacp\\Documents\\UOFG-201920\\CS_sem_2\\ADS2\\Labs-20200211\\Files\\int20k.txt";
		int i = 0;
		
		
		Path p = Paths.get(filetoread);
		List<String> lines = Files.readAllLines(p);
		int integers[] = new int[lines.size()];
		for (String line : lines) {
			integers [i] = Integer.valueOf(line);
			i++;
		}
		
		int [] theArray = genArray.generate(19000); // - Shows working method to create a quadratic time array for part 3
		
		
		long startTime = System.nanoTime();
		QuickSortMed.sort(theArray, 0, theArray.length-1);
		long endTime = System.nanoTime();
		long elapsedTime = (endTime-startTime);
		System.out.println("Elapsed time was " + elapsedTime + " nanoseconds");
		System.out.println(isSorted(theArray));
	}
}
