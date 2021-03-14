package example.review;

import java.util.Scanner;

public class Review {
	public void method1() {
		// char <-> int
		int num = 'A';
		System.out.println("num : " + num); //65
		
		char ch = 66;
		//char ch2 = -66;
		System.out.println("ch : " + ch); //B
		
		char ch2 = (char)num;
		System.out.println("ch2 : " + ch2); //A
		
		//int와 long 연산
		
		int inum = 4;
		long lnum = 8L;
		
		int sum = inum+(int)lnum;
		sum = (int)(inum+lnum);
		long sum2 = inum+lnum;
		
		System.out.println("sum : " + sum);
		System.out.println("sum2 : " + sum2);
		
		//byte와 shour의 연산 결과 : int
		byte bnum = 1;
		short snum = 2;
		
		short sum3 = (short)(bnum + snum);
		int sum4 = bnum+snum;
		
		System.out.println("sum3 : " + sum3);
		System.out.println("sum4 : " + sum4);
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		String result = num > 0 ? "양수다" : num == 0 ? "0이다" : "음수다";
		System.out.println(result);
	}
}
