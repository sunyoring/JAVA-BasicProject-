package practice.repetitive;

import java.util.Scanner;

public class RepetitivePractice {
	public void method1() {
		// �Ƕ�̵� ��� ����� (����for���� �̿�)

		// �ܺ� for�� �� ����
		for (int i = 0; i < 4; i++) {
			// ���� for�� ĭ ����
			// ���� ���(3,2,1,0)
			for (int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			// �� ���
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ȧ�� �Է� : ");
		int num = sc.nextInt();

		// num�� 7�̶��
		// ��ܺ� �Ƕ�̵� 0~2��
		for (int i = 0; i < num / 2; i++) {
			// ���� ��� (3,2,1)
			for (int j = num / 2; j > i; j--) {
				System.out.print(" ");
			}
			// �� ���(1, 3, 5)
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		//�ϴܺ� ���Ƕ�̵� 3~6��
		for (int i = num / 2; i >= 0; i--) {
			// ���� ��� (0,1,2,3)
			for (int j = num / 2; j > i; j--) {
				System.out.print(" ");
			}
			// �� ���(7,5,3,1)
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void method3() {
		// ���ڿ� ���� �ݺ� �Է�
		Scanner sc = new Scanner(System.in);
		String result = "";
		while (true) {
			System.out.println("���ڿ�  �Է� : ");
			String str = sc.nextLine();
			if (str.equals("stop")) {
				System.out.println("��� : " + result);
				break;
			}
			result += str;
			System.out.println("��� : " + result);
		}

	}
}
