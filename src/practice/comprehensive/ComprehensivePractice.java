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
			// ��� ĭ�� 0�� �Ǹ� ���� ����
//			boolean flag = false;
//			for (int i = 0; i < darr.length; i++) {
//				for (int j = 0; j < darr[i].length; j++) {
//					if (darr[i][j] != 0) {
//						flag = true;
//					}
//				}				
//			}
//			if (flag == false) {
//				break;
//			}	
			// 3���� �̸� ���� ����
			int bingoCnt = 0;
			int crossCnt1 = 0;
			int crossCnt2 = 0;

			for (int i = 0; i < darr.length; i++) {
				int colCnt = 0;
				int rowCnt = 0;
				for (int j = 0; j < darr[i].length; j++) {
					// ����
					if (darr[i][j] == 0) {
						rowCnt++;
					}
					// ����
					if (darr[j][i] == 0) {
						colCnt++;
					}
					//���ʿ��� ������ �Ʒ��� �밢��
					if(i == j && darr[i][j] == 0) {
						crossCnt1++;
					}
					if(i+j == num-1 && darr[i][j] == 0){
						crossCnt2++;
					}
				}
				//���� ������ ��� 0�̸� ����
				if(rowCnt == num) {
					bingoCnt++;
				}
				if(colCnt == num) {
					bingoCnt++;
				}
			}
			//���ʿ��� ������ �Ʒ��� �밢���� ��� 0�̸� ����
			if(crossCnt1 == num) {
				bingoCnt++;
			}
			//�����ʿ��� ���� �Ʒ��� �밢���� ��� 0�̸� ����
			if(crossCnt2 == num) {
				bingoCnt++;
			}
			
			//���� 3���̸� ���� ����
			if(bingoCnt == 3) {
				break;
			}

		}
		System.out.println("�� �� �� �� !!");
		System.out.println("=======���� ���� ����=======");
	}
}
