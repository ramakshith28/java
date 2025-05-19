package day3;

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Helloworld";
	    int c=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch =='l' ) {
				c++;
				
			}
		}
		System.out.println(c);
}
}
