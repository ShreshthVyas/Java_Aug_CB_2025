package Lecture31;

import Lecture31.LLReverseRecusrsive.ListNode;

public class LLReverseIterative {

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

	public ListNode reverseList(ListNode head) {
		if(head ==null) {
			return null;
		}
		ListNode curr = head;
		ListNode prev = null;
		
		while(curr!=null) {
			ListNode temp = curr.next;
			curr.next = prev;//link reverse
			prev =curr;
			curr = temp;
		}
		return prev;
	}

}
