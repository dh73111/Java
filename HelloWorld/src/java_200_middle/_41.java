package java_200_middle;

public class _41 {
	public boolean isLeapYear(int year){
		boolean isS=false;
		if( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
			// ������ 4�� ������� 100�� ����� �ƴϸ� 400�� �����.
			isS=true;
		}
		return isS;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_41 hc=new _41();
		// isLeapYear() �޼���� static �޼��尡 �ƴ� ��� �޼����̹Ƿ�
		// ��ü�� ������ �� ���۷����� ȣ����
		System.out.println( hc.isLeapYear(2016));
	}

}
