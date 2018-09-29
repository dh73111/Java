package java_200_middle;

public enum PEI_38 {
	PHYSICAL(23),EMOTIONAL(28),INTELLECTUAL(33);
	private final int peiValue; // 상수로 초기화를 안해도 생성자로 최기화 가능
	PEI_38(int pie){
		this.peiValue=pie;
	}
	public int getPei() {
		return peiValue;
	}
}