package practice.conditional;

import java.util.Scanner;

public class ConditionalPractice {
	public void method1() {
		// ���� 1 if������ �ΰ��� ������ ¦ Ȧ �Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();
		String result = "";

		if ((num1 % 2 == 0) && (num2 % 2 == 0)) {
			result = "�� ���� ��� ¦���̴�.";
		} else if (num1 % 2 == 0 || num2 % 2 == 0) {
			result = "�� ���� �ϳ��� ¦���̰�, �ϳ��� Ȧ�� �̴�.";
		} else {
			result = "�� ���� ��� Ȧ���̴�.";
		}
		System.out.println(result);
	}

	public void method2() {
		// ���� 2 �ΰ��� ������ �Է¹ް�, ���� Ȥ�� ���ڿ��� �����ȣ�� �Է¹޾� ������ ���.
		// 0���� ���� ��� "0���� ���� �� �����ϴ�" ����ϰ� ������� 0���� ó��
		// �����ȣ�� ���� �����Է��ϴ� ��� "�Է��Ͻ� ������ �����ϴ�. ���α׷��� �����մϴ�"
		// ��� �� ���α׷� ���� //���� �Է� : 5�� 7, �����ȣ : * ,������ 5*7 = 35
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();
		System.out.println("���� ��ȣ �Է� : ");
		char op = sc.next().charAt(0);
		int result = 0;

		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			break;
		case '%':
			result = num1 % num2;
			break;
		default:
			System.out.println("�Է��Ͻ� ������ �����ϴ�. ���α׷��� �����մϴ�");
			return; // return�� ���� ��ȯ�ϴ� �Լ��� ���� �޼ҵ带 �����ϸ� ��ȯ�Ѵ�.
		}
		System.out.println("���� ��� : " + num1 +" "+ op +" "+ num2 +" = " 
		+ result );

	}
}