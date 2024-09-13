package co.rays.string_interview_basics;

//WAP to find reverse of String
public class StringReverse {

	public static void main(String[] args) {
		String str = "Hello";
		String newString = "";
		char[] array1 = str.toCharArray();
		for (int i = array1.length - 1; i >= 0; i--) {
			newString = newString + array1[i];
		}
		System.out.println(newString);

	}

}
