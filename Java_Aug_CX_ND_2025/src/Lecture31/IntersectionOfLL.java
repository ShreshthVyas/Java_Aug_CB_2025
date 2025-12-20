package Lecture31;

import Lecture31.LLReverseIterative.ListNode;

public class IntersectionOfLL {

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
	
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	       int lenA = length(headA);
	       int lenB = length(headB);
	       int extra = Math.abs(lenA -lenB);
	       
	       if(lenA>lenB) {
	    	   while(extra>0) {
	    		   headA=  headA.next;
	    		   extra--;
	    	   }
	       }
	       else {
	    	   while(extra>0) {
	    		   headB=  headB.next;
	    		   extra--;
	    	   }
	       }
	       
	       while(headA!=null) {
	    	   if(headA == headB) {// intersection found
	    		   return headA;
	    	   }
	    	   headA = headA.next;
	    	   headB = headB.next;
	       }
	       
	       return null;
	       
	 }

	private int length(ListNode head) {
		// TODO Auto-generated method stub
		int count =0;
		ListNode temp = head;
		while(temp!=null) {
			count++;
			temp = temp.next;	
		}
		return count;
	}

}
