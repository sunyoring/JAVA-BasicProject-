package example.variable;

import java.util.Scanner;

public class Variable {
	public void inintVariable() {
		//���� ����� ���ÿ� �ʱ�ȭ
		
		//����
		boolean isTrue = true;
		boolean isFalse = false;
		
		//���� : 2byte
		char ch = 'a'; // ''�̱� �����̼� ���
		//char ch2 = 'bc' //�ϳ��� ���ڸ� ���� ����
		
		//���ڿ� : ������ (�ּҰ��� ����)
		String str = "�ȳ��ϼ���" ; // ""���� �����̼� ���
		
		//������
		//������
		byte bnum = 1 ; //1byte
		short snum = 2 ; //2byte
		int inum = 4 ; // 4byte
		long lnum = 8L ; // 8yte 
		//�Ǽ���
		float fnum = 4.0f; // 4byte
		double dnum = 8.0; // 8byte
		
		//������ ����� �� ����ϱ�
		System.out.println("isTure�� �� : " + isTrue);
		System.out.println("isFalse�� �� : " + isFalse);

		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);

		
		System.out.println("bnum�� �� : " + bnum);
		System.out.println("snum�� �� : " + snum);
		System.out.println("inum�� �� : " + inum);
		System.out.println("lnum�� �� : " + lnum);
		
		System.out.println("fnum�� �� : " + fnum);
		System.out.println("dnum�� �� : " + dnum);
		
	}
	public void changeValue() {
		//������ ���� �׽�Ʈ
		String name;
		char gender;
		int age;
		double height;
		
		name = "���̳�";
		gender = 'F';
		age = 20 ;
		height = 170.5;
		
		System.out.println(name + "���� ��������");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
		
		//Ű����� ���� �Է¹޾� ������ ����� �� ��ȯ
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		System.out.print("������ �Է��ϼ��� : ");
		gender = sc.next().charAt(0);
		System.out.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ��� : ");
		height = sc.nextDouble();
		sc.close();	
		
		System.out.println(name + "���� ��������");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
		
	}
	public void testFinal() {
		int size; //����
		final int SIZE; //��� : �Ϲ������� �빮�ڷ� ǥ����

		size = 10;
		SIZE = 10;
		
		System.out.println("==== �� ���� �� ====");
		System.out.println("size : " + size);
		System.out.println("SIZE : " + SIZE);
		
		//������ �� ����
		size = 20;
		// SIZE = 20; ������ �߻�. ����� �ʱ�ȭ���� �ٸ� ������ �Է� �Ұ�
		System.out.println("==== �� ���� �� ====");
		System.out.println("size : " + size);
		System.out.println("SIZE : " + SIZE);
	}
}
