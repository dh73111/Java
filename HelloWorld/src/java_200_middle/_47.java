package java_200_middle;

public class _47 {
	public static void main(String[] args) {
		int range=10;
		int start=1;
		int a=0, b=0, c=0;
		while(!(a!=b && b!=c && c!=a)){
			// !(not)은 true를 false로, false를 true로 만든다.
			// 또는 while( a==b || b==c || c==a )와 동일
			a=(int)(range*Math.random()+start);
			b=(int)(range*Math.random()+start);
			c=(int)(range*Math.random()+start);
		}
        System.out.printf("%d\t%d\t%d",a,b,c);
	}

}
