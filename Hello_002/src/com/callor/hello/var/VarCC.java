package com.callor.hello.var;

public class VarCC {
	public static void main(String[] args) {

		// 선언하는 곳
		int scoreKor = 0;
		int scoreEng = 0;
		int scoreMath = 0;
		int total = 0;
		int avg = 0;

		/*
		 * // 데이터를 변수에 할당하는 곳 scoreKor = 90; scoreEng = 80; scoreMath = 70;
		 * 
		 * // 계산하는 부분 total = scoreKor + scoreEng + scoreMath; avg = total / 3;
		 */

		// 출력하는 부분
		System.out.println("====================");
		System.out.println("성적표");
		System.out.println("====================");

		System.out.println("국어 : " + scoreKor);
		scoreKor = 90;
		System.out.println("영어 : " + scoreEng);
		scoreEng = 80;
		System.out.println("수학 : " + scoreMath);
		scoreMath = 70;
		System.out.println("--------------------");
		total = scoreKor + scoreEng + scoreMath;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		avg = total / 3;
		System.out.println("====================");
	}

}
