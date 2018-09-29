package java_200_middle;



public class _38 {

	public static String textInfor(PEI_38 index, double value){
		String result = ""; // 초기화
		switch(index) {
			case PHYSICAL : result = "신체 지수 : ";break;
			case EMOTIONAL : result = "감정 지수 : ";break;
			case INTELLECTUAL : result = "지성 지수 : ";break;
			default : result = "미결정";break;
			}
		return result + (value*100);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PEI_38 index=PEI_38.PHYSICAL;
		double value = 0.86;
		System.out.println("신체 지수 주기값:" + index.getPei());
		String st=textInfor(index, value);
		System.out.println(st);
		System.out.println(index.ordinal());
		System.out.println(index.name());
		System.out.println(index);
		System.out.println(index.getPei());
	}
}
