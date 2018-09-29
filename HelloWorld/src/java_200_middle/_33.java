package java_200_middle;

public class _33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a1=123;
		double b1=456;
		double a2=789;
		double b2=654;
		
		_33_Geo geo1=new _33_Geo();
		//같은 패키지안에 있는 클래스는 새로운 객체를 만들어 접근
		geo1.a=a1;
		geo1.b=b1;
		System.out.println(geo1.a + "\t" + geo1.b);
		_33_Geo geo2=new _33_Geo();
		geo2.a=a2;
		geo2.b=b2;
		//객체 전달
		_33_Geo geo=geo1;
		System.out.println(geo2.a + "\t" + geo2.b);
		System.out.println(geo.a + "\t" + geo.b);
	}
}
