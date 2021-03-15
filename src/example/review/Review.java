package example.review;

import java.util.Arrays;
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

	public void method5() {
		// �б⹮�� �̿��� ��ø �ݺ��� ������

		// for�� (2,4,6,8��)
		for (int i = 2; i < 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println("=====" + i + "�� =====");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}

		// while������ �������� Ȧ���� ���ϱ�
		int i = 2;
		while (i < 10) {
			System.out.println("=====" + i + "�� =====");
			int j = 0;
			while (j < 10) {
				j++;
				if (j % 2 == 0) {
					continue;
				}
				System.out.println(i + " X " + j + " = " + i * j);
			}
			i++;
		}
	}

	public void method6() {
		int[] originArr = { 1, 2, 3, 4, 5 };

		// ���� ����
		int[] copyArr = originArr;

		// ���� ����for��
		int[] copyArr2 = new int[10];
		for (int i = 0; i < originArr.length; i++) {
			copyArr2[i] = originArr[i];
		}

		// ���� ���� arraycopy()
		int[] copyArr3 = new int[10];
		System.arraycopy(originArr, 0, copyArr3, 0, originArr.length);

		// ���� ���� Arrays.copyOf()
		int[] copyArr4 = Arrays.copyOf(originArr, originArr.length);

		System.out.println("===========���� ��===========");
		System.out.println("originArr : " + Arrays.toString(originArr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
		System.out.println("copyArr3 : " + Arrays.toString(copyArr3));
		System.out.println("copyArr4 : " + Arrays.toString(copyArr4));

		originArr[0] = 5;

		System.out.println("===========���� ��===========");
		System.out.println("originArr : " + Arrays.toString(originArr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
		System.out.println("copyArr3 : " + Arrays.toString(copyArr3));
		System.out.println("copyArr4 : " + Arrays.toString(copyArr4));

	}

	public void method7() {
		// ���� �迭
		int[][] arr = new int[2][];
		arr[0] = new int[4];
		arr[1] = new int[2];

		// �ʱ�ȭ
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		// ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
