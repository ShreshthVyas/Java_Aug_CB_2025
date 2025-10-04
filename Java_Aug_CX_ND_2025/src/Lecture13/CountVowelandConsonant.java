package Lecture13;

public class CountVowelandConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aagdbdjbeeekdjndiiwkjnwdoookjndnaaau";
		
		int vowel = 0;
		int cons = 0;
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			if(isVowel(s.charAt(i))) {
				vowel++;
			}
			else {
				s+= s.charAt(i);
				cons++;
			}
		}
		System.out.println(vowel + "  " + cons);
	}

	public static boolean isVowel(char ch) {
		// TODO Auto-generated method stub
		if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

}
