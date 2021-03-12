package example.array;

import java.util.Arrays;

public class Array {
	public void testArray() {
		//배열 선언 : stack 공간 생성, 주소값을 가지고 있음
		boolean[] booleanArr;//논리형 배열
		
		//배열 할당 : heap에 공간 생성, 진짜 데이터를 가지고 있음
		double[] doubleArr = new double[2];
		
		//배열 초기화
		//인덱스 이용
		doubleArr[0] = 100.123456;
		doubleArr[1] = Math.random();
		
		//0 <= Math.random() < 1 
		// random메소드로 1부터 10까지의 정수를 얻기 위한다면 !
		//0*10+1 <= (int)Math.random()*10 + 1 < 1* 10 +1
		
		//선언과 동시에 초기화
		String[] strArr = {"치킨", "피자", "족발"}; //크기가3인 공간생성, 값 초기화
		char[] charArr = new char[] {'a', 'b', 'c', 'd', 'e'};

		//for문을 이용한 초기화
		int[] intArr = new int[6];
		for(int i=0; i < intArr.length; i++) {
			intArr[i] = i; 
		}
		
		//출력
		//하나식 접근해서 출력하는 방법
		for(int i = 0; i < doubleArr.length; i++) {
			System.out.println(doubleArr[i]);
		}
		for(int i =0; i <intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		//전체 출력 - String 자체로 뽑아오는 것
		System.out.println(Arrays.toString(strArr));
		System.out.println(Arrays.toString(charArr));		
	}
	public void testShallowCopy() {
		//얕은 복사
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		copyArr = originArr; //orugubArr의 주소값이 copyArr로 대입
		
		//같은 객체를 참조하는 것으로 바뀌어 copyArr은 길이 5.
		System.out.println("=====변경 전=====");
		System.out.println(Arrays.toString(originArr));
		System.out.println(Arrays.toString(copyArr));
		
		originArr[2] = 100;
		
		System.out.println("=====변경 후=====");
		System.out.println(Arrays.toString(originArr));
		System.out.println(Arrays.toString(copyArr));
		
		System.out.println("=====주소 값====="); //참조변수이므로 주소값이 호출됨.
		System.out.println(originArr);
		System.out.println(copyArr);
	}

}
