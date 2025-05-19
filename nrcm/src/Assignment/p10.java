package Assignment;
interface i1{
	void vehicles();
}
interface i2{
	void cars();
}
interface i3{
	void bikes();
}
interface i4 extends i1,i2,i3{
	void planes();
}
class info1 implements i4{
	public void vehicles() {
		System.out.println("Vehicles are good");
	}
	public void cars() {
		System.out.println("Cars are lit");
	}
	public void bikes() {
		System.out.println("Bikes are lub");
	}
	public void planes() {
		System.out.println("Aeroplanes are expensive");
	}
}
public class p10 extends info1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p10 d=new p10();
		d.vehicles();
		d.cars();
		d.bikes();
		d.planes();
	}

}
