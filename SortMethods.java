package algorithm;

public class SortMethods {

	public static void main(String[] args) {
		int [] arr = new int[] {4, 1, 18, 3, 5, 90, 7, 2, 9};
		selectionSort(arr);
		for(int x : arr) {
			System.out.print(x + " ");
			
		}
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
	public static void bubbleSort(int [] data) {
		//if everything is ordered, break the whole loop
		//compare with the one to the right 
		        //if it's greater, swap
		//the maximum times it will sort through each algorithm will be the length of it -1 since 
		//if you swap from the very right to the very left it will go through it data.length-1 times until it hit 0
		for(int x= data.length-1;x>=0; x--) {
			//make swapped false each time the whole sorting begins again 
			boolean swapped = false; 
			
			for(int y = 0; y<x; y++) {
				if(data[y]>data[y+1]) {
					swap(data,y,y+1);
					//showing that something was actually swapped 
					swapped = true; 
				}
			}
			//meaning that nothing needs to be swapped anymore 
			if(!swapped) {
				break;
			}
		}
	}
	public static void selectionSort(int [] data) {
		//set the first index of the array as current minimum 
		//checks over the whole array until you find the number lower (if you find two that are lower, set one as minimum 
		// but then changes when you see something lower
		//swap it with the current minimum number 
		//move the current minimum number to the next index
		for(int x = 0; x<data.length-1; x++) {
			int smallest = x; 
			for(int y = x+1; y<data.length; y++) {
				if(data[y]<data[smallest]) {
					smallest = y; 
				}
			}
			swap(data,x,smallest);	
		}
	}


}
