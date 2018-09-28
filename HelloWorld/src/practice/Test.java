package practice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int num;
		Scanner sc = new Scanner(System.in);
		// System.in 은 입력한 값을 바이트 단위로 읽는 것을 뜻함.
		
		num = sc.nextInt();
		System.out.println(num);
		
		sc.nextLine();
		// 숫자를 받은 후 문자를 받으면 버퍼에 의해 제대로 작동 안됨
		// 버퍼를 지워야함.
		str = sc.next();
		System.out.println(str);
		
		sc.close(); // Scanner 를 끝내는 것이지만 안써도 무관
	}

}
