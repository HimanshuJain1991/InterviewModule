package co.rays.string_interview;

public class ReverseOfEachWords {

	public static void main(String[] args) {
		String input="java.code";
		String output="";
		String words[]=input.split("\\.");
		for (String word : words) {
			String original="";
			//System.out.println(word);
			for(int i=word.length()-1;i>=0;i--) {
				original=original+word.charAt(i);
			}
		output=output+original+".";
		}
		System.out.println(output);

	}

}
