package practice.operator;

import java.util.Scanner;

public class OperatorPractice {
	public void method1() {
		//문제 1 출력 값 예측
		int num1 = 10, num2 = 0;
		String str = "hello";
		
		num1 += 20; // 30
		num2 += 10; //10
		num1 /= num2; // 3
		num2 *= num1; // 30
		str += num2; // "hello30" 
		num2 -= num1; // 27
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("str : " + str);		
	}
	public void method2() {
		//문제 2 정수 2개를 입력 받아 삼항 연산자를 이용하여 "두 수 모두 홀수이다" 또는
		// "두 수 모두 짝수이다" 또는 "하나는 홀수이고 하나는 짝수이다" 를 판별하여 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		String result = (num1 % 2==0) && (num2 %2 ==0) ? "두 수 모두 짝수이다" : 
			(num1 % 2 !=0) && (num2 % 2 !=0) ?
		"두 수 모두 홀수이다" : "두 수 중 하나는 홀수이고 하나는 짝수이다";		
//또는  (num1 % 2 ==0) && (num2 % 2 ==0) ? "두 수 모두 짝수" :
	// (num1 % 2 ==0) || (num2 % 2 ==0) ? "하나는 짝수, 하나는 홀수" : "두 수 모두 홀수"
	
		System.out.println(result);
	}
}
