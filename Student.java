package Project_HW;

class Student extends User implements ProgressTrackable {
	private String enrolledCourse1;
	private String enrolledCourse2;
	
	
	public String getEnrolledCourse1() {
		return enrolledCourse1;
	}
	public void setEnrolledCourse1(String enrolledCourse1) {
		this.enrolledCourse1 = enrolledCourse1;
	}
	public String getEnrolledCourse2() {
		return enrolledCourse2;
	}
	public void setEnrolledCourse2(String enrolledCourse2) {
		this.enrolledCourse2 = enrolledCourse2;
	} 
	
	Student(String name, String email, int userid) 
	{
		super(name, email, userid);
	}
	
	public void enrollCourse(String courseName) 
	{
		if (enrolledCourse1 == null) {
			this.enrolledCourse1 = courseName;}
		else if (enrolledCourse2 == null) {
			this.enrolledCourse2 = courseName;}
		else {
		     System.out.println("You cannot enroll in more than 2 courses !!");
		     System.out.println();
		        }
		    } 
	
	@Override
	
	void viewProfile() 
	{
		System.out.println("--Welcome to Student Feature--");
		System.out.println();
		System.out.println("The name of student is " + getName());
		System.out.println("The User id is " + getUserid());
		System.out.println("The email is " + getEmail());
		System.out.println("Courses enrolled are : " + enrolledCourse1 + " and " + enrolledCourse2);
		System.out.println();
} 
	
	public void trackProgress() 
	{
		System.out.println("--Progress Tracker--");
		System.out.println();
		System.out.println(getName() + " is tracking progress ");
		System.out.println();
	}
	

}

