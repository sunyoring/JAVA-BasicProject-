package example.array;

import java.util.Arrays;

public class Array {
	public void testArray() {
		//�迭 ���� : stack ���� ����, �ּҰ��� ������ ����
		boolean[] booleanArr;//���� �迭
		
		//�迭 �Ҵ� : heap�� ���� ����, ��¥ �����͸� ������ ����
		double[] doubleArr = new double[2];
		
		//�迭 �ʱ�ȭ
		//�ε��� �̿�
		doubleArr[0] = 100.123456;
		doubleArr[1] = Math.random();
		
		//0 <= Math.random() < 1 
		// random�޼ҵ�� 1���� 10������ ������ ��� ���Ѵٸ� !
		//0*10+1 <= (int)Math.random()*10 + 1 < 1* 10 +1
		
		//����� ���ÿ� �ʱ�ȭ
		String[] strArr = {"ġŲ", "����", "����"}; //ũ�Ⱑ3�� ��������, �� �ʱ�ȭ
		char[] charArr = new char[] {'a', 'b', 'c', 'd', 'e'};

		//for���� �̿��� �ʱ�ȭ
		int[] intArr = new int[6];
		for(int i=0; i < intArr.length; i++) {
			intArr[i] = i; 
		}
		
		//���
		//�ϳ��� �����ؼ� ����ϴ� ���
		for(int i = 0; i < doubleArr.length; i++) {
			System.out.println(doubleArr[i]);
		}
		for(int i =0; i <intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		//��ü ��� - String ��ü�� �̾ƿ��� ��
		System.out.println(Arrays.toString(strArr));
		System.out.println(Arrays.toString(charArr));		
	}
	public void testShallowCopy() {
		//���� ����
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		copyArr = originArr; //orugubArr�� �ּҰ��� copyArr�� ����
		
		//���� ��ü�� �����ϴ� ������ �ٲ�� copyArr�� ���� 5.
		System.out.println("=====���� ��=====");
		System.out.println(Arrays.toString(originArr));
		System.out.println(Arrays.toString(copyArr));
		
		originArr[2] = 100;
		
		System.out.println("=====���� ��=====");
		System.out.println(Arrays.toString(originArr));
		System.out.println(Arrays.toString(copyArr));
		
		System.out.println("=====�ּ� ��====="); //���������̹Ƿ� �ּҰ��� ȣ���.
		System.out.println(originArr);
		System.out.println(copyArr);
	}

}
