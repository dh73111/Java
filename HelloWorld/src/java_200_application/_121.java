package java_200_application;

public class _121 {
	public static void AnInvertedTriangle(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++)
				System.out.print(" ");
			for(int k=0;k<2*(n-i)-1;k++)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnInvertedTriangle(5);
	}

}
