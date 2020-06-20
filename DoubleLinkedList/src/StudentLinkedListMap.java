
public class StudentLinkedListMap {
	private StudentNode head;
	
	public StudentLinkedListMap() {
		head = null;
	}
	
	public void addFirst(Student newStudent) {
		StudentNode newNode = new StudentNode(newStudent.getFirstName(), newStudent);
		newNode.setNext(head);	
		head = newNode;
	}
	
	public void addLast(Student newStudent) {
		StudentNode newNode = new StudentNode(newStudent.getFirstName(), newStudent);

		// If list is empty, set head to the new node
		if (head == null) {
			head = newNode;
			return;
		}

		// Walk through list--when loop is done, currentNode will be last item in list
		StudentNode currentNode = head;
		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		
		currentNode.setNext(newNode);
	}
	
	
	
	public Student find(String firstName) {
		StudentNode currentNode = head;
		
		while (currentNode != null) {
			if (currentNode.getFirstName().equalsIgnoreCase(firstName)) {
				return currentNode.getStudent();
			}
			
			currentNode = currentNode.getNext();
		}
		
		return null;
	}
	
	public Student getStudentAtIndex(int index) {
		if (index < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		StudentNode currentNode = head;
		int counter = 0;
		
		while (currentNode != null) {
			if (counter == index) {
				return currentNode.getStudent();
			}
			
			counter++;
			currentNode = currentNode.getNext();
		}
		
		throw new IndexOutOfBoundsException();
	}
	
	public void remove(String firstName) {
		StudentNode currentNode = head;
		StudentNode prevNode = null;
		
		while (currentNode != null) {
			if (currentNode.getFirstName().equalsIgnoreCase(firstName)) {
				if (currentNode == head) {
					head = currentNode.getNext();
				} else {
					prevNode.setNext(currentNode.getNext());
				}
			}
			
			prevNode = currentNode;
			currentNode = currentNode.getNext();
		}
	}
	
	public int count() {
		StudentNode currentNode = head;
		int counter = 0;
		
		while (currentNode != null) {
			counter++;
			currentNode = currentNode.getNext();
		}
		
		return counter;
	}
}
