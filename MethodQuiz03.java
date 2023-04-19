package day09_0418;

import java.util.Arrays;

public class MethodQuiz03 {

	public static void main(String[] args) {
		
		//method6
		char[]arr = {'a', 'b', 'c', 'd', 'e'};
		String result = method6(arr);
		System.out.println(result);
		
		//method7
		int[] arr2 = {1,2,3,4,5};
		int result2 = method7(arr2);
		System.out.println(result2);
	
		//method8
		String [] arr3 = method8("가", "나");
		System.out.println(Arrays.toString(arr3));
	}

		static String method6(char[]arr) {
			String str = "";
			for(int i = 0; i <= arr.length; i++) {
				str += arr[i];
			}
			return str;
		}
		
		static int method7(int [] arr) {
//			int sum = 0;
//			for(int i = 0; i<arr.length; i++) {
//				sum += arr[i];
//			}
//			return sum;
			// 2.향상된 for문
			int sum = 0;
				for(int a : arr) {
					sum += a;
				}
				return sum;
		}
		
		static String[] method8(String a, String b) {
			String[] arr = {a,b};
			return arr;
			
		}
			
		
}
