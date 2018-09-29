package java_200_middle;

public class _30 {
	static final int PHYSICAL = 23; // static 변수 생성 없이 사용
	//멤버 메서드(non static) 선언
	public double get_30(long days,int index,int max) {
		return max*Math.sin((days%index)*2*Math.PI/index);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days=1200;
		_30 bio = new _30(); // 객체를 생성
		//멤버 메서드 호출
		double phyval = bio.get_30(days, PHYSICAL, 100);
		System.out.printf("나의 신체 지수 %1$.2f입니다.\n",phyval);
	}
}
