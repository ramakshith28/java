package day4;

public class p3 {
	private String firstName;
	private String lastName;
	private String emailid;
	private long phonenumber;
	

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	public long getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p3 d= new p3();
		d.setFirstName("Ram");
		d.setLastName("Akshith");
		d.setEmailid("ramakshithlingam@gmail.com");
		d.setPhonenumber(9963219821l);
		System.out.println(d.getFirstName());
		System.out.println(d.getLastName() );
		System.out.println(d.getEmailid());
		System.out.println(d.getPhonenumber());
		
		

	}

}
