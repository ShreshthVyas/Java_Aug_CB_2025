package Lecture32;

import Lecture32.Merge2SortedList.ListNode;

public class MergeSortList {

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
	
	public ListNode sortList(ListNode head) {
		if(head==null || head.next == null) {
			return head;
		}
		ListNode mid = middleNode(head);
		ListNode sh = mid.next;
		mid.next = null;
		ListNode a = sortList(head);
		ListNode b = sortList(sh);
		
		return mergeTwoLists(a, b);
	}
	public ListNode middleNode(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		
		while(fast.next!=null && fast.next.next!=null ) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
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
