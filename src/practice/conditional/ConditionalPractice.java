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
		String result ="";
	
		if ((num1 % 2 == 0) && (num2 % 2 == 0)) {
			result = "�� ���� ��� ¦���̴�.";
		} else if (num1 % 2 == 0 || num2 % 2 == 0) {
			result = "�� ���� �ϳ��� ¦���̰�, �ϳ��� Ȧ�� �̴�.";
		} else { 
			result = "�� ���� ��� Ȧ���̴�.";
		}
		System.out.println(result);
	}
}