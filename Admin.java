package Project_HW;

class Admin extends User {
	 public Admin(String name, String email, int userid) {
	 super(name, email, userid);
	}

	
	void removeUser(User user) {
		System.out.println("Admin removed user: " + user.getName());
		System.out.println();
	}


	@Override
	void viewProfile() {
		System.out.println("--Admin Module Started--");
		System.out.println();
		System.out.println("Name - " +getName());
		System.out.println();
		//System.out.println(getUserid());
		//System.out.println(getEmail());
}
}
