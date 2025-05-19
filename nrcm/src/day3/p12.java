package day3;

abstract class p12 {
	abstract void add();
}
class demo extends p12{
	public void add() {
		System.out.println("hi");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d=new demo();
		d.add();
	}
	}
	

