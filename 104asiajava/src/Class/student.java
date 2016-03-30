package Class;

public class student {
	private String name;
	private String id;
	private String dept;
	

	public student() {
	}
	public student(String name1, String id1, String dept1) {
		name = name1;
		id = id1;
		dept = dept1;
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

	
	public void showAll() {
		System.out.println("-- -- -- -- -- -- -- -- Teacher -- -- -- -- -- -- -- ");
		System.out.println("name: "+this.getName()+"\tid: "+this.getId()+"\tdept: "+this.getDept());
		System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- ");
	}
}
		