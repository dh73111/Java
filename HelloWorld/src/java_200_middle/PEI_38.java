package java_200_middle;

public enum PEI_38 {
	PHYSICAL(23),EMOTIONAL(28),INTELLECTUAL(33);
	private final int peiValue; // ����� �ʱ�ȭ�� ���ص� �����ڷ� �ֱ�ȭ ����
	PEI_38(int pie){
		this.peiValue=pie;
	}
	public int getPei() {
		return peiValue;
	}
}