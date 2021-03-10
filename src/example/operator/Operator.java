package example.operator;

public class Operator {
	public void operatorTest() {
		//증감 연산자 연습하기
		int a = 5;
		int b = 10;
		
		int c =(++a) + b;
		int d = c / a;
		int e = c % a;
		int f = e++;
		int g = (--b) + (d--);
		int h = 2;
		h *= e;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		System.out.println("g = " + g);
		
	}
}
