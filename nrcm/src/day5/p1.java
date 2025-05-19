package day5;
class animal{
	void sleep() {
		System.out.println("sleeping");
	}
	
}
class dog extends animal{
	void bark() {
		System.out.println("Dog is barking");
	}
}
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d=new dog();
		d.bark();
		d.sleep();
	}

}
