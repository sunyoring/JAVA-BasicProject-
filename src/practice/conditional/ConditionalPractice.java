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
		String result ="";
	
		if ((num1 % 2 == 0) && (num2 % 2 == 0)) {
			result = "두 수는 모두 짝수이다.";
		} else if (num1 % 2 == 0 || num2 % 2 == 0) {
			result = "두 수중 하나는 짝수이고, 하나는 홀수 이다.";
		} else { 
			result = "두 수는 모두 홀수이다.";
		}
		System.out.println(result);
	}
}