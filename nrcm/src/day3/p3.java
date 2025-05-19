package day3;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Helloworld";
	    String v=" ",c=" ";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				v+=ch;
				
			}
			else if (ch>= 'a' && ch<='z') {
				c+=ch;
			}
		}
		System.out.println(v);
		System.out.println(c);

	}

}
