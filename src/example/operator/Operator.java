package example.operator;

import java.util.Scanner;

public class Operator {
	public void operatorTest() {
		//���� ������ �����ϱ�
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
		//��� ������ % : �������� �� �������� ���ϴ� ������
		// ¦�� -> �� % 2 == 0
		// Ȧ�� -> �� % 2 == 1
		// n�� ��� -> �� % n == 0
		int num1 = 10;
		int num2 = 3;
		System.out.println("num1 % num2 = " + (num1 % num2)); // 1
		
		//�� ������
		//1�� 100������ ��?
		// 1 < �� < 100 (x)
		// ���� > 1 && ���� < 100 (o)
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num3 = sc.nextInt();
		
		System.out.println("1�� 100������ �� ?  " + (num3 > 1 && num3 < 100));
		
		//���մ��Կ�����
		//�ڵ尡 �����ϸ� �޸𸮿� ���� ������ �����Ͽ� ����ӵ��� ����
		int num4 = 5;
		num4 += 10;
		System.out.println("num4 : " + num4); //15
		
		num4 -= 10;
		System.out.println("num4 : " + num4); //5
		
		num4 *= 10;
		System.out.println("num4 : " + num4); //50
		
		num4 /= 10;
		System.out.println("num4 : " + num4); //5
		
		num4 %= 10;
		System.out.println("num4 : " + num4); //5		
	}
	public void operatorTest3() {
		//���׿�����
		//����ڿ� ���� �ϳ� �޾Ƽ� �� ���� ������� �������� 0���� �Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "����̴�" : num==0 ? "0�̴�" : "�����̴�";	
		System.out.println(result);
	}
		
}
