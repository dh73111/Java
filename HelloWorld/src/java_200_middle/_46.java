package java_200_middle;

public class _46 {
	public static void main(String[] args) {
		int range = 10;
		int start = 1;
		int a = 0, b = 0, c = 0;
		while(true){
			a=(int)(range*Math.random()+start);
			b=(int)(range*Math.random()+start);
			c=(int)(range*Math.random()+start);
			// Math.random() �Լ��� �������� ����(double)�� ��ȯ���ִ� �޼��� ��-0.2124454123
			// �׷��Ƿ� 10�� �����־� ����ó�� ��ȯ
			// 1�� ���ϴ°��� 1~10�� ������ ��� ���� ���� 0���Ͷ�� 1�� ���� �ʿ� ����.
			if(a != b && b != c && c != a) 
				break; 
			// while(true)������ ���ѹݺ��̹Ƿ� �ݵ�� ������ ���ǹ� �ʿ�
		}
        System.out.printf("%d\t%d\t%d",a,b,c);
	}

}
