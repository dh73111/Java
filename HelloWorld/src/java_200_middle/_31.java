package java_200_middle;

//import sun.reflect.misc.FieldUtil;

public class _31 {

	public enum FRUIT{
		APPLE,BANANA,MANGO
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FRUIT pear = FRUIT.APPLE;
		FRUIT pear2 = FRUIT.MANGO;
		System.out.println(pear);
		System.out.println(pear.name());
		System.out.println(pear.ordinal());
		System.out.println(pear2.ordinal());
		FRUIT[]fruits=FRUIT.values();
		// value() 메소드는 열거 타입의 모든 열거 객체들을 배열로 만들어 리턴
		for(FRUIT fruit : fruits) {
			System.out.println(fruit);
		}
		System.out.println(fruits[0]);
		
	}

}
