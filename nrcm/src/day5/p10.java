package day5;
interface i1{
	void add();
	void sub();
}
public class p10 implements i1 {
	public void add() {
		System.out.println("Hey");
		
	}
	public void sub() {
		System.out.println("Bro");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p10 p= new p10();
		p.add();
		p.sub(); 
	}

}
