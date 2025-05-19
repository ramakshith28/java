package day3;
//Literals....String Control Pool(SCP) and Heap memory
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hey";
		String s2="Hey";
		String s3= new String("Hey");
		String s4= new String("Gey");
		System.out.println(s1.equals(s2));//To check the original content
		System.out.println(s1==s2);
		System.out.println(s1==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s4));
		System.out.println(s3.compareTo(s4));
	}

}
