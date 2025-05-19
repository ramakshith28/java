package day4p2;
import java.util.*;
public class emp {
 public void details() {
	 Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of employee: ");
		int e=sc.nextInt();
		for(int i=1;i<=e;i++) {
			System.out.println("Enter the Employee id: ");
			int eid=sc.nextInt();
			System.out.println("Enter the Employee name: ");
			String ename=sc.next();
			System.out.println("Enter the salary of the EMployee: ");
			double esal=sc.nextDouble();
 }
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp p= new emp();
		p.details();
			
			
		}
}


	
