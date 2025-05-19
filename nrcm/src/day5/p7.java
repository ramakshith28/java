package day5;
public class fruits{
	void apple() {
		System.out.println("Apple keeps a doctor away");
	}
}
class typ1 extends fruits{
	void jamkai() {
		System.out.println("Jamkai is good for both mental and physical health");
	}
}
class typ2 extends fruits{
	void bathai() {
		System.out.println("Bathaiii......Tiyyyaaaka ga undhi");
	}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		typ2 t2 =new typ2();
		typ1 t1= new typ1();
		t1.jamkai();
		t2.bathai();
		t1.apple();

	}
	}
	


