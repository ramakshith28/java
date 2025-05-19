package day6;
class Sample76{
	static void show() {
		System.out.println("hi");
	}
	static class test89{
		static void print() {
			System.out.println("babuu");
			show();
		
		}
	}
}
public class p5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample76.test89.print();
	}

}
