package java_200_middle;

public class _42 {
	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			double fahrenheit = 9.0 / 5 * i + 32;    //for 블록 변수
			// 정수 연산의 결과는 정수이므로 실수로 바꾸기 위해 숫자 하나를 실수로 바꿈 (9 -> 9.0)
			System.out.printf("섭씨 %d도= 화씨 %.2f도.\n",i,fahrenheit);
		}
	}

}
