package java_200_middle;

public class _33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a1=123;
		double b1=456;
		double a2=789;
		double b2=654;
		
		_33_Geo geo1=new _33_Geo();
		//���� ��Ű���ȿ� �ִ� Ŭ������ ���ο� ��ü�� ����� ����
		geo1.a=a1;
		geo1.b=b1;
		System.out.println(geo1.a + "\t" + geo1.b);
		_33_Geo geo2=new _33_Geo();
		geo2.a=a2;
		geo2.b=b2;
		//��ü ����
		_33_Geo geo=geo1;
		System.out.println(geo2.a + "\t" + geo2.b);
		System.out.println(geo.a + "\t" + geo.b);
	}
}
