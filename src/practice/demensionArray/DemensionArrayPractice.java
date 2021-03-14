package practice.demensionArray;

import java.util.Scanner;

public class DemensionArrayPractice {
	public void method1() {
		// 가변배열 초기화 및 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기 입력 : ");
		char[][] arr = new char[sc.nextInt()][];
		char alpha = 'a';
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "행의 열의 크기 입력 : ");
			// 이중 배열에서 각 행의 열의 크기를 선언할때
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
