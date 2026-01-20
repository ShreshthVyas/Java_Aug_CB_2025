package Lecture39;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedList {

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

	public ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
			@Override
			public int compare(ListNode o1, ListNode o2) {
				// TODO Auto-generated method stub
				return o1.val-o2.val;
			}
		});

		for (ListNode node:lists) {
			if(node!=null) {
				pq.add(node);
			}
		}
		ListNode dummyHead =  new ListNode();
		ListNode temp = dummyHead;
		while(!pq.isEmpty()) {
			ListNode n = pq.remove();
			temp.next  = n;
			temp = temp.next;
			
			if(n.next!=null) {
				pq.add(n.next);
			}
			
		}
		
		return dummyHead.next;
	}

}
