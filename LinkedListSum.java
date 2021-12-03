package algorithm;

public class LinkedListSum {

	  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		    ListNode emptyNode = new ListNode(0);
	        ListNode currentNode = new ListNode(0);
	        int carry = 0;
	        ListNode result = currentNode;
	        System.out.print("***"+result.val);
	        while (emptyNode != l1 || emptyNode != l2) {
	            int sum = l1.val + l2.val + carry;
	            carry = sum / 10;
	            currentNode = (currentNode.next = new ListNode(sum %= 10));
	            l1 = null != l1.next ? l1.next : emptyNode;
	            l2 = null != l2.next ? l2.next : emptyNode;
	        }
	        if (carry == 1)
	            currentNode.next = new ListNode(carry);
	        return result.next;
	    }
	  
	public static void main(String[] args) {
		ListNode l1nextnext= new ListNode(3);
		ListNode l1next= new ListNode(4);
		l1next.setNext(l1nextnext);
		ListNode l1= new ListNode(2);
		l1.setNext(l1next);
		
		
		ListNode l2nextnext= new ListNode(4);
		ListNode l2next= new ListNode(6);
		l2next.setNext(l2nextnext);
		ListNode l2= new ListNode(5);
		l2.setNext(l2next);
		
		ListNode addTwo = addTwoNumbers(l1,l2);
		System.out.print(addTwo.val);
		System.out.print(addTwo.next.val);
		System.out.print(addTwo.next.next.val);
		
		
	}
	
	public static ListNode addTwo(ListNode node1,ListNode node2) {
		Result result = new Result();
		int carry =0;
		
		while(node1!= null || node2!= null) {
			int n1= (node1 == null) ? 0 : node1.val;
			int n2= (node2 == null) ? 0 : node2.val;
			int sum = n1+ n2 + carry;
			result.append(sum %10);
			carry = (sum > 9) ? 1 : 0;
			
			if(node1 !=null) {
				node1 = node1.next;
			}
			
			if(node2 !=null) {
				node2 = node2.next;
			}
			
			}
			
		if(carry > 0 ) {
				result.append(1);
			}
			
			return result.head.next;
		}

}
