package day6;
class Test21{
	final void show() {
		System.out.println("Final, no one can access");
	}
}
public class p2 extends Test21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p2 d= new p2();
		d.show();

	}

}
