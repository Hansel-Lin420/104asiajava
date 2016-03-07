package Class;

import java.util.*;

public class Course {
	ArrayList<Teacher> teacher1 = new ArrayList<Teacher>();
	private String name, id, teacher;

	public Course() {
	}

	public Course(String name1, String id1, String teacher1) {
		Scanner scn = new Scanner(System.in);
		name = name1;
		id = id1;
		teacher = teacher1;
	}

	public void setName(String name2) {
		name = name2;
	}

	public String getName() {
		return name;
	}

	public void setId(String id2) {
		id = id2;
	}

	public String getId() {
		return id;
	}

	public void setTeacher(String teacher2) {
		teacher =teacher2;
		

	}

	public String getTeacher() {
			return teacher;
		
	}

	public void getCourse() {
		System.out.println("-- -- -- -- -- -- -- -- Course -- -- -- -- -- -- -- ");

		System.out.println(
				"course name: " + this.getName() + "\tcourse id: " + this.getId() + "\tteacher: " + this.getTeacher());
		System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- ");
	}
}
