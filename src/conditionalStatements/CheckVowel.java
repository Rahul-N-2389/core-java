package conditionalStatements;


public class CheckVowel {
	public void numChecking(char alpha) {
		if (alpha=='a'|| alpha=='e'|| alpha=='i'|| alpha=='o'|| alpha=='u') {
			System.out.println(alpha +" :is a vowel");
		}else if (alpha=='A'|| alpha=='E'|| alpha=='I'|| alpha=='O'|| alpha=='U') {
			System.out.println(alpha +" :is a vowel");
		}else {
			System.out.println(alpha +" :is a Consonant");
		}
	}
	public static void main(String[] args) {
		CheckVowel obj = new CheckVowel();
		obj.numChecking('O');
	}

}
