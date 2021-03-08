package example.variable;

import java.util.Scanner;

public class Variable {
	public void inintVariable() {
		//변수 선언과 동시에 초기화
		
		//논리형
		boolean isTrue = true;
		boolean isFalse = false;
		
		//문자 : 2byte
		char ch = 'a'; // ''싱글 쿼테이션 사용
		//char ch2 = 'bc' //하나의 문자만 대입 가능
		
		//문자열 : 참조형 (주소값을 저장)
		String str = "안녕하세요" ; // ""더블 쿼테이션 사용
		
		//숫자형
		//정수형
		byte bnum = 1 ; //1byte
		short snum = 2 ; //2byte
		int inum = 4 ; // 4byte
		long lnum = 8L ; // 8yte 
		//실수형
		float fnum = 4.0f; // 4byte
		double dnum = 8.0; // 8byte
		
		//변수에 저장된 값 출력하기
		System.out.println("isTure의 값 : " + isTrue);
		System.out.println("isFalse의 값 : " + isFalse);

		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);

		
		System.out.println("bnum의 값 : " + bnum);
		System.out.println("snum의 값 : " + snum);
		System.out.println("inum의 값 : " + inum);
		System.out.println("lnum의 값 : " + lnum);
		
		System.out.println("fnum의 값 : " + fnum);
		System.out.println("dnum의 값 : " + dnum);
		
	}
	public void changeValue() {
		//변수값 변경 테스트
		String name;
		char gender;
		int age;
		double height;
		
		name = "김이나";
		gender = 'F';
		age = 20 ;
		height = 170.5;
		
		System.out.println(name + "님의 개인정보");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
		
		//키보드로 값을 입력받아 변수에 저장된 값 변환
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("성별을 입력하세요 : ");
		gender = sc.next().charAt(0);
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.print("키를 입력하세요 : ");
		height = sc.nextDouble();
		sc.close();	
		
		System.out.println(name + "님의 개인정보");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
		
	}
	public void testFinal() {
		int size; //변수
		final int SIZE; //상수 : 일반적으로 대문자로 표기함

		size = 10;
		SIZE = 10;
		
		System.out.println("==== 값 변경 전 ====");
		System.out.println("size : " + size);
		System.out.println("SIZE : " + SIZE);
		
		//변수의 값 변경
		size = 20;
		// SIZE = 20; 에러가 발생. 상수는 초기화이후 다른 데이터 입력 불가
		System.out.println("==== 값 변경 후 ====");
		System.out.println("size : " + size);
		System.out.println("SIZE : " + SIZE);
	}
	public void testOverflow() {
		//데이터 오버플로우 테스트
		System.out.println("byte의 최대값 : " + Byte.MAX_VALUE);
		System.out.println("byte의 최소값 : " + Byte.MIN_VALUE);
		
//		byte bnum = 128; 저장 가능 범위를 벗어나므로 에러 발생
		byte bnum = 127;
		bnum += 1;
		System.out.println("byte의 최대값 + 1 : " + bnum);
		bnum -= 1;
		System.out.println("byte의 최소값 - 1 : " + bnum);
		
		int num1 = 100000;
		int num2 = 30000;
//		int result = num1*num2;
		// int의 저장 가능 범위는 약 21억이므로 30억이라는 값을 대입하면 오버플로우 발생.
		long result = (long)num1*num2;
		//int보다 저장 가능 범위가 넓은 long타입으로 강제 형변환.
		System.out.println("num1*num2의 계산 결과 : " + result);		
	}
	public void testCasting() {
		//형변환 테스트
		boolean bool = true;
		//bool = 1; //형변환 불가
		
		//char -> int : 자동 형변환
		int num = 'A';
		System.out.println("num : " + num);
		
		//char에 정수값 저장 가능 (숫자에 해당하는 유니코드 문자)
		char ch = 66;
		System.out.println("ch : " + ch);
		//ch = -66; //과 같은 음수는 불가능
		
		//int -> char : 강제 형변환
		char ch2 = (char)num;
		System.out.println("ch2 : " + ch2);
	}
	public void testCasting2() {
		//int 와 long의 연산
		int inum = 4;
		long lnum = 8L;
		
		//1. int 결과로 담기 위한방법 두가지
		int isum = (int)(inum+lnum);
		isum = inum + (int)lnum;
		System.out.println("isum : " + isum);
		
		//2. long 결과로 담기 위한방법 : 자동으로 변환됨
		long lsum = inum + lnum ;
		System.out.println("lsum : " + lsum);
		
		//byte, shourt의 연산 결과  : int
		byte bnum = 1;
		short snum = 2;
		
		int sum1 = bnum + snum;
		System.out.println("sum1 : " + sum1);
		
		//byte or short의 결과를 얻기 위해 강제 형변환
		short sum2 = (byte)(bnum + snum);
		System.out.println("sum2 : " + sum2);
	}
}
