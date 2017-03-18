package util;
import java.io.*;

public class util {
	public static void printArr(int [] arr){
		int len = arr.length;
		System.out.print("[");
		for(int i = 0; i < len; i++){
			System.out.print(arr[i]);
			if(i <= len-2){
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
