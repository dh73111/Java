package java_200_middle;

public class _30 {
	static final int PHYSICAL = 23; // static ���� ���� ���� ���
	//��� �޼���(non static) ����
	public double get_30(long days,int index,int max) {
		return max*Math.sin((days%index)*2*Math.PI/index);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days=1200;
		_30 bio = new _30(); // ��ü�� ����
		//��� �޼��� ȣ��
		double phyval = bio.get_30(days, PHYSICAL, 100);
		System.out.printf("���� ��ü ���� %1$.2f�Դϴ�.\n",phyval);
	}
}
