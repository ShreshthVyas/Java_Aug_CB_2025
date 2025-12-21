package Lecture32;

import Lecture31.IntersectionOfLL.ListNode;

public class Merge2SortedList {

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

	public ListNode mergeTwoLists(ListNode A, ListNode B) {
		ListNode newhead = new ListNode(0);
		ListNode temp = newhead;
		
		while(A!=null && B!=null) {
			if(A.val<B.val) {
				temp.next = A;
				A = A.next;
			}
			else {
				temp.next = B;
				B =B.next;
			}
			temp = temp.next;
		}
		if(A!=null) {
			temp.next = A;
		}
		if(B!=null) {
			temp.next = B;
		}
		return newhead.next;
	}

}
