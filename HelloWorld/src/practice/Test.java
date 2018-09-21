package practice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int num;
		Scanner sc = new Scanner(System.in);
		
		
		num = sc.nextInt();
		System.out.println(num);
		
		sc.nextLine();
		// 숫자를 받은 후 문자를 받으면 버퍼에 의해 제대로 작동 안됨
		// 버퍼를 지워야함.
		str = sc.next();
		System.out.println(str);
	}

}
