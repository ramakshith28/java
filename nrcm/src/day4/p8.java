package day4;

public class p8 {
	double x=586;
	double y=952;
	double
	z=780;
	public p8() {
		System.out.println("Welcome to my profile");
	}
	public p8(double x) {
		this.x=x;
		System.out.println("SSC marks: "+x);
	}
	public p8(double x, double y) {
		this.x=x;
		this.y=y;
		System.out.println("SSC and Inter marks: "+(x+y));
	}
	public p8(double x, double y,double z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println("SSC,Inter and B.tech marks: "
				+(x+y+z));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p8 d = new p8();
		p8 d1 =new p8(586);
		p8 d2 =new p8(586,952);
		p8 d3 =new p8(586,952,7);
		
	}

}
