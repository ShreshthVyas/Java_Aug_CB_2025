package Lecture27;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q= new Queue();
		q.Enqueu(10);
		q.Enqueu(20);
		q.Enqueu(30);
		q.Enqueu(40);
		q.Enqueu(50);
		q.Display();
		q.Dequeue();
		q.Dequeue();
		q.Enqueu(100);
		q.Display();
	}

}
