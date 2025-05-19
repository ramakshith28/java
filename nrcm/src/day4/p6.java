package day4;

public class p6 {
	int a=30;
	int b=40;
	public p6
	(int x,int y) {
		x=a;
		y=b;
		System.out.println(x+y);
	}
	public void sub() {
		this.a=a;
		this.b=b;
		System.out.println(a-b);
	}
	

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		p6 d=new p6(40,30);
		d.sub();
		}

}
