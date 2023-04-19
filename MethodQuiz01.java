package day09_0418;

import java.util.Scanner;

public class MethodQuiz01 {

	public static void main(String[] args) {

		// 1		
		method1();
		
		// 2
		String result = method2("hello");
		System.out.println(result);
		
		// 3
		double result2 = method3(1, 2, 0.2);
		System.out.println(result2);
		
		// 4
		String result3 = method4(3);
		System.out.println(result3);
		
		// 5
		method5(5, "가");
		
		// 6
		int result4 = maxNum(10, 3);
		System.out.println(result4);
		
		// 7
		int result5 = abs(10);
		System.out.println(result5);
		
		//프로그래머스 레벨0
		String result6 = java(4);
		System.out.println(result6);
		
	}//main
	
	// 1
	static void method1() {
		System.out.println("안녕");
	}
	
	// 2
	static String method2(String s) {
		return s;
	}
	
	// 3
	static double method3(int a, int b, double c) {
		return a + b + c;
	}
	
	// 4
	static String method4(int a) {
		//방법 1
//		String str = "";
//		if(a %2 == 0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
//		return str;
		
		//방법 2
//		String str = "";
//		if(a %2 == 0) {
//			str = "짝수";
//		}else {
//			str = "홀수";
//		}
//		return str;
		
		//방법 3
//		if(a % 2 == 0 ) {
//			return "짝수";
//		}else {
//			return "홀수";
//		}
		
		//방법 4
		return a % 2 == 0 ? "짝수" : "홀수";
	}
	
	// 5
	static void method5(int a, String s) {
				for(int i = 1; i <= a; i++) {
			System.out.print(s + "");
		}
				System.out.println();
	}
	
	// 6
	static int maxNum(int a, int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
	
	// 7
	static int abs(int a) {
		if( a >= 0)	{
			return a;
		}else {
			return -a;
		}
		//방법 2
		//return a > 0 ? a : -a;
	}
	
	// 8
	static String java(int a) {
//		String str = "";
//		for(int i = 1; i <= a; i++) {
//			if(a % 2 != 0) {
//				str += "자";
//			} else {
//				str += "바";
//			}
//	}
//		return str;
//	}
	
	//방법2
	String str = "";
	for(int i = 1; i <= a; i++) {
		str += 1 % 2 != 0 ? "자" : "바";
	}
	return str;
	}
	
//	String str = "";
//	for(int i = 0; i <= a; i++) {
//		
//		for(int j = i; j <= i; j++) {
//			System.out.print("자");
//			
//		}
//		System.out.print("바");
//	}
//	return str;
		
		
	
	
	
	
}
