package day5part2;
class sample12{
	int x=19;
	
}

public class p3 extends sample12  {
	void add() {
		int y=20;
		System.out.println(y+(super.x));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p3 d= new p3();
		d.add();
		
	}

}
