package java_200_middle;

public class _36 {

	public static String textInfor(int index, double value) {
		String result = "";
		switch(index) {
		case 23:result = "��ü ���� : ";break;
		case 28:result = "���� ���� : ";break;
		case 33:result = "���� ���� : ";break;
		}
		return result + (value*100);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = 23;
		double value = 0.86;
		String st=textInfor(index, value); // �޼��� ȣ��
		System.out.println(st);
	}

}
