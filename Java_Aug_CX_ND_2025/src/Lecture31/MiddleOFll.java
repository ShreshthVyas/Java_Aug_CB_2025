package Lecture31;

public class MiddleOFll {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode middleNode(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

//	public ListNode middleNode(ListNode head) {
//		int count = 0;
//		ListNode temp = head;
//		
//		while(temp!=null) {
//			count++;
//			temp = temp.next;
//		}
//		int n = 0;
//		temp = head;
//		while(n<(count/2)) {
//			n++;
//			temp = temp.next;
//		}
//		return temp;
//	}
}
