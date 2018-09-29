package homework;

import java.util.Scanner;

public class Practice2_11_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("답을 입력하세요(1~12)>>");
		int x = sc.nextInt();
		//sc.nextLine();
		//String season = sc.next();
		
		if(x>=3 && x<=5)
			System.out.println("봄");
		else if(x>=6 && x<=8)
			System.out.println("여름");
		else if(x>=9 && x<=11)
			System.out.println("가을");
		else if(x==1 || x==2 || x==12)
			System.out.println("겨울");
		else
			System.out.println("번호를 잘못입력하셨습니다.");
	}
}
