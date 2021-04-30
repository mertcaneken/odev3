package odev3;

public class Main {

	public static void main(String[] args) {
		
		Instructor teacher1 = new Instructor();
		teacher1.setCertificates("MCT,PMP,ITIL");
		teacher1.setFirstName("Engin");
		teacher1.setLastName("Demiroð");
		teacher1.setEmail("engin@engin.com");
		
		Student student1 = new Student();
		student1.setCertificatesAchieved("Java, Python");
		
		User moderator1 = new User();
		moderator1.setId(1);
		moderator1.setFirstName("Mertcan");
		moderator1.setLastName("Eken");
		moderator1.setEmail("mertcaneken@gmail.com");
		
		User[] users = {teacher1, moderator1};
		
		UserManager userManager = new UserManager();
		userManager.addMultipleUsers(users);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCertificate("MCT");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addAchievedCertificate("Java, Python");
		
		
	}

}
