package java_200_middle;

public class _41 {
	public boolean isLeapYear(int year){
		boolean isS=false;
		if( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
			// 윤년은 4의 배수지만 100의 배수는 아니며 400의 배수다.
			isS=true;
		}
		return isS;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_41 hc=new _41();
		// isLeapYear() 메서드는 static 메서드가 아닌 멤버 메서드이므로
		// 객체를 생성한 후 래퍼런스로 호출함
		System.out.println( hc.isLeapYear(2016));
	}

}
