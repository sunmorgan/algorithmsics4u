package algorithm;

public class SortMethods {

	public static void main(String[] args) {
	}
	
	public static void insertionSort(int [] data) {
		//checking using a single index value 
		for(int x = 1; x<data.length;x++) {
			//if index value is smaller than the one before, and before and before, then swap 
			//accordingly 
			for(int y = x-1; y>=0; y--) {
				
				if(data[x]<data[y]) {
					//x-- basically means it will deliver x into the method 
					//and after the method is called, decrease x by 1 
					swap(data,x--,y);
				} else {
					break;
				}
				
			}
					
		}
		
	}
	public static void swap(int [] data, int x, int y) {
		//temporarily variable so the value doesn't disappear 
		int temp = data[x]; 
		data [x] = data[y];
		data[y] = temp;
	}
}
