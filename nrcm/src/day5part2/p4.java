package day5part2;
class sample45{
	public void add() {
		int a=10;
		int y=9;
		System.out.println(a+y);
	}
}

public class p4 extends sample45{
	void sub() {
		super.add();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p4 d=new p4();
		d.sub();
		
	}

}
