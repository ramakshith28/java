package day2;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=91;
		 int d,sum=0;
		 while(n>0) {		 
			 d=n%10;
			 sum=sum+d;
			 n=n/10;
		 }
		 
		 if(sum==9) {
			 System.out.println( "The given number is divisible by 9");
		 }
		 else {
			 System.out.println("The given nuumber is not divisible by 9");
		 }
		 
	}
}
		 