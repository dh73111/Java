package java_200_middle;



public class _38 {

	public static String textInfor(PEI_38 index, double value){
		String result = ""; // �ʱ�ȭ
		switch(index) {
			case PHYSICAL : result = "��ü ���� : ";break;
			case EMOTIONAL : result = "���� ���� : ";break;
			case INTELLECTUAL : result = "���� ���� : ";break;
			default : result = "�̰���";break;
			}
		return result + (value*100);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PEI_38 index=PEI_38.PHYSICAL;
		double value = 0.86;
		System.out.println("��ü ���� �ֱⰪ:" + index.getPei());
		String st=textInfor(index, value);
		System.out.println(st);
		System.out.println(index.ordinal());
		System.out.println(index.name());
		System.out.println(index);
		System.out.println(index.getPei());
	}
}
