package Lecture32;

import Lecture31.IntersectionOfLL.ListNode;

public class CycleDetectionLL {

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

	public boolean hasCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast =  fast.next.next;
			if(slow == fast) {//cycle 
				return true;
			}
		}
		return false;
	}

}
