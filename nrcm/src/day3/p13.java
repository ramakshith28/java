package day3;
abstract class p13{
	abstract void show();
	abstract void display();
	
}
class info extends p13 {
	public void show() {
		System.out.println("Java is a famous programming language");
	}
	public void display() {
		System.out.println("Java is most famous programming language");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
info d= new info();
d.show();
d.display();
	}

}
