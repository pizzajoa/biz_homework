package com.callor.hello.var;

public class VarA {
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		
		num1 = 30;
		num2 = 40;
		
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println("=============");
		
		float num3 = 0;
		float num4 = 0;
		// java에서 사용하는 소수점이 부착된 숫자는 기본형 double형이다
		// double 형으로 된 값을 float 형 변수에 보관하려고 하면 오류가 난다
		// "명시적으로" 이 숫자는 float형이다 라고 알려줘야 한다 숫자 뒤에 f문자열 부착하여 준다
		num3 = 30.2f;
		num4 = 40.3f;
		
		System.out.println(num3 + num4);
		System.out.println(num3 - num4);
		System.out.println(num3 * num4);
		System.out.println(num3 / num4);

		
		
	}
}
