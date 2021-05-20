package HwInheritance;

public class Course {
	private int id;
	private String duration;
	private String courseName;
	private String price;
	private int enrolledCount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getEnrolledCount() {
		return enrolledCount;
	}
	public void setEnrolledCount(int enrolledCount) {
		this.enrolledCount = enrolledCount;
	}
}
