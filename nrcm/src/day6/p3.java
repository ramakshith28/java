package day6;

public class p3 {
	void show() {
		System.out.println("hello");
	}
	class test{
		void dis() {
			System.out.println("Hey");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p3 d=new p3();
		p3.test t= new p3().new test();
		d.show();
		t.dis();
		
	}

}
