package practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수인 양의 정수 입력 : ");
		int index = sc.nextInt();
		int[] num1 = new int[(int)index/2+1];

		
		for(int i = 0; i < num1.length; i++) {
			num1[i] = i+1; 
			System.out.print(num1[i]);
		}
		for(int j = (int)(index/2)-1; j>=0 ; j--) {
			System.out.print(num1[j]);
		}
		
	}
}
