package Class;

import java.util.*;
public class Teacher {
	private String name;
	private String id;
	private String dept;
	private boolean gender;
	private float height;
	private float weight;
	private String webAddress;
	private String phone;
	private String courses;
	private String eMail;
	private static int mCount;
	private static int fCount;
	private String gender1;

	public Teacher() {
	}
	public Teacher(String name1, String id1, String dept1) {
		name = name1;
		id = id1;
		dept = dept1;
	}
	public Teacher(String name1, String id1, String dept1, 
	 String webAddress1, String phone1,
			String courses1, String eMail1) {
		Scanner scn = new Scanner(System.in);
		name = name1;
		id = id1;
		dept = dept1;	
		webAddress = webAddress1;
		phone = phone1;
		courses = courses1;
		eMail = eMail1;
		System.out.print("Height and Weight:");
		this.height = scn.nextFloat();
		this.weight = scn.nextFloat();
		System.out.print("Gender(1:Male 2:Female)");
		switch(scn.nextInt()){
		case 1:
			Teacher.mCount ++;
		    this.gender = true;
		    gender1 ="¨k";
		    break;
		case 2:		
		    this.gender = false;
		    Teacher.fCount ++;
		    gender1 ="¤k";
		    break;
		}
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

	public void setDept(String dept2) {
		dept = dept2;
	}

	public String getDept() {
		return dept;
	}

	public void setWebAddress(String webAddress2) {
		webAddress = webAddress2;
	}

	public String getWebAddress() {
		return webAddress;
	}
	public void setPhone(String phone2) {
		phone = phone2;
	}

	public String getPhone() {
		return phone;
	}
	public void setCourses(String courses2) {
		courses = courses2;
	}

	public String getCourses() {
		return courses;
	}
	public void setEMail(String eMail2) {
		eMail = eMail2;
	}

	public String getEMail() {
		return eMail;
	}
	public void setfCount(int fCount2) {
		fCount = fCount2;
	}

	public static int getfCount() {
		return fCount;
	}public void setmCount(int mCount2) {
		mCount = mCount2;
	}

	public static int getmCount() {
		return mCount;
	}public void setGender(String gender2) {
		gender1 = gender2;
	}

	public String getGender() {
		return gender1;
	}
	public void showAll() {
		System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- ");
		System.out.println("name: "+this.getName()+"\nid: "+this.getId()+"\nwebAddress: "+this.getWebAddress()+"\nphone: "+this.getPhone()+"\neMail: "+this.getEMail());
		System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- ");
	}
}
