package example.review;

import java.util.Scanner;

public class Review {
	public void method1() {
		// char <-> int
		int num = 'A';
		System.out.println("num : " + num); // 65

		char ch = 66;
		// char ch2 = -66;
		System.out.println("ch : " + ch); // B

		char ch2 = (char) num;
		System.out.println("ch2 : " + ch2); // A

		// int�� long ����

		int inum = 4;
		long lnum = 8L;

		int sum = inum + (int) lnum;
		sum = (int) (inum + lnum);
		long sum2 = inum + lnum;

		System.out.println("sum : " + sum);
		System.out.println("sum2 : " + sum2);

		// byte�� shour�� ���� ��� : int
		byte bnum = 1;
		short snum = 2;

		short sum3 = (short) (bnum + snum);
		int sum4 = bnum + snum;

		System.out.println("sum3 : " + sum3);
		System.out.println("sum4 : " + sum4);
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		String result = num > 0 ? "�����" : num == 0 ? "0�̴�" : "������";
		System.out.println(result);
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �̸� �Է� : ");
		String fruit = sc.nextLine();

		int price = 0;
		switch (fruit) {
		case "��":
			price = 500;
			break;
		case "���":
			price = 1000;
			break;
		case "�ٳ���":
			price = 2000;
			break;
		default:
			System.out.println("�ش��ϴ� ������ �����ϴ�.");
		}
		System.out.println(fruit + "�� ������ " + price + "�� �Դϴ�.");
	}

	public void method4() {
		// ��ø �ݺ��� ������
		// for��
		for (int i = 2; i < 10; i++) {
			System.out.println("=====" + i + "�� =====");
			for (int j = 2; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}
		int i = 2;
		while (i < 10) {
			System.out.println("=====" + i + "�� =====");
			int j = 2;
			while (j < 10) {
				System.out.println(i + " X " + j + " = " + i * j);
				j++;
			}
			i++;
		}

	}
}
