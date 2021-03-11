package practice.conditional;

import java.util.Scanner;

public class ConditionalPractice {
	public void method1() {
		// 문제 1 if문으로 두개의 정수의 짝 홀 판별
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		String result = "";

		if ((num1 % 2 == 0) && (num2 % 2 == 0)) {
			result = "두 수는 모두 짝수이다.";
		} else if (num1 % 2 == 0 || num2 % 2 == 0) {
			result = "두 수중 하나는 짝수이고, 하나는 홀수 이다.";
		} else {
			result = "두 수는 모두 홀수이다.";
		}
		System.out.println(result);
	}

	public void method2() {
		// 문제 2 두개의 정수를 입력받고, 문자 혹은 문자열로 연산기호를 입력받아 수행결과 출력.
		// 0으로 나눌 경우 "0으로 나눌 수 없습니다" 출력하고 결과값을 0으로 처리
		// 연산기호에 없는 문자입력하는 경우 "입력하신 연산이 없습니다. 프로그램을 종료합니다"
		// 출력 후 프로그램 종료 //정수 입력 : 5와 7, 연산기호 : * ,수행결과 5*7 = 35
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.println("연산 기호 입력 : ");
		char op = sc.next().charAt(0);
		int result = 0;

		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			break;
		case '%':
			result = num1 % num2;
			break;
		default:
			System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다");
			return; // return은 값을 반환하는 함수로 현재 메소드를 종료하며 반환한다.
		}
		System.out.println("수행 결과 : " + num1 +" "+ op +" "+ num2 +" = " 
		+ result );

	}
}