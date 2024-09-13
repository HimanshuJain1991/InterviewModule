package co.rays.string_interview_basics;

public class ReverseEachWord {

	public static void main(String[] args) {
		String input="Java Code",output="";
		String [] words=input.split(" ");
		for (String word : words) {
			String reversed="";
			System.out.println(word);
			for(int i=word.length()-1;i>=0;i--) {
				reversed=reversed+word.charAt(i);
			}
			output=output+reversed+" ";
			
		}
		System.out.println(output.toUpperCase());

	}

}
