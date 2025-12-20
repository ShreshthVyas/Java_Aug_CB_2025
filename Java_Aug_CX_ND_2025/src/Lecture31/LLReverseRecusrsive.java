package Lecture31;

import Lecture31.LLReverse.ListNode;

public class LLReverseRecusrsive {

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
		if(head == null) {
			return head;
		}
		ListNode newHead = reverse(null,head);
		return newHead;
	}

	private ListNode reverse(ListNode prev, ListNode curr) {
		// TODO Auto-generated method stub
		if(curr ==null) {// reached end of LL
			return prev;
		}
		ListNode temp = reverse(curr, curr.next);
		curr.next =prev;
		return temp;
	}

}
