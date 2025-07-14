package Project_HW;

abstract class User {
	 private String name;
	 private String email;
	 private int userid;
	 
	 public String getName() {
	 return name;
	}
	 public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	
	User(String name ,String email ,  int userid ) {
		this.name = name;
		this.email = email;
		this.userid = userid;
	}
	
	abstract void viewProfile();
	
	final void displayWelcome() 
	{
		System.out.println("Welcome to the LMS by Shivam - ");
		System.out.println();
	}

}
