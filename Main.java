package Project_HW;

public class Main {

	public static void main(String[] args) {
		Student S1 = new Student("Sandesh" ,"Sandesh@gmail.com",45 );
		Student S2 = new Student("Shivam" ,"Sparta4775@gmail.com",25);
		
		Instructor I1 = new Instructor("Ins1","Ins1@gmail.com", 10);
		Instructor I2 = new Instructor("Ins2","Ins2@gmail.com", 7);
		
		Admin A1 = new Admin("Varun","Varun@growskill.com",07);
		
		I1.createCourse("Java");
		I1.createCourse("Python");
		
		I2.createCourse("Playwright");
		I2.createCourse("Appium");
		I2.createCourse("Hacking");
		
		S1.enrollCourse("Java");
		S1.enrollCourse("Playwright");
		//S1.enrollCourse("Hacking");
		
		S2.enrollCourse("Python");
		S2.enrollCourse("Appium");
		
		S1.displayWelcome();
		S1.viewProfile();
		
		S2.displayWelcome();
		S2.viewProfile();
		
		I1.displayWelcome();
		I1.viewProfile();
		
		I2.displayWelcome();
		I2.viewProfile();
		
		A1.displayWelcome();
		A1.viewProfile();
		
		S1.trackProgress();
		S2.trackProgress();
		
		A1.removeUser(S2);
		
		
		Course C1 = new Course("Python", 40 , 10);
		C1.showCourseDetails();
					
		Course C2 = new Course("Playwright", 30 , 20);
		C2.showCourseDetails();
		
		Course C3 = new Course("Hacking", 60 , 70);
		C3.showCourseDetails();
	}
}

