package Lecture30;

public class LLClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist ll = new Linkedlist();
		ll.addFirst(10);
		ll.addlast(20);
		ll.addlast(30);
		ll.addlast(40);
		ll.addlast(50);
		ll.addFirst(100);
		ll.Display();
		ll.addatIdx(200, 3);
		ll.Display();
//		ll.removefirst();
//		ll.removelast();
		ll.removeAtIdx(3);
		ll.Display();
		System.out.println(ll.linearsearch(20));
	}

}
