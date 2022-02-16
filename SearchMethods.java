package algorithm;
import java.util.Arrays;
import java.util.Scanner;
public class SearchMethods {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		

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

}

