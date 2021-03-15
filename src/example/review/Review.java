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

		// int와 long 연산

		int inum = 4;
		long lnum = 8L;

		int sum = inum + (int) lnum;
		sum = (int) (inum + lnum);
		long sum2 = inum + lnum;

		System.out.println("sum : " + sum);
		System.out.println("sum2 : " + sum2);

		// byte와 shour의 연산 결과 : int
		byte bnum = 1;
		short snum = 2;

		short sum3 = (short) (bnum + snum);
		int sum4 = bnum + snum;

		System.out.println("sum3 : " + sum3);
		System.out.println("sum4 : " + sum4);
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		String result = num > 0 ? "양수다" : num == 0 ? "0이다" : "음수다";
		System.out.println(result);
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("과일 이름 입력 : ");
		String fruit = sc.nextLine();

		int price = 0;
		switch (fruit) {
		case "귤":
			price = 500;
			break;
		case "사과":
			price = 1000;
			break;
		case "바나나":
			price = 2000;
			break;
		default:
			System.out.println("해당하는 과일이 없습니다.");
		}
		System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
	}

	public void method4() {
		// 중첩 반복문 구구단
		// for문
		for (int i = 2; i < 10; i++) {
			System.out.println("=====" + i + "단 =====");
			for (int j = 2; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}
		int i = 2;
		while (i < 10) {
			System.out.println("=====" + i + "단 =====");
			int j = 2;
			while (j < 10) {
				System.out.println(i + " X " + j + " = " + i * j);
				j++;
			}
			i++;
		}
	}

	public void method5() {
		// 분기문을 이용한 중첩 반복문 구구단

		// for문 (2,4,6,8단)
		for (int i = 2; i < 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println("=====" + i + "단 =====");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}

		// while문으로 구구단의 홀수곱 구하기
		int i = 2;
		while (i < 10) {
			System.out.println("=====" + i + "단 =====");
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

		// 얕은 복사
		int[] copyArr = originArr;

		// 깊은 복사for문
		int[] copyArr2 = new int[10];
		for (int i = 0; i < originArr.length; i++) {
			copyArr2[i] = originArr[i];
		}

		// 깊은 복사 arraycopy()
		int[] copyArr3 = new int[10];
		System.arraycopy(originArr, 0, copyArr3, 0, originArr.length);

		// 깊은 복사 Arrays.copyOf()
		int[] copyArr4 = Arrays.copyOf(originArr, originArr.length);

		System.out.println("===========변경 전===========");
		System.out.println("originArr : " + Arrays.toString(originArr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
		System.out.println("copyArr3 : " + Arrays.toString(copyArr3));
		System.out.println("copyArr4 : " + Arrays.toString(copyArr4));

		originArr[0] = 5;

		System.out.println("===========변경 후===========");
		System.out.println("originArr : " + Arrays.toString(originArr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
		System.out.println("copyArr3 : " + Arrays.toString(copyArr3));
		System.out.println("copyArr4 : " + Arrays.toString(copyArr4));

	}

	public void method7() {
		// 가변 배열
		int[][] arr = new int[2][];
		arr[0] = new int[4];
		arr[1] = new int[2];

		// 초기화
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
