package practice.operator;

import java.util.Scanner;

public class OperatorPractice {
	public void method1() {
		//���� 1 ��� �� ����
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
		//���� 2 ���� 2���� �Է� �޾� ���� �����ڸ� �̿��Ͽ� "�� �� ��� Ȧ���̴�" �Ǵ�
		// "�� �� ��� ¦���̴�" �Ǵ� "�ϳ��� Ȧ���̰� �ϳ��� ¦���̴�" �� �Ǻ��Ͽ� ����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		String result = (num1 % 2==0) && (num2 %2 ==0) ? "�� �� ��� ¦���̴�" : 
			(num1 % 2 !=0) && (num2 % 2 !=0) ?
		"�� �� ��� Ȧ���̴�" : "�� �� �� �ϳ��� Ȧ���̰� �ϳ��� ¦���̴�";		
//�Ǵ�  (num1 % 2 ==0) && (num2 % 2 ==0) ? "�� �� ��� ¦��" :
	// (num1 % 2 ==0) || (num2 % 2 ==0) ? "�ϳ��� ¦��, �ϳ��� Ȧ��" : "�� �� ��� Ȧ��"
	
		System.out.println(result);
	}
}
