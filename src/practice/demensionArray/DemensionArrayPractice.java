package practice.demensionArray;

import java.util.Scanner;

public class DemensionArrayPractice {
	public void method1() {
		// �����迭 �ʱ�ȭ �� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ũ�� �Է� : ");
		char[][] arr = new char[sc.nextInt()][];
		char alpha = 'a';
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "���� ���� ũ�� �Է� : ");
			// ���� �迭���� �� ���� ���� ũ�⸦ �����Ҷ�
			arr[i] = new char[sc.nextInt()];
		}
		for (int i = 0; i < arr.length; i++) {
			for (char j = 0; j < arr[i].length; j++) {
				arr[i][j] = alpha++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
