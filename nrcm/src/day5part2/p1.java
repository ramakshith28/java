package day5part2;


interface i1{
	void add();
	
}
interface i2{
	void sub();
}
public class p1 implements i1,i2 {
	public void add() {
		System.out.println("Hey");
		
	}
	public void sub() {
		System.out.println("Bro");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p1 p= new p1();
		p.add();
		p.sub(); 
	}

}
