package HwInheritance;

public class StudentManager extends UserManager {

	public void addStudent(Student student) {
		System.out.println("Added new student: " + student.getFirstName() + " " + student.getLastName() + ".");
	}

	public void deleteAStudent(Student student) {
		System.out.println("Deleted student: " + student.getFirstName() + " " + student.getLastName() + ".");
	}

	public void addEnrolledCourse(String courseName) {
		System.out.println(courseName + " kursuna enroll etdiniz.");
	}
}
