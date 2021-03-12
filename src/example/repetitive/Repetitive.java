package example.repetitive;

import java.util.Scanner;

public class Repetitive {
	public void testFor() {
		// for(초기식; 조건식; 증감식)
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "번 째 출력");
		}
		// i를 감소시키면서
		for (int i = 10; i > 0; i--) {
			System.out.println(i + "번 째 출력");
		}
		// 증감식은 반드시 1씩 증감할 필요가 없음.
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i + "번 째 출력");
		}
		// int가 아닌 char를 입력하면?
		for (char ch = 'a'; ch <= 'e'; ch++) {
			System.out.println(ch);
		}
	}

	public void testWhile() {
		// 초기식 : 외부, 조건식 : 중괄호, 증감식 : 내부
		int i = 0;
		while (i < 10) { // 조건식
			System.out.println(i + "번 째 i 출력");
			i++;
		}
		// 증감식 출력
		int j = 10;
		while (j > 0) {
			System.out.println(j + "번 째 j 출력");
			j--;
		}

		// 무한 루프 : 조건값을 항상 true로 해줌.
		int k = 0;
		while (true) {
			System.out.println(k++ + "번째 k 출력");
		}
	}

	public void testDowhile() {
		// 초기식 : 외부
		int i = 0;
		do {
			System.out.println(i++ + "번째 i 출력");
			// 증감식
		} while (i < 10); // 조건식이 맨 마지막, 세미콜론 사용

		// 감소식
		int j = 10;
		do {
			System.out.println(j-- + "번 째 j출력");

		} while (j > 0);

		// do - while 문 무한 루프
		int k = 0;
		do {
			System.out.println(k++ + "번 째 k출력");
		} while (true);
	}

	public void testGugudan() {
		// 중첩 반복문 구구단
		// for문
		for (int i = 2; i < 10; i++) {
			System.out.println("==== " + i + "단 ====");
			for (int j = 1; j < 10; j++)
				System.out.println(i + " x " + j + " = " + i * j);
		}
		// while문 구현
		int i = 2;
		while (i < 10) {
			System.out.println("==== " + i + "단 ====");
			int j = 1;
			while (j < 10) {
				System.out.println(i + " x " + j + " = " + i * j);
				j++;
			}
			i++;
		}
	}

	public void testBreak() { // break를 만나면 가장 가까운 반복문을 종료한다.
		// 숫자를 입력 받아 받은 숫자만큼만 반복적으로 출력 후 종료
		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수 입력 : ");
		int num = sc.nextInt();

		int i = 1;
		while (true) {
			System.out.println(i + "번째 i 출력");
			if (i == num) {
				break;
			}
			i++;
		}
	}

	public void testFor2() {
		// 초기식 생략 for문
		int i = 0;
		for (; i < 10; i++) {
			System.out.println(i + "번째 i 출력");
		}
		// 조건식 생략 for문
		for (int j = 0;; j++) {
			if (j < 10) {
				System.out.println(j + "번째 j 출력");
			} else {
				break;
			}
		}
		// 증감식 생략 for문
		for (int k = 0; k < 10;) {
			System.out.println(k + "번째 k 출력");
			k++;
		}
		// 모두 생략
		int l = 0;
		for (;;) {
			if (l < 10) {
				System.out.println(l + "번째 l 출력");
			} else {
				break;
			}
			l++;
		}
	}

	public void testContinue() {
		//1~100까지의 합(3과 5의 배수 제외)을 출력
		int sum = 0;
		for(int i = 1; i <=100; i++) {
			if(i % 3 == 0 || i % 5 ==0) {
				continue;
			}
			sum += i;
		}
		System.out.println("sum : " + sum);
		
		
		
		
		
		
		
		
		
		
		
	}

}
