package example.repetitive;

import java.util.Scanner;

public class Repetitive {
	public void testFor() {
		// for(�ʱ��; ���ǽ�; ������)
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "�� ° ���");
		}
		// i�� ���ҽ�Ű�鼭
		for (int i = 10; i > 0; i--) {
			System.out.println(i + "�� ° ���");
		}
		// �������� �ݵ�� 1�� ������ �ʿ䰡 ����.
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i + "�� ° ���");
		}
		// int�� �ƴ� char�� �Է��ϸ�?
		for (char ch = 'a'; ch <= 'e'; ch++) {
			System.out.println(ch);
		}
	}

	public void testWhile() {
		// �ʱ�� : �ܺ�, ���ǽ� : �߰�ȣ, ������ : ����
		int i = 0;
		while (i < 10) { // ���ǽ�
			System.out.println(i + "�� ° i ���");
			i++;
		}
		// ������ ���
		int j = 10;
		while (j > 0) {
			System.out.println(j + "�� ° j ���");
			j--;
		}

		// ���� ���� : ���ǰ��� �׻� true�� ����.
		int k = 0;
		while (true) {
			System.out.println(k++ + "��° k ���");
		}
	}

	public void testDowhile() {
		// �ʱ�� : �ܺ�
		int i = 0;
		do {
			System.out.println(i++ + "��° i ���");
			// ������
		} while (i < 10); // ���ǽ��� �� ������, �����ݷ� ���

		// ���ҽ�
		int j = 10;
		do {
			System.out.println(j-- + "�� ° j���");

		} while (j > 0);

		// do - while �� ���� ����
		int k = 0;
		do {
			System.out.println(k++ + "�� ° k���");
		} while (true);
	}

	public void testGugudan() {
		// ��ø �ݺ��� ������
		// for��
		for (int i = 2; i < 10; i++) {
			System.out.println("==== " + i + "�� ====");
			for (int j = 1; j < 10; j++)
				System.out.println(i + " x " + j + " = " + i * j);
		}
		// while�� ����
		int i = 2;
		while (i < 10) {
			System.out.println("==== " + i + "�� ====");
			int j = 1;
			while (j < 10) {
				System.out.println(i + " x " + j + " = " + i * j);
				j++;
			}
			i++;
		}
	}

	public void testBreak() { // break�� ������ ���� ����� �ݺ����� �����Ѵ�.
		// ���ڸ� �Է� �޾� ���� ���ڸ�ŭ�� �ݺ������� ��� �� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݺ��� Ƚ�� �Է� : ");
		int num = sc.nextInt();

		int i = 1;
		while (true) {
			System.out.println(i + "��° i ���");
			if (i == num) {
				break;
			}
			i++;
		}
	}

	public void testFor2() {
		// �ʱ�� ���� for��
		int i = 0;
		for (; i < 10; i++) {
			System.out.println(i + "��° i ���");
		}
		// ���ǽ� ���� for��
		for (int j = 0;; j++) {
			if (j < 10) {
				System.out.println(j + "��° j ���");
			} else {
				break;
			}
		}
		// ������ ���� for��
		for (int k = 0; k < 10;) {
			System.out.println(k + "��° k ���");
			k++;
		}
		// ��� ����
		int l = 0;
		for (;;) {
			if (l < 10) {
				System.out.println(l + "��° l ���");
			} else {
				break;
			}
			l++;
		}
	}

	public void testContinue() {
		//1~100������ ��(3�� 5�� ��� ����)�� ���
		int sum = 0;
		for(int i = 1; i <=100; i++) {
			if(i % 3 == 0 || i % 5 ==0) {
				continue;
			}
			sum += i;
		}
		System.out.println("sum : " + sum);
		
		
		
		
		
		
		
		
		
		
		
	}

}
