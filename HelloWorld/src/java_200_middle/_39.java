package java_200_middle;

public class _39 {
	
	public static int toNum(char c) {
		int tot=0;
		switch(c) {
		case 'A': tot=1; break;
		case 'T': tot=10; break;
		case 'J': tot=11; break;
		case 'Q': tot=12; break;
		case 'K': tot=13; break;
		default: tot=c-'0'; break;
		// case에 있지 않더라도 c-'0'을 통해 가능
		// '0'은 정수로 48이다.
		}
		return tot;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'B';
		int result = toNum(c);
		System.out.printf("%c => %d\n",c,result);
	}

}
