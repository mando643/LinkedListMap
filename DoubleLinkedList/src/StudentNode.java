public class StudentNode {
	private String firstName;
	private Student student;
	private StudentNode next;
	private StudentNode prev;
	
	public StudentNode(String firstName, Student student) {
		this.firstName = firstName;
		this.student = student;
		this.next = null;
		this.prev = null;
	}

	public StudentNode getNext() {
		return next;
	}

	public void setNext(StudentNode next) {
		this.next = next;
	}
	
	public StudentNode getPrev() {
		return prev;
	}

	public void setPrev(StudentNode prev) {
		this.prev = prev;
	}

	public String getFirstName() {
		return firstName;
	}

	public Student getStudent() {
		return student;
	}
	
}
