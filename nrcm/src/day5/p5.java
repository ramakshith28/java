package day5;
class chocolate{
	void eat() {
		System.out.println("Eating....");
	}
}
class dark extends chocolate{
	void taste1() {
		System.out.println("Super test");
	}
}
class sweet extends chocolate{
	void taste2() {
		System.out.println("Excellent taste");
	}
}
class borban extends dark{
	void cost1() {
		System.out.println("120");
	}
	
}
class amul extends dark{
	void cost2() {
		System.out.println("122");
	}
}
class dairy extends sweet{
	void weight1() {
		System.out.println("20g");
	}
}
class kitkat extends sweet{
	void weight2() {
		System.out.println("30g");
	}
}
public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		borban b=new borban();
		amul a=new amul();
		dairy d=new dairy();
		kitkat k=new kitkat();
		d.weight1();
		d.taste2();
		k.weight2();
		k.eat();
		b.cost1();
		b.taste1();
		a.cost2();
	}

}
