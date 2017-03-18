import util.util;
import java.util.*;

public class MergeSort {
	public static void main(String[] args){
		int[] list = {4,2,5,1,3,4,29,32,1,2};
		mergeSort(list, 0, list.length - 1);
	}
	public static void mergeSort(int[] list, int l, int r){
		int mid = (l + r) / 2;
		if(l < r){
			mergeSort(list, l, mid);
			mergeSort(list, mid + 1, r);
			
			merge(list, l, mid, r);	
		}
	}
	private static void merge(int[] list, int l, int mid, int r){
		System.out.println("l:" + l);
		System.out.println("mid:" + mid);
		System.out.println("r:" + r);
		int k = 0, i = l, j = mid + 1, len = r - l + 1;
		int[] arr = new int[len];
		
		while(i <= mid && j <= r){
			if(list[i] < list[j]){
				arr[k++] = list[i++];
			} else{
				arr[k++] = list[j++];
			}
		}
		while(i <= mid){
			arr[k++] = list[i++];
		}
		while(j <= r){
			arr[k++] = list[j++];
		}
		for(int m = 0; m < arr.length; m++){
			list[l+m] = arr[m];
		}
		util.printArr(arr);
	}
}
