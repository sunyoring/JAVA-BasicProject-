package practice.variable;

import java.util.Scanner;

public class VariablePractice {
	public void method1() {
		// ���� 1 �ʱ�ȭ �� �� ����
		int inum = 100;
		float dnum = 234.567f;
		char ch = 'A';
		String str = "Hello world";
		boolean bool = true;

		System.out.println("�ʱ�ȭ �� : " + inum + "," + dnum + "," + ch + "," + str + "," + bool);

		inum = 100000;
		dnum = 567.123465789f; // float�� ��ȿ�ڸ����� 7�ڸ� : 567.1235�� ��µ�.
		ch = 'B';
		str = "Welcome to JAVA";
		bool = false;

		System.out.println("�� ���� �� : " + inum + "," + dnum + "," + ch + "," + str + "," + bool);

	}

	public void method2() {
		// ���� 2 ���� �ѷ��� ���� ���ϱ�(�Ҽ��� �Ʒ� ���ڸ������� ǥ��)
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է� : ");
		int rad = sc.nextInt();
		double pi = 3.141592;
		sc.close();

//		System.out.println("�������� " + rad + "�� ���� �ѷ��� : " + 2*pi*rad);
//		System.out.println("�������� " + rad + "�� ���� ������ : " + pi*rad*rad);

		System.out.printf("�������� %d�� ���� �ѷ� : %.1f\n", rad, (2 * pi * rad));
		System.out.printf("�������� %d�� ���� ���� : %.1f\n", rad, (pi * rad * rad));

		// System.out.printf(%����,���� ��) :
		// ������ �ִ� ���Ŀ� ���缭 �� ���Ŀ� �´� ��(����)�� �ٹٲ����� �ʰ� ���
//		%d : ������, %o : 8����, %x : 16����
//		%c : ����, %s : ���ڿ�, %f : �Ǽ�(�Ҽ��� �Ʒ� 6�ڸ�), %e : ��������ǥ��
//		%g : ���� �� �״��, %A : 16���� �Ǽ�, %b : ����

		// ���Ĺ��
//		- %5d : 5ĭ�� Ȯ���ϰ� ������ ����
//		- %-5d : 5ĭ�� Ȯ���ϰ� ���� ����
//		- %.2f : �Ҽ��� �Ʒ� 2�ڸ������� ǥ��
	}

	public void method3() {
		// ���� 3 �л����� Ű(�Ǽ�)�� �Է¹ް� ���(����) ���ϱ�

		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �л��� Ű �Է� : ");
		double height1 = sc.nextDouble();
		System.out.print("�ι�° �л��� Ű �Է� : ");
		double height2 = sc.nextDouble();
		System.out.print("����° �л��� Ű �Է� : ");
		double height3 = sc.nextDouble();

		int avg = (int) (height1 + height2 + height3) / 3;
		System.out.println("��� Ű�� : " + avg);
	}

	public void method4() {
		// ���� 4 Ű����� ���̰� 5�� ���ڿ��� �Է¹޾� ������ ������ �����ڵ带 ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("���̰� 5�� ���ڿ��� �Է��Ͻÿ�.");
		String str5 = sc.nextLine();
		char ch = str5.charAt(0);
		int num = ch; // char -> int�� �ڵ� ����ȯ
		System.out.println(ch + " : " + num);

		// ���� ���� ���� �ѹ��� ����ϴ� ���
		System.out.println("������ ������ �����ڵ� ���� ? ");
		System.out.println(str5.charAt(0) + " : " + (int) str5.charAt(0));
		System.out.println(str5.charAt(1) + " : " + (int) str5.charAt(1));
		System.out.println(str5.charAt(2) + " : " + (int) str5.charAt(2));
		System.out.println(str5.charAt(3) + " : " + (int) str5.charAt(3));
		System.out.println(str5.charAt(4) + " : " + (int) str5.charAt(4));
	}

}
