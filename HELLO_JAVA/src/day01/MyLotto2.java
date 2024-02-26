package day01;

import java.util.ArrayList;
import java.util.Iterator;

public class MyLotto2 {
	public static void main(String[] args) {
		int[] arr = {
			1,2,3,4,5, 6,7,8,9,10,
			11,12,13,14,15, 16,17,18,19,20,
			21,22,23,24,25, 26,27,28,29,30,
			31,32,33,34,35, 36,37,38,39,40,
			41,42,43,44,45
		};
		
		for (int i = 0; i < 1000; i++) {
			int rnd = (int) (Math.random()*45);
			int a = arr[0];
			arr[0]=arr[rnd];
			arr[rnd]=a;
			
		}
		System.out.print(arr[0]+" ");
		System.out.print(arr[1]+" ");
		System.out.print(arr[2]+" ");
		System.out.print(arr[3]+" ");
		System.out.print(arr[4]+" ");
		System.out.print(arr[5]+" ");
	
	}
}
