package practice.demensionArray;

import java.util.Arrays;
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
	public void method2() {
		Scanner sc = new Scanner(System.in); 
		char [][] arr = new char[5][5];
		while(true) {
			System.out.print("�� �ε��� �Է� >> ");
			int x = sc.nextInt();
			System.out.print("�� �ε��� �Է� >> ");
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
		}System.out.println("���α׷��� �����մϴ�.");
		
	}
	
}
