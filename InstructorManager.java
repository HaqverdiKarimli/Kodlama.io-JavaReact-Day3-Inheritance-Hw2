package HwInheritance;

public class InstructorManager extends UserManager {
	public void addInstructor(Instructor instructor) {
		System.out.println("Added new instructor: " + instructor.getFirstName() + " " + instructor.getLastName() + ".");
	}

	public void deleteInstructor(Instructor instructor) {
		System.out.println("Deleted instructor: " + instructor.getFirstName() + " " + instructor.getLastName() + ".");
	}

	public void addCourseInstructor(Instructor instructor, Course course) {
		System.out.println("Instructor: " + instructor.getFirstName() + ", your course: " + course.getCourseName()
				+ " added to system.");
	}

	public void deleteCourseInstructor(Instructor instructor, Course course) {
		System.out.println("Instructor: " + instructor.getFirstName() + ", your course: " + course.getCourseName()
				+ " deleted from system.");
	}
}
