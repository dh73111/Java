package java_200_middle;

public class _29 {
	public static final int PHYSICAL = 23; // ���(����������)
	//static �޼��� ����
	public static double get_29(long days, int index, int max) {
		return max*Math.sin((days%index)*2*Math.PI/index);
	} // ���� ��ü ���� ���� ȣ���� �� �ִ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days = 1200;
		double phyval=get_29(days,PHYSICAL,100);
		System.out.printf("���� ��ü ���� %1$.2f�Դϴ�.\n",phyval);
	}
	// 28���� �Լ��� ����� ���
}
