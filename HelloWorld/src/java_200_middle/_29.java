package java_200_middle;

public class _29 {
	public static final int PHYSICAL = 23; // 상수(개발자정의)
	//static 메서드 선언
	public static double get_29(long days, int index, int max) {
		return max*Math.sin((days%index)*2*Math.PI/index);
	} // 따로 객체 생성 없이 호출할 수 있다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days = 1200;
		double phyval=get_29(days,PHYSICAL,100);
		System.out.printf("나의 신체 지수 %1$.2f입니다.\n",phyval);
	}
	// 28번을 함수로 사용할 경우
}
