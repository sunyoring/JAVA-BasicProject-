package practice.repetitive;

import java.util.Scanner;

public class RepetitivePractice {
	public void method1() {
		// 피라미드 모양 별찍기 (이중for문을 이용)

		// 외부 for문 줄 조건
		for (int i = 0; i < 4; i++) {
			// 내부 for문 칸 조건
			// 공백 출력(3,2,1,0)
			for (int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			// 별 출력
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("홀수 입력 : ");
		int num = sc.nextInt();

		// num이 7이라면
		// 상단부 피라미드 0~2행
		for (int i = 0; i < num / 2; i++) {
			// 공백 출력 (3,2,1)
			for (int j = num / 2; j > i; j--) {
				System.out.print(" ");
			}
			// 별 출력(1, 3, 5)
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		//하단부 역피라미드 3~6행
		for (int i = num / 2; i >= 0; i--) {
			// 공백 출력 (0,1,2,3)
			for (int j = num / 2; j > i; j--) {
				System.out.print(" ");
			}
			// 별 출력(7,5,3,1)
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void method3() {
		// 문자열 무한 반복 입력
		Scanner sc = new Scanner(System.in);
		String result = "";
		while (true) {
			System.out.println("문자열  입력 : ");
			String str = sc.nextLine();
			if (str.equals("stop")) {
				System.out.println("결과 : " + result);
				break;
			}
			result += str;
			System.out.println("결과 : " + result);
		}
	}

	public void method4() {
		// 카페 주문 프로그램
		Scanner sc = new Scanner(System.in);

		// 메뉴별 주문량
		int ame = 0;
		int latte = 0;
		int vanilla = 0;

		// 무한반복
		while (true) {
			// 메뉴 출력
			System.out.println("====== 메뉴 ======");
			System.out.println("1.  아메리카노");
			System.out.println("2.  카페라떼");
			System.out.println("3.  바닐라라떼");
			System.out.println("================");

			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			System.out.print("수량 입력 : ");
			int amount = sc.nextInt();

			switch (menu) {
			case 1:
				ame += amount;
				break;
			case 2:
				latte += amount;
				break;
			case 3:
				vanilla += amount;
				break;
			default:
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
				continue;
			}

			System.out.print("추가 주문 하시겠습니까 ?(y/n) : ");
			char select = sc.next().charAt(0); // 무한반복 루트안에 있기때문에 n일경우만 구현해주면 된다.
			if (select == 'n' || select == 'N') {
				System.out.println("================");
				if (ame != 0) {
					System.out.println("아메리카노" + ame + "잔 : " + ame * 3500 + "원");
				}
				if (latte != 0) {
					System.out.println("카페라떼" + latte + "잔 : " + latte * 4100 + "원");
				}
				if (vanilla != 0) {
					System.out.println("바닐라라떼" + vanilla + "잔 : " + vanilla * 4300 + "원");
				}
				System.out.println("================");
				System.out.println("총액 : " + (ame * 3500 + latte * 4100 + vanilla * 4300) + "원");
				break;
			}
		}
	}
}
