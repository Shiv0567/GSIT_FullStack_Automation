package Project_HW;

class Instructor extends User {
	private String createdCourse1;
	private String createdCourse2;
	
	Instructor(String name, String email, int userid) {
		super(name, email, userid);
	}
	
	
	public String getCreatedCourse1() {
	return createdCourse1;
	}
	public void setCreatedCourse1(String createdCourse1) {
		this.createdCourse1 = createdCourse1;
	}
	public String getCreatedCourse2() {
		return createdCourse2;
	}
	public void setCreatedCourse2(String createdCourse2) {
		this.createdCourse2 = createdCourse2;
	}

	
	public void createCourse(String courseName) { // DOUBT
        if (createdCourse1 == null) {
            this.createdCourse1 = courseName;
        } else if (createdCourse2 == null) {
            this.createdCourse2 = courseName;
        } else {
            System.out.println("Cannot create more than 2 courses !!!");
            System.out.println();
        }
    }
	
	
	@Override
	void viewProfile() {
		 System.out.println("--- Instructor Profile ---");
		 System.out.println();
	     System.out.println("Name: " + getName());
	     System.out.println("Email: " + getEmail());
	     System.out.println("UserID: " + getUserid());
	     System.out.println("Courses Created: " +  createdCourse1 + " , " +  createdCourse2 );
	     System.out.println();
	}
	
}

