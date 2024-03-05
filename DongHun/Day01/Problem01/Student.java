
public class Student {
	private String name; // 이름 
	private String no; // 학번 
	
	// constructor
	Student(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	
	// getter (name)
	public String getName() {
		return name;
	}
	
	// setter (name)
	public void setName(String name) {
		this.name = name;
	}
	
	// getter (no)
	public String getNo() {
		return no;
	}
	
	//setter (no)
	public void setNo(String no) {
		this.no = no;
	}
}
