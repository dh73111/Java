package java_200_middle;

public class _42 {
	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			double fahrenheit = 9.0 / 5 * i + 32;    //for ��� ����
			// ���� ������ ����� �����̹Ƿ� �Ǽ��� �ٲٱ� ���� ���� �ϳ��� �Ǽ��� �ٲ� (9 -> 9.0)
			System.out.printf("���� %d��= ȭ�� %.2f��.\n",i,fahrenheit);
		}
	}

}
