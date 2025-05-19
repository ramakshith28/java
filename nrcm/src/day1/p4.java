package day1;

public class p4 {
	static int r=10,l=30,b=40;
	int s=20;
	void arcircle() {
		System.out.println(3.14*r*r);
	}
	static void arrectanle()
	{
		System.out.println(l*b);
		
	}
	void arsquare() {
		System.out.println(s*s);
	}
	static void artrianle1() {
		int b=12,e=13;
		System.out.println(0.5*b*e);
	}
	public static void main(String[] args) {
		p4 q=new p4();
		q.arcircle();
		arrectanle();
		q.arsquare();
		artrianle1();
		
		

	}
	

}
