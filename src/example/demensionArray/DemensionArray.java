package example.demensionArray;

public class DemensionArray {
	public void testDemeensionArray() {
		//2���� �迭 ����
		int[][] arr;
		int[] arr2[];
		int arr3[][];
		
		//2���� �迭 �Ҵ� : new�����ڸ� ���� heap������ ��������.
		arr = new int[3][5];
		
		//���� ũ�� ���� ����
		//�� �ึ�� �ٸ� ���� ������ ������ ���� �� : ���� �迭
		arr2 = new int[2][];
		arr2[0]=new int[4];
		arr2[1]=new int[2];
		
		//2���� �迭�� ���� �� ����
		System.out.println(arr); //arr�� �ּ� ��
		System.out.println(arr[0]); //arr[0]�� �ּ� ��
		System.out.println(arr[0][0]); //���� ���� ����
		
		//2���� �迭 �ʱ�ȭ
		int num = 1;
		for(int i =0; i <arr2.length; i++) {
			for(int j=0; j <arr2[i].length; j++) {
				//arr2�� �����迭�̹Ƿ� arr2[0]�� 0,1,2,3���� ������
				//arr2[1]�� 0,1���� ������ => arr2[i].length �� ���� ���� ����ŭ �ݺ��ϴ� ����
			arr2[i][j]= num++;
			}
		}
		//2���� �迭 ���
		for(int i = 0; i <arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println(); //����  
		}
	}
}
