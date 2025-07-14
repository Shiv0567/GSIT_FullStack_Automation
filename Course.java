package Project_HW;

public class Course {
	private String title;
	private int durationInHours;
	private final int maxStudents;
	
	public String getTitle() {
		return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getDurationInHours() {
			return durationInHours;
		}
		public void setDurationInHours(int durationInHours) {
			this.durationInHours = durationInHours;
		}
		public int getMaxStudents() {
			return maxStudents;
		}
	
	Course(String title ,int durationInHours , int maxStudents )
	{
		this.maxStudents = maxStudents;
		this.title = title;
		this.durationInHours = durationInHours;
		}
	
	Course(String title)
	{
		this.maxStudents = 0;
		this.title = title;
	}
	
	void showCourseDetails(){
		System.out.println("--Welcome to the Course Profile--");
		System.out.println();
		System.out.println("Course Title: " + title);
        System.out.println("Duration in hours : " + durationInHours);
        System.out.println("Max Students: " + maxStudents);
        System.out.println();
	}
}
