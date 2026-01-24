package Lecture40;

public class HashCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a =10;
		System.out.println(a.hashCode());
		Double dd = 2.2;
		Double df = 2.2;
		System.out.println(dd.hashCode());
		System.out.println(df.hashCode());
		
		String s = "ABSBSBS";
		System.out.println(s.hashCode());
		
		
	}

}
