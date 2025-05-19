package day3;

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="dog";
		String s2="god";
		
		int c=0;
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				for(int j=0;j<s2.length();j++) {
					char c1=s1.charAt(i);
					char c2=s2.charAt(j);
					if(c1==c2) {
						c++;
						break;
					}
				}
			}
		}
		if (c==s1.length()) {
			System.out.println("Anagram"+c);
		}
		else {
			System.out.println("Not an Anagram"+c);
		}
	}

}
