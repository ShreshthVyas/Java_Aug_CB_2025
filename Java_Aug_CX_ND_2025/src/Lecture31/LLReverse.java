package Lecture31;

import java.util.Stack;

import Lecture31.MiddleOFll.ListNode;

public class LLReverse {
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
		Stack<ListNode>  st = new Stack<>();
		
		while(head!=null) {
			st.push(head);
			head = head.next;
		}
		
		ListNode newHead = st.pop();
		ListNode temp = newHead;
		
		while(!st.isEmpty()) {
			temp.next = st.pop();
			temp = temp.next;
		}
		temp.next = null;
		return newHead;
	}

}
