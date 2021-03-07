package practice.variable;

import java.util.Scanner;

public class VariablePractice {
	public void method1() {
		//문제 1 초기화 및 값 변경
		int inum = 100 ;
		float dnum = 234.567f;
		char ch = 'A' ;
		String str = "Hello world";
		boolean bool = true ;
		
		System.out.println("초기화 후 : " + inum + "," + dnum + "," + ch + "," + str + "," + bool);
		
		inum = 100000;
		dnum = 567.123465789f; //float의 유효자리수는 7자리 : 567.1235로 출력됨.
		ch = 'B';
		str = "Welcome to JAVA";
		bool = false;
		
		System.out.println("값 변경 후 : " + inum + "," + dnum + "," + ch + "," + str + "," + bool);

	}
	public void method2() {
		//문제 2 원의 둘레와 면적 구하기(소수점 아래 한자리까지만 표기)
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 반지름 입력 : ");
		int rad = sc.nextInt();
		double pi = 3.141592;
		sc.close();
		
//		System.out.println("반지름이 " + rad + "인 원의 둘레는 : " + 2*pi*rad);
//		System.out.println("반지름이 " + rad + "인 원의 면적은 : " + pi*rad*rad);
		
		System.out.printf("반지름이 %d인 원의 둘레 : %.1f\n", rad, (2*pi*rad) );
		System.out.printf("반지름이 %d인 원의 넓이 : %.1f\n", rad, (pi*rad*rad) );
		
		
		
		// System.out.printf(%형식,변수 등) : 
		// 정해져 있는 형식에 맞춰서 그 형식에 맞는 값(변수)을 줄바꿈하지 않고 출력
//		%d : 정수형, %o : 8진수, %x : 16진수
//		%c : 문자, %s : 문자열, %f : 실수(소수점 아래 6자리), %e : 지수형태표현
//		%g : 대입 값 그대로, %A : 16진수 실수, %b : 논리형
		
		//정렬방법
//		- %5d : 5칸을 확보하고 오른쪽 정렬
//		- %-5d : 5칸을 확보하고 왼쪽 정렬
//		- %.2f : 소수점 아래 2자리까지만 표기
	}
}
