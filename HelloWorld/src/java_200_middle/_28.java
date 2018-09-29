package java_200_middle;

public class _28 {
	public static final int PHYSICAL = 23;
	// static final 상수 선언 + 자료형 + 변수이름
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = PHYSICAL;
		int days = 1200;
		double phyval = 100*Math.sin((days % index)*2*Math.PI/index);
		//삼각함수 sin 사용
		System.out.printf("나의 신체 지수 %1$.2f입니다.",phyval);
		//Math.PI-파이,3.14  |  Math.E-지연지수 
		//$는 인자의 순서를 임의로 정해주고 싶을 때($앞의 숫자는 인자 순서 만약 2$라면 두번째 인자를 가리킨다.
	}
}
