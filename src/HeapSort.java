import util.util;

public class HeapSort {
	public static void main(String[] args){
		int[] list = {1,2,3,1,12,4,5,2,3};
		
		heapSort(list);
	}
	public static void heapSort(int[] list){
		int len = list.length;
		int[] result = new int[len];
		for(int i = len - 1; i >= 0; i--){
			heapAdjust(list, i, len);	
		}
		
		for(int i = 0; i < len; i++){
			result[i] = list[0];
			list[0] = list[len - i - 1];
			heapAdjust(list, 0, len - i - 1);
		}
		
		util.printArr(result);
	}
	private static void heapAdjust(int[] list, int index, int len){
		int c1 = index * 2 + 1, c2 = index * 2 + 2;
		if(c1 >= len){
			return;
		}
		if(c1 == len - 1){
			if(list[c1] > list[index]){
				int temp = list[index];
				list[index] = list[c1];
				list[c1] = temp;
			}
		}
		
		if(list[index] < list[c2] && list[c1] <= list[c2]){
			int temp = list[index];
			list[index] = list[c2];
			list[c2] = temp;
			heapAdjust(list, c2, len);
		} else if (list[index] < list[c1] && list[c2] <= list[c1]){
			int temp = list[index];
			list[index] = list[c1];
			list[c1] = temp;
			heapAdjust(list, c1, len);
		}
		
	}
}
