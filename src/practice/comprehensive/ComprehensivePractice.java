package practice.comprehensive;

import java.util.Scanner;

public class ComprehensivePractice {
	public void method1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("빙고판 크기 지정 : ");
		int num = sc.nextInt();

		int[] arr = new int[num * num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (num * num)) + 1;
			// 중복이 발생하면 j--
			// 즉 i+1로 진행하지 않고 다시 i에 랜덤 값 대입 후 중복 비교
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		// 일차원 배열 -> 이차원 배열
		int[][] darr = new int[num][num];
		int index = 0;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				darr[i][j] = arr[index++];
			}
		}

		System.out.println("======= 빙고 게임 시작 =======");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(darr[i][j] + "\t");
			}
			System.out.println();
		}

		while (true) {
			System.out.print("숫자 선택 : ");
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

			// 게임 종료 조건 확인
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
		System.out.println("빙 고 완 성 !!");
		System.out.println("=======빙고 게임 종료=======");	 
	}
}
