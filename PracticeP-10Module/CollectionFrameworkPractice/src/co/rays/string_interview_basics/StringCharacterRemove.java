package co.rays.string_interview_basics;

public class StringCharacterRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Progrmming";
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			int index = s1.indexOf(ch, i + 1);
			if (index == -1) {
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}

}
