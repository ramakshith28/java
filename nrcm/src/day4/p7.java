package day4;

public class p7 {
	int x;
	int y;
	public p7(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public p7(p7 t) {
		this.x=t.x;
		this.y=t.y;
		System.out.println(x*y);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p7 t1=new p7(43,20);
		p7 t2= new p7(t1);
		
	}

}
