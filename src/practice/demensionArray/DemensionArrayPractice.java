package practice.demensionArray;

import java.util.Arrays;
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
	public void method2() {
		Scanner sc = new Scanner(System.in); 
		char [][] arr = new char[5][5];
		while(true) {
			System.out.print("행 인덱스 입력 >> ");
			int x = sc.nextInt();
			System.out.print("열 인덱스 입력 >> ");
			int y = sc.nextInt();
			if(x < 0 || x >= 5 || y < 0 || y >= 5) {
				break;
			}
			arr[x][y] = 'X';			
			System.out.println("\t0\t1\t2\t3\t4");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(i+"\t");
				for(int j =0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}System.out.println("프로그램을 종료합니다.");
		
	}
	
}
