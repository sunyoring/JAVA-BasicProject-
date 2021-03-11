package example.conditional;

import java.util.Scanner;

public class Conditional {
	public void tesIf() {
		int kor = 70;
		int math = 55;
		int eng = 68;

		int sum = kor + math + eng;
		double avg = sum / 3.0;

		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);

		// if
		if (avg >= 60) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
		// if - else if - else
		if (avg >= 60) {
			System.out.println("�հ�");
		} else if (avg >= 40) {
			System.out.println("���� ����");
		} else {
			System.out.println("���հ�");
		}
		// ��ø if��
		String grade = "";
		if (kor >= 80) {
			grade = "A";
			if (kor >= 95) {
				grade += "+";
			} else if (kor >= 85) {
				grade += "0";
			} else {
				grade += "-";
			}
		} else if (kor >= 60) {
			grade = "B";
			// 75�� �̻��̸� B+, 65�� �̻��̸� B0, 55�� ������ B-
			if (kor >= 75) {
				grade += "+";
			} else if (kor >= 65) {
				grade += "0";
			} else {
				grade += "-";
			}
		} else {
			grade = "C"; // 55�� �̻��̸� C+, 45�� �̻��̸� C0, ������ C-
			if (kor >= 55) {
				grade += "+";
			} else if (kor >= 45) {
				grade += "0";
			} else {
				grade += "-";
			}
		}
		System.out.println("���� ������ " + grade + " �Դϴ�.");
	}
	public void testSwitch() {
		//switch��
		//����, ����, ���ڿ� ���� (����ġ���� �Ұ�ȣ)
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �̸� �Է� : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		switch(fruit) {
		case "��" :
			price = 500;
			break;
		case "���" :
			price = 1000;
			break;
		case "�ٳ���" :
			price = 2000;
			break;
		default :
			System.out.println("�ش��ϴ� ������ �����ϴ�.");
			break;			
		}
		System.out.println(fruit + "�� ������ " + price + "�� �Դϴ�.");
	}
}
