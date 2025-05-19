package day1;

public class p2 {
	static int x=10,y=30;
	int a=20,b=50;
	void and() {
		System.out.println((a<b)&&(a>b));
	}
	void or() {
		System.out.println((x<y)||(x>y));
		
	}
	void not() {
		int p=66,q=69;
		System.out.println(!(p>
		q));
		
	}
			

	public static void main(String[] args) {
		p2 p=new p2();
		p.and();
		p.or();
		p.not();

	}

}
