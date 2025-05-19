package day2;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		if(n%2==0) {
			if(n%3==0) {
				System.out.println(+n+" is divisible by 6");
			}
			else {
				System.out.println("The given number is not divisible by 3");
			}
		
			
		}
		else {
			if(n<10) {
				System.out.println("Less than 10");
			}
			else {
				System.out.println("Greater than 10");
			}
		}
		
	}

}
