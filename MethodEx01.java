package day09_0418;

public class MethodEx01 {
	
	public static void main(String[] args) {

		/* 
		 * 메서드는 생성과 호출이 있다
		 * 메서드는 메서드안에서 생성 할 수 없습니다
		 */
		
		//1 ~ 10까지 합
		int sum  = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	
		System.out.println("1 ~ 10까지 합 : " + calSum());
		System.out.println("1 ~ 10까지 합 : " + calSum());
		System.out.println("1 ~ 10까지 합 : " + calSum());
	
		int result = calSum();
		System.out.println("1 ~ 10까지 합 : " + result);	
		
		String result2 = calSum2();
		System.out.println(result2);
	
	} //main
	
		//반환유형 이름()
			static int calSum() {
				
			//1 ~ 10까지 합
			int sum  = 0;
			for(int i = 1; i <= 10; i++) {
				sum += i;
			}
			
			return sum;
		}
			
			//문자열 반환
			static String calSum2() {
				
				//A ~ Z문자열 합
				String str = "";
				for(char c = 'A'; c <= 'z'; c++) {
					str += c;					
			}
				return str;	//문자열 반환
		}
		
}
