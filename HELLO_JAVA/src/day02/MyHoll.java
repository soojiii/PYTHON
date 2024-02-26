package day02;

import java.util.Scanner;

public class MyHoll {
	public static void main(String[] args) {
		// 홀,짝을 입력하시오
		// 나 : 홀
		// 컴 : 홀
		// 결과 : 이김 (짐)
	
	String com = "";
	String my = "";
	String result = "";
	
	Scanner scn = new Scanner(System.in);
	System.out.println("홀,짝을 입력하시오");
	my = scn.next();
	
	double rnd = Math.random();
	
	if(rnd>0.5) {
		com = "홀";
	}else {
		com = "짝";
	}
	
	if(my.equals(com)) {
		result = "이김";
	}else {
		result = "짐";
	}
	
	System.out.println("나 : "+my);
	System.out.println("컴 : "+com);
	System.out.println("결과 : "+result);
	}
}
