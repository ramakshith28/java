package day4;

public class p2 {
	private String firstName;
	private String lastName;
	private String emailid;
	private long phonenumber;
	
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setLastName(String ln) {
		lastName=ln;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setEmailid(String ei) {
		emailid=ei;
	}
	public void setPhoneNumber(long pn) {
		phonenumber=pn;
	}
	public String getEmailid() {
		return emailid;
	}
	public long getPhoneNumber() {
		return phonenumber;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p2 d=new p2();
		d.setFirstName("Sai");
		d.setLastName("Bhai");
		d.setEmailid("ramakshith21@gmail.com");
		d.setPhoneNumber(8328368792l);
		
		System.out.println(d.getFirstName());
		System.out.println(d.getLastName());
		System.out.println(d.getEmailid());
		System.out.println(d.getPhoneNumber());
	}

}
