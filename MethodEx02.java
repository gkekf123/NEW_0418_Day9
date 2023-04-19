package day09_0418;

public class MethodEx02 {

	public static void main(String[] args) {

		/* 
		 * 매개변수(parameter)
		 * 메서드가 전달받는 매개값
		 * 여러개 받을 수 있고, 받지 않을 수 있다.
		 */
		
		//매개변수 호출은 calSum(값)
		int result = calSum(10);
		System.out.println("1 ~ 10합 : " + result);
		
		//호출할 때 마다 다르게 호출가능
		int result2 = calSum(100);
		System.out.println("1 ~ 100합 : " + result2);
		
		//2개 매개변수의 합 호출
		int result3 = calSum2(1, 2);
		System.out.println("두 매개변수의 합 : " + result3);
		
		//정수에 따른 문자열 반복 호출
		String result4 = calSum3(5, "가");
		System.out.println(result4);
		
	}	//main
	
	// 1 ~ 매개변수 까지의 합
	static int calSum(int a) {
		int sum = 0;
		for(int i = 1; i <= a; i ++) {
			sum += i;
		}
		return sum;
	}
	
	// 매개변수를 두개 받음
	static int calSum2(int a, int b) {
		return a + b;
		//int result = a + b;
		//return result;
	}

	// 실습 - 정수, 문자열을 전달받는 String calSum3() 생성
	static String calSum3(int a, String s ) {
		
		String str = "";	// 문자열 합계
		for(int i = 1; i <= a; i++) {
			str += s;
		}
		return str;
	}
		
	
	
}
