package day4;
class demo{
	public void add() {
		System.out.println("Hello");
	}
}
public class p9 extends demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p9 d=new p9();
		d.add();// we are trying to access the private method, so it is throwing error.
		
	}

}
