package Lecture16;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("hello");
//		long start =  System.nanoTime();
//		for (int i = 1; i <=2000000; i++) {
//			sb.append(i);
//		}
//		long end =  System.nanoTime();
//		System.out.println(end-start);
//		System.out.println(sb.toString());
		
		
		sb.append("hello");
		System.out.println(sb);
//		sb.append("hello");
//		sb.append("hello");
//		sb.append("hello");
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
		
		System.out.println(sb.charAt(1));
		
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		
			
		}
		
		
	}


