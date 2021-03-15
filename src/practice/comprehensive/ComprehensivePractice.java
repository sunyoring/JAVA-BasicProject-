package practice.comprehensive;

import java.util.Scanner;

public class ComprehensivePractice {
	public void method1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ ũ�� ���� : ");
		int num = sc.nextInt();

		int[] arr = new int[num * num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (num * num)) + 1;
			// �ߺ��� �߻��ϸ� j--
			// �� i+1�� �������� �ʰ� �ٽ� i�� ���� �� ���� �� �ߺ� ��
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		// ������ �迭 -> ������ �迭
		int[][] darr = new int[num][num];
		int index = 0;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				darr[i][j] = arr[index++];
			}
		}

		System.out.println("======= ���� ���� ���� =======");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(darr[i][j] + "\t");
			}
			System.out.println();
		}

		while (true) {
			System.out.print("���� ���� : ");
			int num2 = sc.nextInt();
			for (int i = 0; i < darr.length; i++) {
				for (int j = 0; j < darr[i].length; j++) {
					if (darr[i][j] == num2) {
						darr[i][j] = 0;
					}
				}
			}
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					System.out.print(darr[i][j] + "\t");
				}
				System.out.println();
			}

			// ���� ���� ���� Ȯ��
			boolean flag = false;
			for (int i = 0; i < darr.length; i++) {
				for (int j = 0; j < darr[i].length; j++) {
					if (darr[i][j] != 0) {
						flag = true;
					}
				}				
			}
			if (flag == false) {
				break;
			}	
		}
		System.out.println("�� �� �� �� !!");
		System.out.println("=======���� ���� ����=======");	 
	}
}
