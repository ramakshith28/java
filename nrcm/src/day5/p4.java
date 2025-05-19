package day5;
class movie{
	void mvname() {
		System.out.println("Hit 3");
	}
}
class hit extends movie{
	void genre() {
		System.out.println("Action thriller");
	}
}
class hero extends hit{
	void performance() {
		System.out.println("Super");
	}
}
class heroine extends hit{
	void looks() {
		System.out.println("Herione is beautiful");
	}
}
public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hero h1=new hero();
		heroine h2 = new heroine();
		h1.mvname();
		h1.genre();
		h1.performance();
		h2.looks();
		

	}

}
