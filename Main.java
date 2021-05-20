package HwInheritance;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setId(0);
		instructor.setUserId(0);
		instructor.setEmail("engindemirog@gmail.com");

		Student student1 = new Student();
		student1.setFirstName("Haqverdi");
		student1.setLastName("Karimli");
		student1.setId(1);
		student1.setUserId(0);
		student1.setEmail("haqverdikarimli@gmail.com");

		Course course1 = new Course();
		course1.setId(0);
		course1.setCourseName("Yazılım Geliştirici Yetiştirme Kampı( C# + Angular)");
		course1.setDuration("2 month");
		course1.setPrice("Free");
		course1.setEnrolledCount(0);

		Course course2 = new Course();
		course2.setId(1);
		course2.setCourseName("Yazılım Geliştirici Yetiştirme Kampı(Java + React)");
		course2.setDuration("2 month");
		course2.setPrice("Free");
		course2.setEnrolledCount(0);

		Course[] courses = { course1, course2 };

		CourseManager courseManager = new CourseManager();
		courseManager.addMultipleCourse(courses);

		UserManager userManager = new UserManager();

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructor);
		userManager.add(instructor);
		instructorManager.addCourseInstructor(instructor, course1);
		instructorManager.deleteInstructor(instructor);
		instructorManager.deleteCourseInstructor(instructor, course1);

		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student1);
		userManager.add(student1);
		studentManager.deleteAStudent(student1);
		courseManager.enrollingCourseByStudent(student1, course2);
		courseManager.enrollingCourseByStudent(student1, course1);
		System.out.println(course2.getEnrolledCount());
		System.out.println(course1.getEnrolledCount());
	}

}
