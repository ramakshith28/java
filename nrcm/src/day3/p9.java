package day3;

public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {23,45,67,8,9,99};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("Min: "+min);
		int b[]= {23,45,67,8,9,99};
		int max=a[0];
		for(int j=0;j<b.length;j++) {
			if(max<b[j]) {
				max=b[j];
			}
		}
		System.out.println("Max: "+max);
	}

}
