package java_200_middle;

public class _32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a1=32.2165;
		double b1=123.32165;
		double a2=49.6548;
		double b2=456.12345;
		System.out.println(a1+"\t"+b1);
		// 실수 1차원 배열
		double[] c1 = {a1,b1};
		double[] c2 = {a1,b2};
		System.out.println(c1[0]+"\t"+c1[1]);
		//실수 2차원 배열
		double[][] c= {
				{a1,b1},
				{a2,b2}
		};
		System.out.println(c[0][0] + "\t" + c[0][1]);
	}

}
