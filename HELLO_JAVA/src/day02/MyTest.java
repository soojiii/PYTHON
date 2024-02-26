package day02;

import java.util.Scanner;

public class MyTest {
	public static void main(String[] args) {
//	첫수를 입력하시오 4
//	끝수를 입력하시오 5
//	4와 5의 합은 9 입니다.
		
	Scanner scn = new Scanner(System.in);
	System.out.println("첫수를 입력하시오");
	int a = scn.nextInt();
	System.out.println("끝수를 입력하시오");
	int b = scn.nextInt();
	
	int sum = a+b;
	
	System.out.println(a+"와 "+b+"의 합은 "+sum+"입니다.");
		
	}
}
