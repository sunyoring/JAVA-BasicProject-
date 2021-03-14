package example.review;

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
}
