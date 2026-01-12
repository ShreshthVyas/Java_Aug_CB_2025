package Lecture37;

public abstract class PaymentGateway {
	public int returnbal() {
		// TODO Auto-generated method stub
		return 10000;
	}
	
	public abstract void UPI();
	
	public abstract void CC();
	
	
	public static void main(String[] args) {
		PaymentGateway pg = new PaymentGateway() {

			@Override
			public void UPI() {
				// TODO Auto-generated method stub
				System.out.println("upi in pg");
			}

			@Override
			public void CC() {
				// TODO Auto-generated method stub
				System.out.println("upi in pg1");
			}
			
		};
		
		PaymentGateway pg1 = new PaymentGateway() {
			
			@Override
			public void UPI() {
				// TODO Auto-generated method stub
				System.out.println("Hi from pg1");
			}
			
			@Override
			public void CC() {
				// TODO Auto-generated method stub
				
			}
		};
		
		pg.UPI();
		pg1.UPI();
	}
}
