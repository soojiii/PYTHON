package day01;

import java.util.ArrayList;
import java.util.Iterator;

public class MyLotto {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		for (int i = 0; i < 10; i++) {
			int rnd = (int) (Math.random()*5);
			int a = arr[0];
			arr[0]=arr[rnd];
			arr[rnd]=a;
			
		}
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
	
	}
}
