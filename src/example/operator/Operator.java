package example.operator;

import java.util.Scanner;

public class Operator {
	public void operatorTest() {
		//증감 연산자 연습하기
		int a = 5;
		int b = 10;
		
		int c =(++a) + b; // a:6 b:10 c:16
		int d = c / a; // d:2
		int e = c % a; // c:4
		int f = e++; //f:4 e:5
		int g = (--b) + (d--); // b:9 g:11 d:1
		int h = 2;
		h *= e; //h:10 h = h*e
		
		System.out.println("a = " + a); //6
		System.out.println("b = " + b); //9
		System.out.println("c = " + c); //16
		System.out.println("d = " + d); //1
		System.out.println("e = " + e); //5
		System.out.println("f = " + f); //4
		System.out.println("g = " + g); // 11
		System.out.println("h = " + h); // 10		
	}
	public void operatorTest2() {
		//산술 연산자 % : 나누었을 때 나머지를 구하는 연산자
		// 짝수 -> 값 % 2 == 0
		// 홀수 -> 값 % 2 == 1
		// n의 배수 -> 값 % n == 0
		int num1 = 10;
		int num2 = 3;
		System.out.println("num1 % num2 = " + (num1 % num2)); // 1
		
		//논리 연산자
		//1과 100사이의 수?
		// 1 < 수 < 100 (x)
		// 변수 > 1 && 변수 < 100 (o)
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num3 = sc.nextInt();
		
		System.out.println("1과 100사이의 수 ?  " + (num3 > 1 && num3 < 100));
		
	}
}
