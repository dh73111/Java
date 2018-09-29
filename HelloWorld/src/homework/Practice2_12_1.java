package homework;

import java.util.Scanner;

public class Practice2_12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산 >> ");
		int x = sc.nextInt();
		String y = sc.next();
		int z = sc.nextInt();
		
		if(y.equals("+"))
			System.out.println(x+y+z+"의 계산 결과는 "+ (x+z));
		else if(y.equals("-"))
			System.out.println(x+y+z+"의 계산 결과는 "+ (x-z));
		else if(y.equals("*"))
			System.out.println(x+y+z+"의 계산 결과는 "+ (x*z));
		else if(y.equals("/"))
			System.out.println(x+y+z+"의 계산 결과는 "+ (x/z));
		sc.close();
	}

}
