package java_200_middle;

public class _28 {
	public static final int PHYSICAL = 23;
	// static final ��� ���� + �ڷ��� + �����̸�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = PHYSICAL;
		int days = 1200;
		double phyval = 100*Math.sin((days % index)*2*Math.PI/index);
		//�ﰢ�Լ� sin ���
		System.out.printf("���� ��ü ���� %1$.2f�Դϴ�.",phyval);
		//Math.PI-����,3.14  |  Math.E-�������� 
		//$�� ������ ������ ���Ƿ� �����ְ� ���� ��($���� ���ڴ� ���� ���� ���� 2$��� �ι�° ���ڸ� ����Ų��.
	}
}
