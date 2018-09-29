package java_200_middle;

public class _35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 99;
		temp = (temp%2==1)? temp*3+1 : temp/2;
		//삼항(?:) 연산자 - true : false
		System.out.println("계산 후 ="+temp);
	}

}
