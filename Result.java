package algorithm;

public class Result {
	
	public ListNode head;
	public ListNode tail;
	
	public Result() {
		this.head = new ListNode();
		this.tail = head;
	}
	
	public void append(int val) {
		ListNode newNode = new ListNode(val);
		this.tail.next = newNode;
		this.tail = newNode;
	}
	
	

}
