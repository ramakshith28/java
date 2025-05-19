package day5;
class car{
	void speed() {
		System.out.println("Top Speed:206kmph");
	}
}
class skoda extends car{
	void model() {
		System.out.println("Skoda Slavia");
	}
}
class engine extends skoda{
	void specs() {
		System.out.println("1.0 litre TSI Engine & 1.5 Litre TSI Engine");
	}
}
public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		engine t= new engine();
		t.speed();
		t.model();
		t.specs();

	}

}
