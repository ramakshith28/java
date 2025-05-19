package day4;
class Fixedamount{
	public int fixedamt=10000;
}
abstract class withdraw{
	abstract void withDraw(int amt);
}
public class p1 extends withdraw{
	Fixedamount f1= new Fixedamount();
		
	void withDraw(int amt) {
		f1.fixedamt -= amt;
		System.out.println("Withdraw: "+amt);
		System.out.println("Available balance: "+f1.fixedamt);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amt= Integer.parseInt(args[0]);
		p1 d= new p1();
		d.withDraw(amt);

				


}
}

