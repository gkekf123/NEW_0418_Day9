package day09_0418;

public class MethodEx03 {

	public static void main(String[] args) {

		/* 
		 * return 이란 (값의 반환, 메서드의 종료)
		 * 1. 메서드(소괄호)에서 리턴은 실행결과를 돌려주는 값에 대한 타입
		 * 2. 리턴이 있는 메서드는 다른 메서드의 매개값으로도 사용이 된다.
		 * 3. 반환값은 없을 수도 있다. void로 선언
		 * 4. void 메서드도 return 사용 가능
		 * 	- 값을 돌려주지는 못하고, 졸료의 의미
		 * 5. 
		 */
		
		//add(1,2);
		//System.out.println(add(1,2));
		
		//메서드를 메서드의 매개값으로 사용 가능 - 리턴이 있는 메서드는 다른 메서드의 매개값으로도 사용이 된다.
		int result = add(add(1,2), add(3,5));
		System.out.println(result);
		
		//에러 예시\\
		//void 메서드는 return이 없기때문에 단순 호출만 가능
		//System.out.println(sub());
		//실행만 할 수 있다
		//반환이 없고, 매개변수도 없는 모형
		sub();
		
		//반환은 없고, 매개변수는 있는 ㅁ노형
		div(6, 2);
		
		//
		noReturn("bye");
		noReturn("Hello");
		
		
	}	//main
	//중첩 매개변수 사용
	static int add(int a, int b) {
		return a + b;
	}
	
	//반환이 없고, 매개변수도 없는 모형
	static void sub() {
		System.out.println("5 - 3 = 2");
	}
	
	//반환은 없고, 매개변수는 있는 모형
	static void div(int a, int b) {
		System.out.println(a + " / " + b + " = " + (a/b));
	}
	
	//
	static void noReturn(String s) {
		if(s.equals("Hello")) {	//정수는 a == "Hello", 문자열은 s.equals("Hello")
			System.out.println("메서드 종료");
			return;
		}
		System.out.println("Hello를 전달해야 할껄요?");
	}
	
	
	
}
