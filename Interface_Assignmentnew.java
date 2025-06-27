package Interface_Method;

interface Person 
{
     void introduce() ;
}
interface Hobby
 {
	 void showhobby();
 }

class Student implements Person {
    String name;
    int grade;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

     public void introduce() {
        System.out.println("Hi, I'm " + name + ", and I study in grade " + grade + ".");
    }
}

class Teacher implements Person {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void introduce() {
        System.out.println("Hello, I'm Mr./Ms. " + name + ", and I teach " + subject + ".");
    }
}
 class Newchart implements Person,Hobby{
	 String name;
	 String hobby;
	 
	 Newchart(String name , String hobby){
		 this.name = name;
		 this.hobby = hobby;
	 }
	 public void showhobby() {
		 System.out.println("Hobby Introduction");
	 }
	
	 public void introduce() {
		 
	 System.out.println("Hello,There myself " + name + ", and  my hobby is " + hobby + ".");
 }
	 }
 
public class Interface_Assignmentnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person student = new Student("Shivam", 25);
		Person teacher = new Teacher("Sandesh", "Java");
		 student.introduce();
	     teacher.introduce();
	     Newchart S1 = new Newchart("Shivam" , "Cricket");
	     S1.showhobby();
	     S1.introduce();
}
}




        