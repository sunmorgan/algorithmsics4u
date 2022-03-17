package algorithm;
import java.util.Arrays;3
import java.util.Scanner;
public class SearchMethods {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			

	}
	
	public static int linearSearch(int[] data, int item) {
		
	for(int x = 0; x < data.length; x++)
			
		if (data[x] == item)
			return x;
		
	return -1;
		
	}

	
	public static int exponentialSearch(int [] data, int searchNum) {
		if(data[0] == searchNum) {
			return 0;
		}
		int i = 1; 
		while(i<data.length && data[i]<= searchNum) {
			i *= 2;
		}
		data = Arrays.copyOfRange(data,i/2,Math.min(i,data.length));
		int index = binarySearch(i/2,i,searchNum);
		if(index >= 0) {
			index += i/2;
		}
		return index; 
	}
	
	public void sort(int array[])
    {
        for (int i = 1; i < array.length; i++)
        {
            int x = array[i];
 
            // Find location to insert
            // using binary search
            int j = Math.abs(
                Arrays.binarySearch(array, 0,
                                    i, x) + 1);
 
            // Shifting array to one
            // location right
            System.arraycopy(array, j,
                             array, j + 1, i - j);
 
            // Placing element at its
            // correct location
            array[j] = x;
        }
    }

}

