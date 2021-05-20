package HwInheritance;

public class CourseManager {
	public void addCourse(Course course) {
		System.out.println("Added new course to system: " + course.getCourseName() + ", Price: " + course.getPrice()
				+ ", Duration: " + course.getDuration() + ".");
	}

	public void addMultipleCourse(Course[] courses) {
		for (Course course : courses) {
			System.out.println("Added new course to system: " + course.getCourseName() + ", Price: " + course.getPrice()
					+ ", Duration: " + course.getDuration() + ".");
		}
	}

	public void enrollingCourseByStudent(Student student, Course course) {
		int count = course.getEnrolledCount();
		course.setEnrolledCount(count + 1);
		System.out.println(student.getFirstName() + ", you have enrolled " + course.getCourseName() + " course.");
	}
}
