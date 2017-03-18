import java.util.Scanner;
import java.io.*;
import util.util;

public class QuickSort {
	public static void main(String[] args){
		int[] list = {5,2,3,3,4,8,9,10};
		
		sort(list, 0, list.length - 1);
		util.printArr(list);
	}
	
	public static void sort(int[] list, int l, int r){
		int i = l, j = r;
		int temp = list[l];
		
		while(i < j){
			while(i < j && list[j] >= temp){
				j--;
			}
			if(i < j){
				list[i] = list[j];
			}
			
			while(i < j && list[i] <= temp){
				i++;
			}
			if(i < j){
				list[j] = list[i];
			}
		}
		list[j] = temp;
		if(i > l){
			sort(list, l, i - 1);
		}
		if(j < r){
			sort(list, j + 1, r);
		}
	}
}
