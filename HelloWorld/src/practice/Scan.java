package practice;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name;
		int Math;
		
		System.out.println("�̸� ? ");
		name = sc.next();
		
		System.out.println("���� ? ");
		Math = sc.nextInt();
		
		System.out.println(name + ":"+Math);
	}

}
