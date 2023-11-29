
public class HelloF {
	public static void main(String[] args) {
		System.out.println("30 + 40 = " + 70);
		/*
		 * 30+ 40 = 70 이라고 출력하고 싶으면? 1. "30 + 40 = "뒤에 + 70 쓰기 2. "" 내부에 70쓰기
		 */
		System.out.println("30 + 40 = " + "30" + 40);
		// 먼저 숫자 30과 40을 문자열 "30", "40"으로 변환한 후
		// 연결을 실행하여 30 + 40 = 3040으로 출력된다
		System.out.println("30 + 40 = " + (30 + 40));
		System.out.println("30 x 40 = " + 30 * 40);
		// 연산 우선순위에 따라 30 * 40이 먼저 연산되고
		// 문자열연결 연산이 수행된다
		System.out.println("30 x 40 = " + 30 * 40);
		System.out.println("30 x 40 = " + 30 / 40);
	
		/*
		 * 1. "30 - 40 = " + 30의 연산을
		 * 		"30 - 40 = " + "30"으로 변환하여 실행
		 * 2. "30 - 40 = 30" - 40 의 연산을
		 * 		"30 - 40 = 30" - "40"으로 변환하여 실행하려한다
		 * 이때, 문자열과 문자열은 - 연산을 할 수 없어서 연산오류가 발생한다
		 * 해결방법은? 30 - 40을 ()로 묶어준다  
		 */
	}
}